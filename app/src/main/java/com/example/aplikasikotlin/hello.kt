package com.example.aplikasikotlin
fun main(args: Array<String>) {
    biodata("Fadillah Dwi Anggraini", 19)
    hobby("mendengarkan musik", "saya suka mendengarkan musik kpop")
}

fun biodata(name:String, age:Int){ // minimal 2 parameter/args
    println("===============================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("===============================")
}

fun hobby(hobby:String, desc:String){
    println("Saya suka $hobby")
    println("Yang saya dengarkan adalah $desc")
}



