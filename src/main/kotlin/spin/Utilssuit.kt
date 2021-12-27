package spin

import jdk.jshell.execution.Util

class Utilssuit {
    val pilihan = arrayOf("Gunting", "Batu", "Kertas")
    var player1 = readLine()

    private fun getWinnerLoserCombination(playerOneInput: String, playerTwoInput: String): Pair<String, String> {
        return if (isPlayerOneWInner(playerOneInput, playerTwoInput))
            Pair(playerOneInput, playerTwoInput)
        else
            Pair(playerTwoInput, playerOneInput)
    }

    private fun isPlayerOneWInner(playerOneInput: String, playerTwoInput: String): Boolean {
        return (playerOneInput == "batu" && playerTwoInput == "gunting") ||
                (playerOneInput == "kertas" && playerTwoInput == "batu") ||
                (playerOneInput == "gunting" && playerTwoInput == "kertas")
    }

        }

