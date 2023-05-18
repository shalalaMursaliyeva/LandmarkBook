package com.example.landmarkkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var landmarkList : ArrayList<Landmark>
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.colosse)
        val eiffel = Landmark("Eiffel", "France", R.drawable.eifel)
        val londonBridge = Landmark("London Bridge", "UK", R.drawable.londonbridge)
        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)
        landmarkList.add(colosseum)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter


    }
}