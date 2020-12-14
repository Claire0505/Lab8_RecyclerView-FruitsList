package com.example.lab8_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab8_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //啟用ViewBinding
    private lateinit var binding: ActivityMainBinding
    private val item = ArrayList<ItemData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //從R圖取圖片資源檔
        val imgArray = resources.obtainTypedArray(R.array.imgArray)
        val imgNameArray = resources.getStringArray(R.array.nameArray)
        //建立項目物件，放入圖片資源與名稱
        for (i in 0 until imgArray.length()){
            item.add(ItemData(imgArray.getResourceId(i,0), imgNameArray[i]))
        }
        //回收TypeArray
        imgArray.recycle()

        //創建LinearLayoutManager物件
        val linearMgr = LinearLayoutManager(this)
        //設定清單呈現的方向
        linearMgr.orientation = LinearLayoutManager.VERTICAL
        //連結LayoutManager
        binding.recyclerLinearLayout.layoutManager = linearMgr
        //連結Adapter
        binding.recyclerLinearLayout.adapter = MyAdapter(item)

        //創建GridLayout物件，並設定每列/行的資料數
        val gridLayoutManager = GridLayoutManager(this, 3)
        //設定清單的呈現方向
        gridLayoutManager.orientation = GridLayoutManager.VERTICAL
        //連結GridLayoutManager
         binding.recyclerGridLayout.layoutManager = gridLayoutManager
        //連結Adapter
         binding.recyclerGridLayout.adapter = MyAdapter(item)
    }

}