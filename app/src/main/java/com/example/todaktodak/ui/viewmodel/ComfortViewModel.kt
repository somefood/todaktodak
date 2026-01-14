package com.example.todaktodak.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.todaktodak.data.ComfortMessage
import com.example.todaktodak.data.MessageRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ComfortViewModel : ViewModel() {
    private val _todayMessage = MutableStateFlow(MessageRepository.getTodayMessage())
    val todayMessage: StateFlow<ComfortMessage> = _todayMessage.asStateFlow()
}
