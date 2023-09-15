package com.busraornek.cocukeglence.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.busraornek.cocukeglence.data.entity.Katagoriler
import com.busraornek.cocukeglence.databinding.ActivityMainBinding
import com.busraornek.cocukeglence.ui.adapter.KatagorilerAdapter
import com.busraornek.cocukeglence.ui.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: KatagorilerAdapter
    private lateinit var viewModel : MainViewModel
    private lateinit var katagorilerListesi: List<Katagoriler>
    private lateinit var refKatagoriler: Katagoriler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tempViewModel : MainViewModel by viewModels()
        viewModel = tempViewModel

        binding.toolbarKategori.title = "Katagoriler"
        setSupportActionBar(binding.toolbarKategori)


        binding.katagoriRv.setHasFixedSize(true)
        binding.katagoriRv.layoutManager = LinearLayoutManager(this)



        adapter = KatagorilerAdapter(this,viewModel.getList(),refKatagoriler)
        binding.katagoriRv.adapter = adapter

        viewModel.getList()




    }
}