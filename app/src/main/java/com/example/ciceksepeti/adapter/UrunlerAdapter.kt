package com.example.ciceksepetitasarim.adapter

import android.app.ActionBar
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ciceksepeti.databinding.UrunCardTasarimiBinding
import com.example.ciceksepeti.entity.Urunler

class UrunlerAdapter(var mContext: Context, var urunlerListesi: List<Urunler>) :
    RecyclerView.Adapter<UrunlerAdapter.KartTasarimiTutucu>() {

    inner class KartTasarimiTutucu(tasarim: UrunCardTasarimiBinding) :
        RecyclerView.ViewHolder(tasarim.root){
        var tasarim: UrunCardTasarimiBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KartTasarimiTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = UrunCardTasarimiBinding.inflate(layoutInflater, parent, false)
        return KartTasarimiTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: KartTasarimiTutucu, position: Int) {

        val urun = urunlerListesi.get(position)
        val t = holder.tasarim

        t.tvUrunAdi.text = urun.urunAdi
        t.tvUrunFiyat.text = "${urun.urunFiyat} ₺"
        t.tvYorumSayisi.text = "(${urun.urunYorum})"
        t.ratingBar.rating = urun.urunBegeni.toFloat()
        if(urun.ucretsizKargo == true) {
            t.tvUcretsizKargo.visibility = View.VISIBLE
        } else {
            t.tvUcretsizKargo.visibility = View.INVISIBLE
        }
        t.tvTaksit.text = "${urun.urunFiyat / 4} ₺'den Başlayan Taksitlerle"
        t.imageViewUrunResim.setImageResource(
            mContext.resources.getIdentifier(urun.urunResimAdi, "drawable", mContext.packageName))
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}