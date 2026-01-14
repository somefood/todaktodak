package com.example.todaktodak.data

import java.time.LocalDate

object MessageRepository {
    private val messages = listOf(
        ComfortMessage(1, "오늘도 고생 많았어요.\n당신은 충분히 잘하고 있어요."),
        ComfortMessage(2, "힘든 하루였나요?\n잠시 쉬어가도 괜찮아요."),
        ComfortMessage(3, "작은 시작도 큰 걸음이에요.\n스스로를 칭찬해주세요."),
        ComfortMessage(4, "내일은 더 좋은 날이 될 거예요.\n오늘 하루도 수고했어요."),
        ComfortMessage(5, "완벽하지 않아도 괜찮아요.\n당신은 이미 충분해요."),
        ComfortMessage(6, "잠시 멈춰 서서\n깊게 숨을 쉬어보세요."),
        ComfortMessage(7, "당신의 노력을 알고 있어요.\n정말 잘하고 있어요."),
        ComfortMessage(8, "힘들 땐 쉬어가도 돼요.\n서두르지 않아도 괜찮아요."),
        ComfortMessage(9, "오늘 하루도 버텨내셨네요.\n스스로에게 토닥토닥."),
        ComfortMessage(10, "작은 성취도 성취예요.\n자신을 칭찬해주세요."),
        ComfortMessage(11, "지금 이 순간도\n당신은 최선을 다하고 있어요."),
        ComfortMessage(12, "실수해도 괜찮아요.\n그게 배움의 과정이니까요."),
        ComfortMessage(13, "당신은 혼자가 아니에요.\n함께 이겨낼 수 있어요."),
        ComfortMessage(14, "오늘은 쉬어도 괜찮아요.\n내일의 나를 위해서요."),
        ComfortMessage(15, "당신의 감정은 소중해요.\n느끼는 그대로를 인정해주세요."),
        ComfortMessage(16, "천천히 가도 괜찮아요.\n중요한 건 방향이에요."),
        ComfortMessage(17, "당신은 사랑받을 자격이 있어요.\n그대로의 모습으로요."),
        ComfortMessage(18, "오늘 하루도 잘 견뎌냈어요.\n정말 대단해요."),
        ComfortMessage(19, "작은 휴식도 휴식이에요.\n잠시 쉬어가세요."),
        ComfortMessage(20, "당신의 속도로 가세요.\n비교하지 마세요."),
        ComfortMessage(21, "지금 이 순간도\n당신은 소중해요."),
        ComfortMessage(22, "힘들 땐 도움을 청해도 돼요.\n그게 용기예요."),
        ComfortMessage(23, "오늘의 작은 진전도\n큰 변화의 시작이에요."),
        ComfortMessage(24, "당신은 이미 많이 왔어요.\n스스로를 자랑스러워하세요."),
        ComfortMessage(25, "실패는 끝이 아니에요.\n새로운 시작의 기회예요."),
        ComfortMessage(26, "당신의 존재만으로도\n세상은 더 나아져요."),
        ComfortMessage(27, "오늘 하루 수고했어요.\n푹 쉬고 내일 또 만나요."),
        ComfortMessage(28, "당신은 강해요.\n이겨낼 수 있어요."),
        ComfortMessage(29, "작은 기쁨을 찾아보세요.\n그게 삶의 의미예요."),
        ComfortMessage(30, "오늘도 살아있어 주셔서\n고마워요.")
    )

    fun getTodayMessage(): ComfortMessage {
        val today = LocalDate.now()
        val dayOfYear = today.dayOfYear
        val index = dayOfYear % messages.size
        return messages[index]
    }
}
