import subtask1.HappyArray

import subtask2.BillCounter
import java.util.*

class Runner {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
           /* val bill = intArrayOf(2, 4, 6)
            val k = 2
            val b = 3
            val billCounter = BillCounter()
            println(billCounter.calculateFairlySplit(bill, k, b))*/

            val sadArray = intArrayOf(1, 5, 2, 7, 93, 8, 9, 3)
            val happyArray = HappyArray()
            val array = Arrays.toString(happyArray.convertToHappy(sadArray))
            println(array)
        }
    }
}