import java.util.*
import kotlin.random.Random.Default.nextInt

class ThrowDice{
    fun all(dice: Array<Int>){
        for (element in 0..5){
            dice[element]=(1..6).random()
        }
        println("1. bacanje:")
        for (element in dice) {
            print(element)
            print(" ")
        }
        println("")
    }
    fun again(dice: Array<Int>, num: Int){
        var throwAgain= readLine()!!
        var arrayAgain= throwAgain.split(",").map { it.toInt() }
        for (element in arrayAgain){
            dice[element-1]=(1..6).random()
        }
        println("$num. bacanje:")
        for (element in dice) {
            print(element)
            print(" ")
        }
        println("")
    }
}
