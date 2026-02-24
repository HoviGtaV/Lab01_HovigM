package com.example.lab01_hovigm
import androidx.annotation.DrawableRes

data class NewsItem(
    val title: String,
    val description: String,
    @DrawableRes val imageRes: Int
)
