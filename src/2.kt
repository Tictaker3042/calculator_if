fun main() {
    print("Введите 1 число: ")
    val first = readLine()!!
    val a: Int = first.toInt()
    print("Введите 2 число: ")
    val second = readLine()!!
    val b: Int = second.toInt()
    print("Введите операцию над числами: ")
    val sign = readLine()!!
    when (sign) {
        "+" -> {
            val r = a + b
            print("" + a + " + " + b)
        }
        "-" -> print("$a - $b = ${a - b}")
        "/" -> print(a / b)
        else -> print("Ошибка")
    }
}