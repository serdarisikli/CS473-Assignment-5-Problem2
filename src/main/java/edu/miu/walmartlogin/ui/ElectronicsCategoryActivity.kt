package edu.miu.walmartlogin.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import edu.miu.walmartlogin.R
import edu.miu.walmartlogin.adapter.CategoryAdapter
import edu.miu.walmartlogin.data.Product
import edu.miu.walmartlogin.databinding.ActivityElectronicsItemBinding

class ElectronicsCategoryActivity : AppCompatActivity(), CategoryAdapter.Callback {

    private lateinit var binding: ActivityElectronicsItemBinding
    private val productList = mutableListOf(
        Product("Macbook pro  \" Laptop", "$1300", "Silver", R.drawable.laptop, 1236L, "Apple MacBook Pro 13-inch (M2, 2022) comes with Apple's latest M2 chip and offers excellent performance and battery life. However, there's no new design here, and with the new MacBook Air snapping at its heels, this laptop feels a bit redundant in some aspects."),
        Product("Ipad\" 120GB ios tablet", "$500", "White", R.drawable.tablet, 123L, "\n" +
                "iPad is Apple's version of a tablet. Most tablets use Google's Android operating system, while the iPad runs on Apple's iOS. Unlike iPads, tablets can use popular software for showing online videos, so you'll have no problem viewing Flash-based websites, Flash games or watching Flash videos"),
        Product("Samsung 65\" class 4K", "$1400", "Black", R.drawable.tv, 1234L, "The Infinity Screen Is Our Slimmest Profile Yet For Our Most Immersive Viewing Experience. Thanks To Nano-sized Quantum Dots, Samsung Neo QLED Shows You The World In All Its Colors. Free In-Store Pick Up. Quantum Mini LEDs. Neural.."),
        Product("HP Scanner XYZ", "$335", "White", R.drawable.scanner, 1235L, "he HP ScanJet is HP's state-of-the-art series of commercial and consumer scanners. Like other scanners, they enable to you make digitized ...")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityElectronicsItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = CategoryAdapter(this, productList)
        adapter.setCallback(this)
        recyclerView.adapter = adapter
    }

    override fun onItemClicked(product: Product?) {
        val intent = Intent(this, ElectronicsDetailActivity::class.java)
        intent.putExtra("product", product)
        startActivity(intent)
    }
}