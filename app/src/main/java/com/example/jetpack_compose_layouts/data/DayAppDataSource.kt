package com.example.a30daysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.jetpack_compose_layouts.R

data class DayAppDataSource(
    @StringRes val day: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val imageRes: Int,
)

object daysRepository {

    val days = listOf(
        DayAppDataSource(
            day = R.string.day1,
            title = R.string.day1_title,
            description = R.string.day1_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day2,
            title = R.string.day2_title,
            description = R.string.day2_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day3,
            title = R.string.day3_title,
            description = R.string.day3_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day4,
            title = R.string.day4_title,
            description = R.string.day4_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day5,
            title = R.string.day5_title,
            description = R.string.day5_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day6,
            title = R.string.day6_title,
            description = R.string.day6_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day7,
            title = R.string.day7_title,
            description = R.string.day7_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day8,
            title = R.string.day8_title,
            description = R.string.day8_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day9,
            title = R.string.day9_title,
            description = R.string.day9_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day10,
            title = R.string.day10_title,
            description = R.string.day10_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day11,
            title = R.string.day11_title,
            description = R.string.day11_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day12,
            title = R.string.day12_title,
            description = R.string.day12_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day13,
            title = R.string.day13_title,
            description = R.string.day13_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day14,
            title = R.string.day14_title,
            description = R.string.day14_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day15,
            title = R.string.day15_title,
            description = R.string.day15_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day16,
            title = R.string.day16_title,
            description = R.string.day16_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day17,
            title = R.string.day17_title,
            description = R.string.day17_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day18,
            title = R.string.day18_title,
            description = R.string.day18_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day19,
            title = R.string.day19_title,
            description = R.string.day19_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day20,
            title = R.string.day20_title,
            description = R.string.day20_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day21,
            title = R.string.day21_title,
            description = R.string.day21_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day22,
            title = R.string.day22_title,
            description = R.string.day22_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day23,
            title = R.string.day23_title,
            description = R.string.day23_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day24,
            title = R.string.day24_title,
            description = R.string.day24_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day25,
            title = R.string.day25_title,
            description = R.string.day25_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day26,
            title = R.string.day26_title,
            description = R.string.day26_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day27,
            title = R.string.day27_title,
            description = R.string.day27_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day28,
            title = R.string.day28_title,
            description = R.string.day28_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day29,
            title = R.string.day29_title,
            description = R.string.day29_description,
            imageRes = R.drawable.image1
        ),
        DayAppDataSource(
            day = R.string.day30,
            title = R.string.day30_title,
            description = R.string.day30_description,
            imageRes = R.drawable.image1
        )
    )
}
