package com.example.ciceksepeti.entity

data class Urunler(var urunId: Int,
                   var urunAdi: String,
                   var ucretsizKargo: Boolean,
                   var urunFiyat: Double,
                   var urunResimAdi: String,
                   var urunBegeni: Double,
                   var urunYorum: Int) {
}