package com.zazensoftwares.outmind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zazensoftwares.outmind.databinding.ActivityPerguntaBasica1Binding
import com.zazensoftwares.outmind.shared.SharedData

class PerguntaBasica1Activity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityPerguntaBasica1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPerguntaBasica1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAvancarPergunta2.setOnClickListener(this)
        binding.radioBem.setOnClickListener(this)
        binding.radioMedio.setOnClickListener(this)
    }

    override fun onClick(p: View) {



        if(p.id==R.id.radio_bem){
            SharedData(this).storeString("escolha", "bem")
        }
        if(p.id==R.id.radio_medio){
            SharedData(this).storeString("escolha", "medio")
        }
        if(p.id == R.id.radio_mal){

            SharedData(this).storeString("escolha", "mal")
        }
        if(p.id==R.id.button_avancar_pergunta2){
            avancar()
        }
    }

    fun avancar(){

        var intencao = Intent(this, NivelConscienciaActivity::class.java)
        startActivity(intencao)
        //finish()
    }
}