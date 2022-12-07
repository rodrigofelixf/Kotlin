package br.com.rodrigofelixf.estruturada

import java.math.BigDecimal

fun main() {
    val priceProduct = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.35"), BigDecimal("22.99"),
        BigDecimal("45.99"), BigDecimal("3.99"), BigDecimal("20.99")
    )

    val sumtot = sumPrice(priceProduct)
    println(sumtot)

}

fun sumPrice(product: Array<BigDecimal>): BigDecimal {
    var priceTotal = BigDecimal.ZERO
    for(price in product) {
        priceTotal += price
    }
    return priceTotal
}