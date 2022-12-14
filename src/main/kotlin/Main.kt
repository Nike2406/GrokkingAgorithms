fun main() {
    val list = mutableListOf(2, 4, 6)
    println(quickSum(list))
}

fun quickSum(list: MutableList<Int>): Int =
    if (list.isEmpty()) {
        0
    } else {
        list[0] + quickSum(list.also(MutableList<Int>::removeFirst))
    }