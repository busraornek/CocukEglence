package com.busraornek.cocukeglence.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.busraornek.cocukeglence.data.entity.IcerikData
import com.busraornek.cocukeglence.data.entity.Icerikler
import com.busraornek.cocukeglence.data.entity.Katagoriler

class IcerikViewModel: ViewModel(){
    private lateinit var icerikListe:ArrayList<Icerikler>

    fun getList(): List<Icerikler>{
         icerikListe = ArrayList()

        val k = Katagoriler("1","Masal")
        val y = IcerikData(1,"Keloglan")

        val c1 = Icerikler(1 , "Prens","Keloglan","kus",k,y)
        val c2 = Icerikler(2,"Masalevi","MasalEvi","masal",k,y)
        val c3 = Icerikler(3,"Kurt","Kurt","kurt",k,y)
        val c4 = Icerikler(4,"Pinokyo","pinokyo","pinokyo",k,y)
        val c5 = Icerikler(5,"Rapunzel","Rapunzel","rapunzel",k,y)
        val c6 = Icerikler(6,"Ördek","Ördek","ordek",k,y)

        icerikListe.add(c1)
        icerikListe.add(c2)
        icerikListe.add(c3)
        icerikListe.add(c4)
        icerikListe.add(c5)
        icerikListe.add(c6)

        return icerikListe
    }
}