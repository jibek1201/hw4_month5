package com.example.hw4_month5.remote

import java.io.Serializable

data class LoveModel(
    var fname: String,
    var sname: String,
    var percentage: String,
    var result: String,
) : Serializable