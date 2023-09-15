package com.busraornek.cocukeglence.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.busraornek.cocukeglence.data.entity.Icerikler
import com.busraornek.cocukeglence.R

class IceriklerAdapter(private val mContext:Context,
                       private val icerikListe:List<Icerikler>) :RecyclerView.Adapter<IceriklerAdapter.CardTasarimTutucu>(){
    inner class CardTasarimTutucu(tasarim:View):RecyclerView.ViewHolder(tasarim){
        var icerik_card:CardView
        var icerik_text:TextView
        var icereik_resim:ImageView
        init {
           icerik_card = tasarim.findViewById(R.id.icerik_card)
            icerik_text = tasarim.findViewById(R.id.textViewIcerikAd)
            icereik_resim = tasarim.findViewById(R.id.imageViewIcerikResim)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
       val tasarim = LayoutInflater.from(mContext).inflate(R.layout.icerik_card_tasarim,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
      return icerikListe.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
       val icerik = icerikListe.get(position)


        holder.icerik_text.text = icerik.icerik_ad
        holder.icereik_resim.setImageResource(mContext.resources.getIdentifier(icerik.icerik_resim,"drawable",mContext.packageName))

        holder.icerik_card.setOnClickListener {

        }

    }
}