
/*
fun `fun`() {
    val list: List<Int> = listOf(1,2,3)
    val list2: MutableList<Int> = list.toMutableList()
    val list3 = list2.toList()
}
*/

fun main() {
    mylist()
}


fun mylist() {
    val list: MutableList<Int> = mutableListOf()
    addnum(list)
}

fun addnum(list:MutableList<Int>) {
    while (true) {
        println("Введите число")
        val type = readLine()!!
        val num: Int = type.toInt()
        list.add(num)
        println("'Enter', чтобы продолжить ввод чисел")
        println("'q', чтобы завершить ввод чисел")
        val choose = readLine()!!
        val ch: String = choose.toString()
        if (ch == "q") {
            showfunc(list)
            break

        }
    }
}

fun showfunc(list:MutableList<Int>) {
    println(list)
    val max: Int = list.maxOrNull() ?: 0
    println("Наибольшее число: $max")
}