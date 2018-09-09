package br.com.wille.cleaningapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.cwi.cleaningapp.R
import kotlinx.android.synthetic.main.activity_step_one.*

class StepOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step_one)

        btnNextStep.setOnClickListener({
            startActivity(Intent(this, StepTwoActivity::class.java))
        })
    }

}
