package com.zazensoftwares.outmind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zazensoftwares.outmind.databinding.ActivityPerguntaBasica1Binding

class PerguntaBasica1Activity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityPerguntaBasica1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPerguntaBasica1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAvancarPergunta2.setOnClickListener(this)
    }

    override fun onClick(p: View) {
        if(p.id==R.id.button_avancar_pergunta2){
            avancar()
        }
    }

    fun avancar(){
            var intencao = Intent(this, NivelConscienciaActivity::class.java)
        startActivity(intencao)
        finish()
    }
}