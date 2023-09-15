package com.busraornek.cocukeglence.data.repository

import androidx.lifecycle.MutableLiveData
import com.busraornek.cocukeglence.data.entity.Katagoriler
import com.busraornek.cocukeglence.ui.adapter.KatagorilerAdapter
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener



class Repository {
    val katagorilerListesi: MutableLiveData<List<Katagoriler>>
    init {
        katagorilerListesi = MutableLiveData()
    }
    private  lateinit var refKisiler:DatabaseReference
    private lateinit var adapter:KatagorilerAdapter

    fun tumKisiler(){

        refKisiler.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot){


                for(c in snapshot.children){
                    val katagori = c.getValue(Katagoriler::class.java)

                    if(katagori != null){
                        katagori.katagoriAd = c.key

                    }
                }
                adapter.notifyDataSetChanged()
            }
            override fun onCancelled(error: DatabaseError) {
            }
        })
    }

}