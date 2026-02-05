package com.github.notenoughbees.waytogonu.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.github.notenoughbees.waytogonu.R

val MonomaniacOne = FontFamily(
    Font(R.font.monomaniac_one_regular)
)

// Set of Material typography styles
val Typography = Typography(
    // main screen app name
    headlineLarge = TextStyle(
        fontFamily = MonomaniacOne,
        fontWeight = FontWeight.Normal,
        fontSize = 50.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
    ),

    // main screen buttons
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
    ),

    // top app bar title
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 36.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
    ),

//    // alert dialog titles
//    titleMedium = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontSize = 28.sp,
//        lineHeight = 28.sp,
//        letterSpacing = 0.sp,
//    ),
//
//    //todo
//    bodyLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 24.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    ),
//
//    //todo
//    bodyMedium = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontSize = 18.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    ),
//
//    //todo
//    bodySmall = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    ),
//
//    //todo
//    labelSmall = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Medium,
//        fontSize = 12.sp,
//        lineHeight = 16.sp,
//        letterSpacing = 0.5.sp
//    )
)