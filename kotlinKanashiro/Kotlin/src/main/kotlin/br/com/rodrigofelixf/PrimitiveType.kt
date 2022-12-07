package br.com.rodrigofelixf

import java.math.BigDecimal

fun main() {
    // 16 bits ( -128, 127 )
    val byte: Byte = 127
    // 16 bits ( -32768, 32767 )
    val short: Short = 32767
    // 32 bits ( -2,147,483,648 (-231) , 2,147,483,647 (231 - 1) )
    val int: Int = 1234567890
    // 64 bits ( -9,223,372,036,854,775,808 (-263), 9,223,372,036,854,775,807 (263 - 1))
    val long: Long = 1234567890123456789

    val bigdecimal: BigDecimal = BigDecimal("1.2312999999999")
}