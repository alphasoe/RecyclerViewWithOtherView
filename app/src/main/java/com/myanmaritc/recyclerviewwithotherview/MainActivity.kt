package com.myanmaritc.recyclerviewwithotherview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.myanmaritc.recyclerviewwithotherview.Adapter.JackAdapter
import com.myanmaritc.recyclerviewwithotherview.model.Jack
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var jackList = ArrayList<Jack>()

        jackList.add(Jack(R.drawable.wishlist, "My Wishlist"))
        jackList.add(Jack(R.drawable.wallet, "My Followed Sellers"))
        jackList.add(Jack(R.drawable.purchased_box, "My Purchased Item"))
        jackList.add(Jack(R.drawable.coupon, "My Coupons"))
        jackList.add(Jack(R.drawable.wallet, "My Card Wallets"))
        jackList.add(Jack(R.drawable.coupon, "Exp Points"))
        jackList.add(Jack(R.drawable.wishlist, "My Given Feedbacks"))
        jackList.add(Jack(R.drawable.history, "Search History"))
        jackList.add(Jack(R.drawable.wishlist, "Even & Calender"))

        var jackAdapter = JackAdapter(jackList)

        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = jackAdapter
    }
}