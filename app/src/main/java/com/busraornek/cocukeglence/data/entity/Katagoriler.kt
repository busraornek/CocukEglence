package com.busraornek.cocukeglence.data.entity

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable
@IgnoreExtraProperties
data class Katagoriler(var katagoriAd:String?="",
                       var katagoriId: String?=""): Serializable{

}
