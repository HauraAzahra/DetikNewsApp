package com.haura.detiknewsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_berita.*

class DetailBeritaActivity : AppCompatActivity() {

    // companion = nilai nya ga ke ubah2
    // ini key nya
    companion object{
        const val cont_TitleNews = "cont_TitleNews"
        const val cont_PhotoNews = "cont_PhotoNews"
        const val cont_DescNews = "cont_DescNews"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita)

        //ini buat menerima data dari adapter nya
        // ini penerima data dari adapter ke detail

        txt_titleNews.text = intent.getStringExtra(cont_TitleNews)
        txt_kontenNews.text = intent.getStringExtra(cont_DescNews)
        Picasso.get().load(intent.getIntExtra(cont_PhotoNews,0)).into(img_toolbar)

        btn_back.setOnClickListener {
            val intentMain = Intent(this@DetailBeritaActivity, MainActivity::class.java)
            startActivity(intentMain)
        }
    }
}