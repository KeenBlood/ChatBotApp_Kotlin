package com.example.chatbotapp

object DecisionTree {

    fun response (message_receiver: String): String
    {
        val random = (0..1).random()

        val message = message_receiver.toLowerCase()

        return when {
            message.contains("sistca") && message.contains("name") && message.contains("complete")-> {
                when (random) {
                    0 -> "The name is Adevenced Computing systems, with means Sistemas computacionais avançados in Portuguese"
                    1 -> "In Portuguese is Sistemas computacionais avançados"

                    else -> "error"
                }   }
            message.contains("sistca") && message.contains("extensive") -> {
                when (random) {
                    0 -> "The name is Sistemas computacionais avançados"
                    1 -> "Sistemas computacionais avançados"

                    else -> "error"
                }
            }
            message.contains("sistca") && message.contains("ects") -> {
                when (random) {
                    0 -> "6 ECTS"
                    1 -> "Is the result of 61-55!"

                    else -> "error"
                }
            }
            message.contains("sistca") && message.contains("hours") && message.contains("theoretical") -> {
                when (random) {
                    0 -> "2 weekly"
                    1 -> "It's just 2 hours weekly!"

                    else -> "error"
                }
            }
            message.contains("sistca") && message.contains("hours") && message.contains("practical") -> {
                when (random) {
                    0 -> "2 weekly"
                    1 -> "It's just 2 hours weekly!"

                    else -> "error"
                }
            }
            message.contains("sistca") && message.contains("exam") && message.contains("%") -> {
                when (random) {
                    0 -> "60% of the final grade"
                    1 -> "60% of the final grade. Keep studying!"

                    else -> "error"
                }
            }
            message.contains("sistca") && message.contains("exam") && message.contains("percentage") -> {
                when (random) {
                    0 -> "60% of the final grade"
                    1 -> "60% of the final grade. Keep studying!"

                    else -> "error"
                }
            }
            message.contains("sistca") && message.contains("exam") && message.contains("minimum") -> {
                when (random) {
                    0 -> "8.0 values but try to have more than that!"
                    1 -> "8.0 values."

                    else -> "error"
                }
            }

            else -> {
                when (random) {
                    0 -> "If it'ss about SISTCA, see in the portal or in moodle or even, ask to a teacher"
                    1 -> "I don't know that, ask me other thing please :c"

                    else -> "error"
                }
            }
        }
    }

}