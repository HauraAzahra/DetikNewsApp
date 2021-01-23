package com.haura.detiknewsapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

//Adapter = nyambungin data ke layout

class NewsAdapter(c: Context?, data: List<news>?) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    var dataItem: List<news>? = data
    var mContext: Context? = c

    override fun getItemCount(): Int {
        return dataItem?.size!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(mContext).inflate(R.layout.item_berita, parent, false)
        return ViewHolder(inflater)
    }

    //untuk ngisi data ke layout nya
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.judul?.text = dataItem?.get(position)?.title
        holder.description?.text = dataItem?.get(position)?.desc
        Picasso.get().load(dataItem?.get(position)!!.photo).into(holder.image)

        holder.itemView.setOnClickListener {
            val intent = Intent (mContext, DetailBeritaActivity::class.java)
                    .apply {
                        putExtra(DetailBeritaActivity.cont_TitleNews, dataItem?.get(position)?.title)
                        putExtra(DetailBeritaActivity.cont_PhotoNews, dataItem?.get(position)?.photo)
                        putExtra(DetailBeritaActivity.cont_DescNews, dataItem?.get(position)?.desc)

                    }
            mContext?.startActivity(intent)
        }
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var judul = itemView?.findViewById<TextView>(R.id.tvw_title)
        var description = itemView?.findViewById<TextView>(R.id.tvw_Desc)
        var image = itemView?.findViewById<ImageView>(R.id.img_news)
    }
}