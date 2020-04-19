class CheckDice{
    fun checkDice(dice: Array<Int>){
        loop@ for (i in 0..5){
            var sum=0
            for (j in 0..5){
                if (dice[i]==dice[j]) {
                    sum++
                }
            }
            if (dice.contains(1) && dice.contains(2) && dice.contains(3) && dice.contains(4)){
                println("Skala!\n")
                break@loop
            }
            if (dice.contains(2) && dice.contains(3) && dice.contains(4) && dice.contains(5)){
                println("Skala!\n")
                break@loop
            }
            if (dice.contains(3) && dice.contains(4) && dice.contains(5) && dice.contains(6)){
                println("Skala!\n")
                break@loop
            }
            if (sum==6){
                println("Jamb!\n")
                break@loop
            }
            if (sum==4 || sum==5){
                println("Poker!\n")
                break@loop
            }
            else{
                println("Ništa...")
            }

        }
    }
}