import java.util.Scanner
fun main(){
    val reader = Scanner(System.`in`)
    var round = Dealer()
    var loop =true
    round.dealingToHimself()
    round.dealingToPlayer()
    print("Input number 1 if you want to hit, input any other number if you want to stand: ")
    var broj: Int = reader.nextInt()
    while (loop){
        loop@ while(broj==1){
            round.playerHand+=round.hitMe(round.playerHand)
            println("Your hand is ${round.playerHand}")
            if(round.playerHand>21){
                println("Bust! You Lost!")
                print("Input number 1 want to play next round, input any other number if you want to exit: ")
                broj= reader.nextInt()
                if (broj!=1){
                    loop=false
                    break@loop
                }else{
                    round.playNextRound()
                    round.dealingToHimself()
                }
            }else{
                print("Input number 1 if you want to hit, input any other number if you want to stand: ")
                broj= reader.nextInt()
            }
        }
        if (broj!=1){
            println("Dealers final hand is ${round.dealerHand}")
            if (round.dealerHand>21) {
                println("You Won!")
            }else if (round.dealerHand>round.playerHand){
                println("You lost!")
            }else if(round.dealerHand<round.playerHand && round.playerHand==21) {
                println("You Won!  Blackjack!")
            }else if(round.dealerHand<round.playerHand){
                    println("You Won!")
            }else{
                println("It's a Tie!")
            }
        }
        print("Input number 1 want to play next round, input any other number if you want to exit: ")
        broj = reader.nextInt()
        if (broj!=1){
            loop=false
        }else{
            round.playNextRound()
            round.dealingToHimself()
        }
    }
}