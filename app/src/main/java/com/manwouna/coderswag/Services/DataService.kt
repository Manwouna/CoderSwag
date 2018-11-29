package com.manwouna.coderswag.Services

import com.manwouna.coderswag.Model.Category
import com.manwouna.coderswag.Model.Product

object DataService{

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1","Quality Hat"),
        Product("Devslopes Black", "$20", "hat2","Quality Impermeable Hat"),
        Product("Devslopes White", "$25", "hat3","NO comment Hat"),
        Product("Devslopes Snapback", "$19", "hat4","Snap and Shot")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1","Hell of Hoodie"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2","Hell of Hoodie"),
        Product("Devslopes Gray Hoodie", "$30", "hoodie3","Hell of Hoodie"),
        Product("Devslopes Black Hoodie", "$25", "hoodie4","Hell of Hoodie")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1","Right from Singapur"),
        Product("Devslopes Badge Light Gray", "$20", "shirt2","Boom boom shirt!!"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3","Graphity logo one"),
        Product("Devslopes Hustle", "$18", "shirt4","No comment shirt"),
        Product("Kickflip Studios", "$70", "shirt5", "Bon qualité, touché")
    )

}