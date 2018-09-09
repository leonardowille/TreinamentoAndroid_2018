package br.com.wille.supersam

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.cwi.supersam.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnCreateAccountId.setOnClickListener {
            goToCreateAccount()
        }
    }

    private fun goToCreateAccount(){
        val intent = Intent(this, CreateAccountActivity::class.java)
        startActivity(intent)
    }
}
