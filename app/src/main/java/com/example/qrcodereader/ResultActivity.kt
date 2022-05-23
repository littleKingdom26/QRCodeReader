package com.example.qrcodereader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.qrcodereader.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val result = intent.getStringExtra("msg")?: "데이터가 존재하지 않습니다."

        setUI(result)

    }

    private fun setUI(result: String){
        binding.tvContent.text = result
        binding.btnGoBack.setOnClickListener {
            finish()
        }
    }
}