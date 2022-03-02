package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomnavigation.databinding.ActivityMainBinding
import com.example.bottomnavigation.fragments.AddElementFragment
import com.example.bottomnavigation.fragments.HomeFragment
import com.example.bottomnavigation.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {

//    private var _binding: ActivityMainBinding? = null
//    private val binding: ActivityMainBinding get() = binding!!
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.main -> {
                    supportFragmentManager.beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, HomeFragment())
                        .commit()
                    true
                }
                R.id.add ->{
                    supportFragmentManager.beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, AddElementFragment())
                        .commit()
                    true
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, ProfileFragment())
                        .commit()
                    true
                }

                else -> false
            }
        }
    }
}