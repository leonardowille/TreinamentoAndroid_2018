package br.com.wille.cwiflix

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.wille.cwiflix.adapters.MainPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentPagerAdapter = MainPagerAdapter(supportFragmentManager, this)
        mainViewPager.adapter = fragmentPagerAdapter

        tabLayout.setupWithViewPager(mainViewPager)
    }
}
