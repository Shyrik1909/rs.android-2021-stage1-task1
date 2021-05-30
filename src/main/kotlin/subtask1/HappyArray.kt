package subtask1

import java.util.*

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.isEmpty()){
            return sadArray
        }
        var count = 0
        val list: MutableList<Int> = LinkedList()
        val list1: MutableList<Int> = LinkedList()
        for (`val` in sadArray) {
            list.add(`val`)
        }
        var badElement = 0
        do {
            badElement = 0
            count = 2
            println("Размер list" + list.size)
            if (list1.isNotEmpty()) {
                list.clear()
                list.addAll(list1)
            }
            list1.clear()
            list1.add(list[0])
            for (i in 1..(list.size - 2)) {
                println(i)

                if (list[i] < list[i - 1] + list[i + 1]) {
                    list1.add(list[i])
                }
                count++
            }
            list1.add(list[list.size-1])
            for (i in 1..list.size - 2) {
                if (list[i] >= list[i - 1] + list[i + 1]) {
                    badElement = badElement + 1
                }
            }
        } while (badElement > 0)
        println(count)
        val happyArray = IntArray(count)
        happyArray[0] = sadArray[0]
        happyArray[count - 1] = sadArray[sadArray.size - 1]
        for (i in 0 until list1.size - 1) {
            happyArray[i] = list1[i]
        }
        return happyArray
    }


}


// TODO: Complete the following function

