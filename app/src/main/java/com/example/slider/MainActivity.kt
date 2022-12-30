package com.example.slider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.d, "Wido Technology private limited"))
        imageList.add(SlideModel(R.drawable.e, "Wido Technology private limited"))
        imageList.add(SlideModel(R.drawable.c, "Wido Technology private limited"))
        imageList.add(SlideModel(R.drawable.d, "Wido Technology private limited"))
        imageList.add(SlideModel(R.drawable.e, "Wido Technology private limited"))
        imageSlider.setImageList(imageList)
    }
}