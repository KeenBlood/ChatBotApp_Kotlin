package com.example.chatbotapp

object DecisionTree {

    fun response (message_receiver: String): String
    {
        val random = (0..4).random() //gerar um número aleatorio de 0 a 4
        val other_random = (0..1).random() //gerar um número aleatorio de 0 a 1
        val message = message_receiver.toLowerCase() //colocar aqui a mensgem que recebe



        return when {

            //Goodbye

            message.contains("goodbye") -> {
                when (random) {
                    1 -> "Seen you soon, I hope!"
                    2 -> "Goodbye..."
                    3 -> "Byeee."
                    4 -> "Bye, go st"
                    else -> "error"
                }

            }

            //Hello
            message.contains("hello") -> {



                when (random) {

                    0 -> "Hi dear human."
                    1 -> "Hello!"
                    2 -> "Hi, hope you are okay."
                    3 -> "Hi, I'm a bot."
                    4 -> "Good to see you!"
                    else -> "error"

                }

            }

            //anchor

            message.contains("anchor") && message.contains("what") && message.contains("for")  -> {
                when (other_random) {
                    0 -> "Is like anchor a ship, so it doesn't move to much. There you ancor the layout, so it the placement is similiar even when the system has a different resolution."
                    1 -> "It's explained in the report, read again, c’mon!"
                    else -> "error"
                }
            }

            // how to built
            message.contains("build") && message.contains("how")  -> {

                when (other_random) {
                    0 -> "You should click in the green hammer."
                    1 -> "Did you already try to click in the green hammer?"
                    else -> "error"
                }
            }

            //why do i built

            message.contains("build") && message.contains("why")  -> {
                when (other_random) {
                    0 -> "To compile!"
                    1 -> "Did you learn that in the 1st year of university? okay, okay, I can tell you. Is to compile."
                    else -> "error"
                }
            }

            // how to run

            message.contains("run") && message.contains("how")   -> {
                when (other_random) {
                    0 -> "You should click in the green arrow."
                    1 -> "Did you already try to click in the green arrow?"
                    else -> "error"
                }
            }

            // taking much time to run

            message.contains("run") && message.contains("taking")  && message.contains("time")    -> {
                when (other_random) {
                    0 -> "Is your first time running the program? If so, calm down, is normal. If has been 5 minutes or more, cancel that and see in the report if you code is in the parameters."
                    1 -> "Breath in, breath out, if everything is fine it will wourk out! Just kidding, wait a bit first. If your problem continues, try to see if your emulator is okay, if not, delete it and create a new one."
                    else -> "error"
                }
            }

            // error

            message.contains("not") && message.contains("working")   -> {
                when (other_random) {
                    0 -> "Check if everything is equal or similar, then try again please"
                    1 -> "Did you put the imports that are in the report?"
                    else -> "error"
                }
            }

            //separeted text

            message.contains("separate") && message.contains("text") -> {
                when (other_random) {
                    0 -> "You wrote Separate text separately."
                    1 -> "You wrote separate and text in the same sentence and in the same sentence."
                    else -> "error"
                }
            }

            //palavra a vermelho
            message.contains("red") && message.contains("word") -> {
                when (other_random) {
                    0 -> "A red word can appear because of a lot of reasons, put you mouse there, click it. A light bulb will appear in the beginning of that line, click it and that will tell you the problem."
                    1 -> "Make sure you are writing that word correctly. If it is correct, a ligh bulb will apper in the beginning of that line, click it and that will tell you the problem."
                    else -> "error"
                }
            }


            message.contains("how") && message.contains("are") -> {
                when (other_random) {
                    0 -> "I'm fine."
                    1 -> "I'm fine and you?."
                    else -> "error"
                }
            }

            message.contains("ok")  -> {
                when (other_random) {
                    0 -> "Nice!"
                    1 -> "Try asking me another question."
                    else -> "error"
                }
            }

            else -> {
                when (random) {
                    0 -> "Can you ask something else?"
                    1 -> "I don't know that, ask me other thing please :c"
                    2 -> "I didn't understand you..."
                    3 -> "Ask to someone else, I don't know."
                    4->   "I'm going to tell you a secret: I don't know that."
                    else -> "error"

                }

            }

        }
    }

}