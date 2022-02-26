package com.example.ciceksepeti.fragment

import android.os.Bundle
import android.view.*
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ciceksepeti.R
import com.example.ciceksepeti.databinding.FragmentAnasayfaBinding
import com.example.ciceksepeti.entity.Urunler
import com.example.ciceksepetitasarim.adapter.UrunlerAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.rv.layoutManager = LinearLayoutManager(requireContext())


        // ürünleri ekle
        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1, "Honor Watch GS Pro Akıllı Saat (Honor Türkiye Garantili)",
            true, 1799.00,"honor_watch_gs", 4.5, 12)
        val u2 = Urunler(2, "Dkny Be Delicious Edp 100 Ml Kadın Parfüm",
            true, 199.95,"decovilla_kapitone_yastik", 4.5, 11)
        val u3 = Urunler(3, "Torpido Üzerine Kaydırmaz Nano Ped",
            false, 12.53,"kaydirmaz_nano_ped", 0.0, 0)
        val u4 = Urunler(4, "Dökümçelik Taze Cam Demlik DÇ-1720 Inox Çay Makinesi",
            true, 269.99,"dokumcelik_taze_cam_demlik", 5.0, 1)
        val u5 = Urunler(5, "İsme Özel Tasarım Kutulu Altın Detaylı Roller Kalem",
            true, 48.55,"kisiye_ozel_kalem", 4.5, 114)
        val u6 = Urunler(6, " Powertec TR-901 Profesyonel Fön Makinesi ",
            true, 164.90,"powertec_tr_901", 4.5, 118)
        val u7 = Urunler(7, "Romantik Piyano Dans Eden Balerin Müzik Kutusu Arkadaşa Hediye",
            false, 99.90,"kaydirmaz_nano_ped", 5.0, 49)
        val u8 = Urunler(8, "Starliçe - Beyaz Cennet Kuşu - 100-120 Cm (Strelitzia Nicolai)",
            true, 299.90,"starlice_beyaz_cennet_kusu", 3.5, 4)
        val u9 = Urunler(9, "Yellow Rush",
            true, 109.00,"yellow_rush", 4.5, 315)
        val u10 = Urunler(10,"Fakir Shela 1700 W Blender Seti",
            true, 419.00,"fakir_shela_1700_w_blender", 3.5, 9)

        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)
        urunlerListesi.add(u8)
        urunlerListesi.add(u9)
        urunlerListesi.add(u10)

        val adapter =UrunlerAdapter(requireContext(), urunlerListesi)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }

}