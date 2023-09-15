package com.busraornek.cocukeglence.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.busraornek.cocukeglence.ui.activity.IcerikActivty
import com.busraornek.cocukeglence.data.entity.Katagoriler
import com.busraornek.cocukeglence.R

class KatagorilerAdapter(
    private val mContext: Context,
    private val katagoriListe: List<Katagoriler>,
    private var refKatagoriler: Katagoriler
) : RecyclerView.Adapter<KatagorilerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: View) : RecyclerView.ViewHolder(tasarim) {
        var katagori_card: CardView
        var textViewKatagoriAd: TextView

        init {
            katagori_card = tasarim.findViewById(R.id.Katagori_card)
            textViewKatagoriAd = tasarim.findViewById(R.id.textViewKatagoriAd)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim =
            LayoutInflater.from(mContext).inflate(R.layout.katagori_card_tasarim, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return katagoriListe.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val katagori = katagoriListe.get(position)

        holder.textViewKatagoriAd.text = katagori.katagoriAd
        holder.katagori_card.setOnClickListener{

            val intent = Intent(mContext, IcerikActivty::class.java)
            intent.putExtra("katagoriNesne",katagori)
            mContext.startActivity(intent)

        }

    }


}