package br.com.wille.shoppingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(R.style.AppTheme)

        setContentView(R.layout.activity_shop)
    }
}
