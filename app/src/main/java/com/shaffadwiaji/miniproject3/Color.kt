package com.shaffadwiaji.miniproject3

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Color(
    @PrimaryKey val _id: Int,
    @ColumnInfo(name = "hex_color") val hex: String,
    val name:String
)
