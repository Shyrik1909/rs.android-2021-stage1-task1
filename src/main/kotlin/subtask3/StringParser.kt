package subtask3

import java.util.*
import kotlin.collections.ArrayList

class StringParser {

    // TODO: Complete the following function
    //@JvmStatic
    fun main(args: Array<String>) {
        val inputString = "Lorem <(ipsum [dolor <sit] amet), consectetur adipiscing elit>. " +
                "Integer nec odio. Praesent libero. " +
                "Sed cursus ante dapibus diam. Sed nisi. " +
                "Nulla quis sem at nibh elementum imperdiet>. " +
                "Duis sagittis ipsum. Praesent mauris. " +
                "Fusce nec tellus sed augue semper porta. " +
                "Mauris massa. Vestibulum lacinia arcu eget (nulla. " +
                "Class aptent <taciti [sociosqu ad] litora torquent per conubia> nostra), per inceptos himenaeos."
        for (word in getResult(inputString)) {
            println(word)
        }
    }

    fun getResult(inputString: String): Array<String?> {


        val stack = Stack<Char>()
        val array = ArrayList<String>()
        for (i in 0 until inputString.length) {
            val x = inputString[i]
            if ((x == '(' || x == '[' || x == '<') && stack.isEmpty()) {
                stack.push(x)
                for (j in i + 1 until inputString.length) {
                    val y = inputString[j]
                    val endBracket = getEndBracket(x)
                    if (y == endBracket) {
                        stack.pop()
                    } else if (y == x) {
                        stack.push(y)
                    }
                    if (stack.isEmpty()) {
                        array.add(inputString.substring(i + 1, j))
                        break
                    }
                }
            }
        }
        val wordsArray = arrayOfNulls<String>(array.size)
        for (i in array.indices) {
            wordsArray[i] = array[i]
        }
        return wordsArray
    }

    fun getEndBracket(bracket: Char): Char {
        if (bracket == '(') {
            return ')'
        }
        if (bracket == '[') {
            return ']'
        }
        return if (bracket == '<') {
            '>'
        } else ' '
    }
}