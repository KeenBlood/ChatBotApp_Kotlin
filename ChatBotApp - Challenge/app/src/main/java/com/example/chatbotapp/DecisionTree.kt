package com.example.chatbotapp

object DecisionTree {

    //global variables
    var game_rps = 0 //rock paper scissors
    var i = 0
    var points_user = 0
    var points_bot = 0
    var rps_random = (0..2).random() // 0 = rock, 1 = paper, 2 = scissors
    var rps_select =""


    fun rps_bot(): String {
        if (rps_random == 0)
            return "rock"

        if (rps_random == 1)
            return "paper"

        if (rps_random == 2)
            return "scissors"

        else
            return "error"
    }
    fun rps_round(): String {

        if (rps_bot() == rps_select)
            return "It's a draw. \rMy points:" + points_bot +". \rYour points:"  + points_user

        if ((rps_bot() == "rock" && rps_select == "scissors") || (rps_bot() == "paper" && rps_select == "rock") || (rps_bot() == "scissors" && rps_select == "paper")) //bot wins
        {
            points_bot++;
            return "I won. \rMy points:" + points_bot +". \rYour points:"  + points_user
        }

        if ((rps_select == "rock" && rps_bot() == "scissors") || (rps_select == "paper" && rps_bot() == "rock") || (rps_select == "scissors" && rps_bot() == "paper")) //bot wins
        {
            points_user++;
            return "I lost. \rMy points:" + points_bot +"\rYour points:"  + points_user
        }

        else
            return "error"
    }
    fun reset_round(): String {
        i= 0
        points_user = 0
        points_bot = 0
        return "\n Points resetted!"
    }


    fun response (message_receiver: String): String {
        val random = (0..4).random() //gerar um número aleatorio de 0 a 4
        val other_random = (0..1).random() //gerar um número aleatorio de 0 a 1
        var message = message_receiver.toLowerCase() //colocar aqui a mensgem que recebe

        if (message.contains("exit") || message.contains("stop") || message.contains("quit")) {
            game_rps = 0
            i= 0
            points_user = 0
            points_bot = 0
            return "Game quit"
        }

        if (game_rps == 1) {
            rps_select = message

            if (i == 0) // first rund
            {
                i++
                rps_random = (0..2).random()
                return "ROUND 1: I chose " + rps_bot() + ". And you chose " + rps_select + " So " + rps_round()
            }
            if (i == 1) {
                i++
                rps_random = (0..2).random()
                return "ROUND 2: I chose " + rps_bot() + ". And you chose " + rps_select + " So " + rps_round()
            }
            if (i == 2) {
                i = 0
                game_rps = 0
                rps_random = (0..2).random()
                if (points_bot == points_user)
                    return "ROUND 3: I chose " + rps_bot() + ". And you chose " + rps_select + " So " + rps_round() + "\r\n In the end it's a draw!!! I have " + points_bot + " points And you have " + points_user + " points!" + reset_round()
                else if (points_bot > points_user)
                    return "ROUND 3: I chose " + rps_bot() + ". And you chose " + rps_select + " So " + rps_round() + "\r\n In the end I WIN!!! I have " + points_bot + " points And you have " + points_user + " points!" + reset_round()
                else if (points_bot < points_user)
                    return "ROUND 3: I chose " + rps_bot() + ". And you chose " + rps_select + " So " + rps_round() + "\r\n In the end I lost!!! I have " + points_bot + " points And you have " + points_user + " points!" + reset_round()
            }
        }
        return when {
            //Goodbye
            message.contains("hello") -> {
                when (random) {
                    1 -> "Hi"
                    2 -> "Hello!"
                    3 -> "Wanna play a game? Type rock paper scissors"
                    4 -> "Bye, go st"
                    else -> "error"
                }
            }

            message.contains("rock") && message.contains("paper") && (message.contains("scissors") || message.contains("scissor")) -> {
                game_rps = 1
                when (other_random) {
                    0 -> "Game starting" + "\rRock, Paper or Scissors, what do you choose?"
                    1 -> "Let's play Rock Paper Scissors!" + "\rRock, Paper or Scissors, what do you choose?"
                    else -> "error"
                }
            }

            else -> {
                when (random) {
                    0 -> "I only say hello or play a game. Ask me to play rock paper scissors"
                    else -> "I only say hello or play a game. Ask me to play rock paper scissors"
                }
            }
        } // end return when


    }
}
