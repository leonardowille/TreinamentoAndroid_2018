package br.com.wille.cleaningapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.cwi.cleaningapp.R
import kotlinx.android.synthetic.main.activity_step_two.*

class StepTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step_two)

        btnNextStep.setOnClickListener({
            startActivity(Intent(this, StepThreeActivity::class.java))
        })
    }
}
