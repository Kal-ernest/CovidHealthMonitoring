package com.kalernest.covidhealthmonitoring.database

import androidx.room.Entity

import androidx.room.PrimaryKey


@Entity(tableName = "user_sign_up_table")
data class Userdetails(
    @PrimaryKey(autoGenerate = true)
    val id:Long=0,
    var mobNum: String?="",
    var password: String?="",
    var firstName: String?="",
    var lastName: String?="",
    var username:String?="",

    var placeOfResidence:String?="",
    var dateofbirth:String?="",


    var profession:String?="",
    var email:String?="",
)