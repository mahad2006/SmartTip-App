package com.codewithmahad.smarttip.utils

import java.text.NumberFormat

fun tipCalculate(amount: Double, tipPercent: Double = 15.0,roundUp: Boolean = false): String {
    var tip = tipPercent / 100 * amount
    if (roundUp){
        tip = kotlin.math.ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}