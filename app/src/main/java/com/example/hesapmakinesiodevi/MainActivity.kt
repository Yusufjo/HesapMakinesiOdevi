package com.example.hesapmakinesiodevi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hesapmakinesiodevi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var kontrol = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        binding.buttonC.setOnClickListener {
            kontrol = ""
            binding.textViewEkran.text = kontrol
        }
        binding.buttonArti.setOnClickListener {
            if (!kontrol.endsWith("+")) {
                kontrol += "+"
                binding.textViewEkran.text = kontrol
            } else {
                Toast.makeText(this, "İkı kere art arda + koyamazsınız", Toast.LENGTH_SHORT).show()
            }
        }
        binding.buttonEsit.setOnClickListener {
            if (kontrol.isEmpty()||kontrol=="+") {
                Toast.makeText(this, "İşlem yok", Toast.LENGTH_SHORT).show()
            } else {
                kontrol = kontrol.trim('+')
                val parcala = kontrol.split("+")
                val sonuc = parcala[0].toInt() + parcala[1].toInt()
                var s = 0
                for (e in parcala)
                    s += e.toInt()
                binding.textViewEkran.text = sonuc.toString()
            }
        }
        binding.button0.setOnClickListener {
            kontrol += 0
            binding.textViewEkran.text = kontrol
        }
        binding.button1.setOnClickListener {
            kontrol += "1"
            binding.textViewEkran.text = kontrol
        }
        binding.button2.setOnClickListener {
            kontrol += "2"
            binding.textViewEkran.text = kontrol
        }
        binding.button3.setOnClickListener {
            kontrol += "3"
            binding.textViewEkran.text = kontrol
        }
        binding.button4.setOnClickListener {
            kontrol += "4"
            binding.textViewEkran.text = kontrol
        }
        binding.button5.setOnClickListener {
            kontrol += "5"
            binding.textViewEkran.text = kontrol
        }
        binding.button6.setOnClickListener {
            kontrol += "6"
            binding.textViewEkran.text = kontrol
        }
        binding.button7.setOnClickListener {
            kontrol += "7"
            binding.textViewEkran.text = kontrol
        }
        binding.button8.setOnClickListener {
            kontrol += "8"
            binding.textViewEkran.text = kontrol
        }
        binding.button9.setOnClickListener {
            kontrol += "9"
            binding.textViewEkran.text = kontrol
        }



        setContentView(binding.root)
    }
}