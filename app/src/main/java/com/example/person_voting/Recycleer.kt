package com.example.person_voting

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.person_voting.databinding.ActivityRecycleerBinding




class Recycleer : AppCompatActivity() {
    private  lateinit var  binding: ActivityRecycleerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRecycleerBinding.inflate(layoutInflater)

        val friendList = listOf<Friend>(
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.sir),
            Friend("Jui", "Very good  girl", R.drawable.jui),
            Friend("Mafi", "Very good boy", R.drawable.mafi),
            Friend("Asgor", "Very good boy", R.drawable.asgor),
            Friend("Asgor", "Very good boy", R.drawable.vote),
            Friend("Aminul Islam Munna", "Very good boy", R.drawable.sir),
            Friend("Jui", "Very good  girl", R.drawable.jui),
            Friend("Mafi", "Very good boy", R.drawable.mafi),
            Friend("Asgor", "Very good boy", R.drawable.asgor),
            Friend("Asgor", "Very good boy", R.drawable.vote),

            )

//        friendAdapter = FriendAdapter(friendList)
//        binding.recyclerView.apply {
//            layoutManager = LinearLayoutManager(this@Recycleer)
//            adapter = friendAdapter
//        }
    }
}