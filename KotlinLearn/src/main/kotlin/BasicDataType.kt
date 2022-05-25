class BasicDataType {
}

/**
 * String是个独立的数据类型
 */

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
        throw IllegalArgumentException("Out or range")
    }
    return c.code - '0'.code
}

fun main() {
    // ===表示比较对象地址， == 表示比较两个值大小
    val a: Int = 10000
    println(a === a)

    // ？表示可为空
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    println(boxedA === anotherBoxedA)
    println(boxedA == anotherBoxedA)

    // 类型转换不能隐式的转换，需要调用对应的to***方法

    // 位操作符
    /*
     * shl(bits) 左移位
     * shr(bits) 右移位
     * ushr(bits) 无符号右移位
     * and 与
     * or 或
     * xor 异或
     * inv 反向
     */

    // Char不能直接和数字操作

    println(decimalDigitValue('5'))
//    println(decimalDigitValue('c'))

    // 数组
    val arr1 = arrayOf(1, 2, 3)
    val arr2 = Array(3, { i -> (i * 2) })

    println(arr1[0])
    println(arr2[1])

    // 字符串
    val text = """
    多行字符串
    多行字符串
    """
    println(text)

    val text1 = """
        |多行字符串
        |pengkk27
        |多行字符串
    """.trimIndent()
    println(text1)
}