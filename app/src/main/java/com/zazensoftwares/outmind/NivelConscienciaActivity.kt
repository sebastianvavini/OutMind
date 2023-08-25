package com.zazensoftwares.outmind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zazensoftwares.outmind.databinding.ActivityNivelConscienciaBinding
import com.zazensoftwares.outmind.shared.SharedData

class NivelConscienciaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var dormiuComo:String
    private lateinit var binding: ActivityNivelConscienciaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityNivelConscienciaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dormiuComo = SharedData (this).getString("escolha")

       binding.textViewDormiu.text=dormiuComo

       binding.buttonAvancarPergunta3.setOnClickListener(this)
        binding.zeroDez.setOnClickListener(this)
        binding.dezVinte.setOnClickListener(this)
        binding.vinteQuarenta.setOnClickListener(this)
        binding.quarentaSessenta.setOnClickListener(this)
        binding.sessentaOitenta.setOnClickListener(this)

    }

    override fun onClick(p: View) {

        if(binding.zeroDez.isChecked){
            SharedData(this).storeString("nivel", "0 a 10%")
        }
        if(binding.dezVinte.isChecked){
            SharedData(this).storeString("nivel", "10 a 20%")
        }
        if (binding.vinteQuarenta.isChecked){
            SharedData(this).storeString("nivel", "20 a 40%")
        }
        if (binding.quarentaSessenta.isChecked){
            SharedData(this).storeString("nivel", "40 a 60%")
        }
        if (binding.sessentaOitenta.isChecked){
            SharedData(this).storeString("nivel", "60 a 80%")
        }

        if(p.id==R.id.button_avancar_pergunta3){
            avancar()

        }


    }
    fun avancar(){
        var intencao = Intent(this, AcordaActivity::class.java)
        startActivity(intencao)
    }
}