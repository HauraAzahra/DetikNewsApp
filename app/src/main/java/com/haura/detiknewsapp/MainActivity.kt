package com.haura.detiknewsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail_berita.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //buat manggil class adapter
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //untuk mengelola layout horizontal atau vertical
        val layManager = LinearLayoutManager (this)
        layManager.orientation = LinearLayoutManager.VERTICAL

        //nge set layout recycler view untuk horizontal atau vertical
        rcv_daftarberita.layoutManager = layManager

        //me inisialisasi adapter , adapter nya di isi dengan object di NewsModel tadi
        newsAdapter = NewsAdapter(this, NewsModel.newslists)
        //memasukan adapter ke recycler view nya
        rcv_daftarberita.adapter = newsAdapter

    }
}