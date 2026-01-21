package me.seokju.todaktodak.ui.viewmodel

import androidx.lifecycle.ViewModel
import me.seokju.todaktodak.data.ComfortMessage
import me.seokju.todaktodak.data.MessageRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ComfortViewModel : ViewModel() {
    private val _todayMessage = MutableStateFlow(MessageRepository.getTodayMessage())
    val todayMessage: StateFlow<ComfortMessage> = _todayMessage.asStateFlow()

    fun refreshMessage() {
        val currentId = _todayMessage.value.id
        _todayMessage.value = MessageRepository.getRandomMessage(currentId)
    }
}
