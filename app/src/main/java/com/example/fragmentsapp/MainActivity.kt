package com.example.fragmentsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.fragmentsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Navigation {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.root_container, MainFragment(this@MainActivity))
        }
    }

    override fun navigateToFragmentNext() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<NextFragment>(R.id.root_container)
        }
    }
}