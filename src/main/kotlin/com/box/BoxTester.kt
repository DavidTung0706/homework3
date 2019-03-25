package com.david

import java.sql.SQLOutput
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val box3 = Box3()
    val box5 = Box5()
    print("Please enter object's length: ")
    var length = scanner.nextFloat()
    print("Please enter object's width: ")
    var width = scanner.nextFloat()
    print("Please enter object's height: ")
    var height = scanner.nextFloat()
    if (box3.validate(length, width, height)){
        box3.getBoxname()
    } else if (box5.validate(length, width, height)) {
        box5.getBoxname()
    } else {
        print("您的物品不符合規定")
    }
}
    open class Box(val boxname: String, val length: Float, val width: Float, val height: Float) {


        fun validate(length: Float, width: Float, height: Float): Boolean {
            return (length <= this.length &&
                    width <= this.width && height <= this.height)
        }

        internal open fun getBoxname(): String {
            println(boxname)
            return this.boxname
        }
    }

    class Box3 : Box("com.box.Box3", 23f, 14f, 13f)
    class Box5 : Box("com.box.Box5", 39.5f, 27.5f, 23f)
