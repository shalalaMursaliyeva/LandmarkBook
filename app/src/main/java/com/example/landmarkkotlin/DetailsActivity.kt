package com.example.landmarkkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landmarkkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        binding.textView.text = selectedLandmark.name
        binding.textView4.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)



    }
}