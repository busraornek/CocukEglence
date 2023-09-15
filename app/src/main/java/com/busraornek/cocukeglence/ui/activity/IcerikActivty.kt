package com.busraornek.cocukeglence.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.busraornek.cocukeglence.data.entity.Katagoriler
import com.busraornek.cocukeglence.databinding.ActivityIcerikActivtyBinding
import com.busraornek.cocukeglence.ui.adapter.IceriklerAdapter
import com.busraornek.cocukeglence.ui.viewmodel.IcerikViewModel

class IcerikActivty : AppCompatActivity() {
    private lateinit var binding: ActivityIcerikActivtyBinding
    private lateinit var katagoriler: Katagoriler
    private lateinit var adapter: IceriklerAdapter
    private lateinit var viewModel: IcerikViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIcerikActivtyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val tempViewModel: IcerikViewModel by viewModels()
        viewModel = tempViewModel
        katagoriler = intent.getSerializableExtra("katagoriNesne") as Katagoriler
        setUi()
        initializeRecyclerView()
        setAdapter()
    }
    private fun setAdapter() {
        adapter = IceriklerAdapter(this, viewModel.getList())
        binding.IceriklerRv.adapter = adapter
    }
    private fun initializeRecyclerView() {
        binding.IceriklerRv.setHasFixedSize(true)
        binding.IceriklerRv.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }
    private fun setUi(){
        binding.toolbarIcerikler.title = "${katagoriler.katagoriAd}"
        setSupportActionBar(binding.toolbarIcerikler)
    }
}