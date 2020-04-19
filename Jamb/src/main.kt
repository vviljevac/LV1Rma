import java.util.Scanner

fun main() {
        var bool = true
        val reader = Scanner(System.`in`)
        var dice = arrayOf(1, 2, 3, 4, 5, 6)
        var throwdice = ThrowDice()
        var checkdice = CheckDice()
        throwdice.all(dice)
        while (bool == true) {
            print(
                "Ako želite provjeriti imate li poker, jamb ili skalu, unesite 1. \n " +
                        "Ako želite bacati ponovo, unesite 2.\n" +
                        "Ako želite zapisati dobiveni rezultat i bacati ispočetka, unesite 3. ->"
            )
            var broj: Int = reader.nextInt()
            when (broj) {
                1 -> {
                    checkdice.checkDice(dice)
                }
                2 -> {
                    print("Unesite koje kocke želite ponovo bacati: ")
                    throwdice.again(dice, 2)
                    bool = false
                }
                3 -> {
                    throwdice.all(dice)
                }
                else -> {
                    println("Krivi unos, pokušaj ponovo!")
                }
            }
        }
        bool = true
        while (bool == true) {
            print(
                "Ako želite provjeriti imate li poker, jamb ili skalu, unesite 1. \n" +
                        " Ako želite napraviti posljednje bacanje, unesite 2.\n" +
                        "Ako želite zapisati dobiveni rezultat i bacati ispočetka, unesite 3. -> "
            )
            var broj: Int = reader.nextInt()
            when (broj) {
                1 -> {
                    checkdice.checkDice(dice)
                }
                2 -> {
                    print("Unesite koje kocke želite ponovo bacati: ")
                    throwdice.again(dice, 3)
                    bool = false
                }
                3 -> {
                    throwdice.all(dice)
                }
                else -> {
                    println("Krivi unos, pokušaj ponovo!")
                }
            }
        }
    checkdice.checkDice(dice)
}