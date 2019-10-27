package com.ashraf.ktdemo

data class Quantity(
    val case: Case,
    val discount: Any,
    val id: Int,
    val landing_price: Int,
    val mrp: Int,
    val name: String,
    val value: String
)