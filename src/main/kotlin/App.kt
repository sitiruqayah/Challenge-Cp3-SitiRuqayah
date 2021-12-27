import spin.Utilssuit

class App {
    fun run() {
        printHeader()
        inputValue1()
        inputValue2()
    }

    private fun printHeader() {
        println(
            """
        ===============================
        GAME SUIT TERMINAL VERSION
        ===============================
    """.trimIndent()
        )
    }

    private fun inputValue1() {
        println("Masukan pemain 1:")
        val pilihan = arrayOf("Gunting", "Batu", "Kertas")
        var player1 = readLine()
    }

    private fun inputValue2() {
        println("Masukan pemain 2: ")
        val pilihan = arrayOf("Gunting", "Batu", "Kertas")
        var player2 = readLine()
    }

    private fun Start(spin: String) {
        when (spin) {
            "kertas" -> {
                //open Utilssuit
                Utilssuit()
            }
            "gunting" -> {
                //open Utilssuit
                Utilssuit()
            }
            "batu" -> {
                //open Utilssuit
                Utilssuit()
            }
        }
    }


        companion object {
            @JvmStatic
            fun main(args: Array<String>) {
                App().run()
            }
        }
    }