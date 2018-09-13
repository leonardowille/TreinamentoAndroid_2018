package br.com.wille.shoppingapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

class ShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(R.style.AppTheme)

        setContentView(R.layout.activity_shop)

    }



    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item?.itemId == R.id.nav_notification){
            startActivity(Intent(this, NotificationActivity::class.java))
            return true
        } else if (item?.itemId == R.id.nav_inbox){
            startActivity(Intent(this, InboxActivity::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
