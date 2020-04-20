class Dealer {
    var playerHand=0
    var dealerHand=0
    var hand=0
    var dealerStand=false
    var rdm=0
    fun hitMe(ruka: Int): Int{
        hand=ruka
        rdm=(1..10).random()
        if (rdm==1 && ruka<=10) {
            hand += 11
        }else{
            hand=+rdm
        }
        return hand
    }

    fun dealingToHimself(): Int{
        dealerHand=(2..11).random()
        println("Dealers first hand is $dealerHand")
        while(!dealerStand) {
            if (dealerHand <= 16) {
                dealerHand += hitMe(dealerHand)
            } else if (dealerHand >= 17) {
                dealerStand = true
            }
        }
    return dealerHand
    }
    fun dealingToPlayer(): Int{
            playerHand=(2..11).random()
            println("Your hand is $playerHand")
        return playerHand
    }
    fun playNextRound(){
         playerHand=0
         dealerHand=0
         hand=0
         dealerStand=false
    }
}