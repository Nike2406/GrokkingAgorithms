fun main() {
    val list = mutableListOf(2, 4, 6, 3, 1, 12, 5, 4, 0)
    println(findMaxDigit(list))
}

fun findMaxDigit(list: MutableList<Int>): Int {
    return if (list.size == 1) {
        list[0]
    } else {
        val i = if (list[0] > list[1]) 1 else 0
        findMaxDigit(list.also { it.removeAt(i) })
    }
}