package com.example.starter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.starter.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.student = getStudent()
    }
}


data class Student(
    val id: Int,
    val name: String,
    val email: String
)

private fun getStudent(): Student{
    return Student(5, "Mohnish", "Mohnishkumar@gmail.com")
}
