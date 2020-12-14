package com.example.lab8_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val data : ArrayList<ItemData>)
    : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    //實作RecyclerView.ViewHolder來緩存View
    class ViewHolder(v : View): RecyclerView.ViewHolder(v){
        //宣告並連結畫面元件
        val photoName : TextView = v.findViewById(R.id.tv_name)
        val photo : ImageView = v.findViewById(R.id.img_photo)
    }

    //建立ViewHolder並連結畫面
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.adapter_horizontal,
            parent, false)
        return ViewHolder(v)
    }
    //連結項目資料與元件
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //根據position顯示圖片和名稱
        holder.photoName.text = data[position].photo_name
        holder.photo.setImageResource(data[position].photo)
    }

    //回傳項目筆數
    override fun getItemCount(): Int {
        return data.size
    }
}