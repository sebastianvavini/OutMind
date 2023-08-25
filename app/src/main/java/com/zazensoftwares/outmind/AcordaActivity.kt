package com.zazensoftwares.outmind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zazensoftwares.outmind.databinding.ActivityAcordaBinding
import com.zazensoftwares.outmind.shared.SharedData

class AcordaActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityAcordaBinding
    private lateinit var dormiuComo: String
    private lateinit var nivelConsciencia: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAcordaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dormiuComo = SharedData(this).getString("escolha")
        binding.textViewDormiu2.text = dormiuComo

        nivelConsciencia = SharedData(this).getString("nivel")
        binding.textViewNivel.text = nivelConsciencia

        binding.antesDas6h.setOnClickListener(this)
        binding.antesDas7h.setOnClickListener(this)
        binding.antesDas8h.setOnClickListener(this)
        binding.antesDas9h.setOnClickListener(this)
        binding.antesDas10h.setOnClickListener(this)

        binding.buttonAvancarPerguntaHoraDormir.setOnClickListener(this)

    }

    override fun onClick(p: View) {

        if(binding.antesDas6h.isChecked){
            SharedData(this).storeString("acorda", "as 6h")
        }
        if(binding.antesDas7h.isChecked){
            SharedData(this).storeString("acorda", "as 7h")
        }
        if (binding.antesDas8h.isChecked){
            SharedData(this).storeString("acorda", "as 8h")
        }
        if (binding.antesDas9h.isChecked){
            SharedData(this).storeString("acorda", "as 9h")
        }
        if (binding.antesDas10h.isChecked){
            SharedData(this).storeString("acorda", "as 10h")
        }

        if(p.id==R.id.button_avancar_pergunta_hora_dormir){
            avancar()

        }

    }
    fun avancar(){
        var intencao = Intent(this, DormeActivity::class.java)
        startActivity(intencao)
    }
}