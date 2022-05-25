class BasicGrammar {
}

/**
 * null 检查机制
 */
class NullCheck {
    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        if (x != null && y != null) {
            println(x * y)
        } else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }
}

/**
 * 类型检测以及自动类型转换
 */
class CheckType {

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }

        return null
    }

}


fun main() {

    // null 检查机制
    val nullCheck = NullCheck()
    nullCheck.printProduct("6", "7")
    nullCheck.printProduct("a", "7")
    nullCheck.printProduct("a", "b")

    // 类型检查
    val checkType = CheckType()
    println(checkType.getStringLength("abc"))
    println(checkType.getStringLength(1))

    // 区间
    for (i in 1..4) {
        print(i)
    }
    println()
    // 布长指定为2
    for (i in 1..4 step 2) {
        print(i)
    }
    println()
    for (i in 4 downTo 1 step 2) {
        print(i)
    }
    println()
    // until 排除技术元素，没有10
    for (i in 1 until 10) {
        println(i)
    }

}