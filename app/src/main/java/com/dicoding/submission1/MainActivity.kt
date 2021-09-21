package com.dicoding.submission1

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rvItem: RecyclerView
    private var list: ArrayList<Item> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ActionBar
        supportActionBar?.title = "Daftar Aktivitas"
        // Recycler View
        rvItem = findViewById(R.id.item_list)
        rvItem.setHasFixedSize(true)
        list.addAll(ItemData.listData)
        itemRecycler()
    }

    private fun itemRecycler() {
        rvItem.layoutManager = LinearLayoutManager(this)
        val itemAdapter =  ItemAdapter(list)
        rvItem.adapter = itemAdapter
        itemAdapter.setOnItemClickCallback(object : ItemAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Item) {
                itemDetail(data)
            }
        })
    }

    private fun itemDetail(item: Item) {
        val itemDetail = Intent(this@MainActivity, DetailActivity::class.java)
        itemDetail.putExtra(DetailActivity.EXTRA_NAME, item.name)
        itemDetail.putExtra(DetailActivity.EXTRA_DETAIL, item.detail)
        itemDetail.putExtra(DetailActivity.EXTRA_PHOTO, item.photo)
        startActivity(itemDetail)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val profile = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(profile)
        return true
    }
}