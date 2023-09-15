package com.busraornek.cocukeglence.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.busraornek.cocukeglence.data.entity.Katagoriler
import com.busraornek.cocukeglence.data.repository.Repository
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainViewModel : ViewModel(){

    private lateinit var katagorilerListe: ArrayList<Katagoriler>
    val krepo = Repository()



    fun getList():List<Katagoriler>{
        lateinit var refKisiler: DatabaseReference
        val db = FirebaseDatabase.getInstance()
        refKisiler = db.getReference("notes")
        katagorilerListe = ArrayList()
        krepo.tumKisiler()

        return katagorilerListe

    }
}