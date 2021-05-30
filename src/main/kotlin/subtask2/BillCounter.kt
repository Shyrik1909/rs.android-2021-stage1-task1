package subtask2

class BillCounter() {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sumBill = 0
        for (i in bill.indices) {
            sumBill += bill[i]
        }
        val b_actual = (sumBill - bill[k]) / 2
        val result = b - b_actual
        val a: String
        val c: String
        return if (result==0) {
            c = "Bon Appetit"
            c
        } else {
            a = result.toString() + ""
            a
        }
    }

}