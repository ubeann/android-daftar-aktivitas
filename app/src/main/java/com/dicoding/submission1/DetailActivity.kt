package com.dicoding.submission1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "name"
        const val EXTRA_DETAIL = "detail"
        const val EXTRA_PHOTO = "photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        // Variable data
        val name: TextView = findViewById(R.id.item_name)
        val detail: TextView = findViewById(R.id.item_detail)
        val photo: ImageView = findViewById(R.id.item_photo)
        // Catch data
        val getName = intent.getStringExtra(EXTRA_NAME)
        val getDetail = intent.getStringExtra(EXTRA_DETAIL)
        val getPhoto = intent.getIntExtra(EXTRA_PHOTO,0)
        // Send Data to Activity
        name.text = getName
        detail.text = getDetail
        Glide.with(photo)
            .load(getPhoto)
            .into(photo)
        // ActionBar
        supportActionBar?.title = intent.getStringExtra(EXTRA_NAME)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Button Favorite
        val btnFavorite: Button = findViewById(R.id.btn_favorite)
        btnFavorite.setOnClickListener{Toast.makeText(this, "Menyukai $getName", Toast.LENGTH_SHORT).show()}
        // Button Share
        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener{
            val content: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "$getName\n\n$getDetail")
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(content, "Bagikan apa itu aktivitas $getName")
            startActivity(shareIntent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}