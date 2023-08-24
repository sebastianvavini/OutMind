package com.zazensoftwares.outmind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zazensoftwares.outmind.databinding.ActivityNivelConscienciaBinding

class NivelConscienciaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var dormiuComo:String
    private lateinit var binding: ActivityNivelConscienciaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityNivelConscienciaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dormiuComo = intent.getStringExtra("escolha").toString()

       binding.textViewDormiu.text=intent.getStringExtra("escolha").toString()

       // binding.buttonAvancarPergunta3.setOnClickListener(this)

    }

    override fun onClick(p: View) {
        if(true){
            println (true)
        }
    }
}