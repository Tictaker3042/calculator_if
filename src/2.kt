fun main() {
    while (true) {
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
                println("" + a + " + " + b + " = " + r)
            }
            "-" -> println("$a - $b = ${a - b}")
            "/" -> println(a / b)
            "*" -> println(a * b)
            else -> println("Ошибка")
        }
        println("Введите 1, чтобы продолжить выполнение программы")
        println("Введите 2, завершить программу")
        val choose = readLine()!!
        val ch: Int = choose.toInt()
        if (ch == 2) {
            break
        }
    }
}
