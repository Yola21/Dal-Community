package com.example.dalcommunity

import java.io.Serializable

data class Place(val title:String,val description:String,val latitude:Double,val longitude:Double):Serializable {
    constructor():this("","",0.0,0.0)
}
