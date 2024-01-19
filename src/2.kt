fun main() {
    print("Введите 1 число: ")
    val first = readLine()!!
    val a: Int = first.toInt()
    print("Введите 2 число: ")
    val second = readLine()!!
    val b: Int = second.toInt()
    print("Введите операцию над числами: ")
    val sign = readLine()!!

    if (sign == "/") {
        print(a.toFloat() / b)
    }
    if (sign == "*") {
        print(a * b)
    }
    if (sign == "+") {
        print(a + b)
    }
    if (sign == "-") {
        print(a - b)
    }
}
