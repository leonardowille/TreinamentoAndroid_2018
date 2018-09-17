package br.com.wille.projetoexemplo

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import br.com.wille.projetoexemplo.fragments.MovieFragment
import br.com.wille.projetoexemplo.fragments.SeriesFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.movies -> {
                openFragment(MovieFragment())
                Toast.makeText(this, "Movies", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.series -> {
                openFragment(SeriesFragment())
                Toast.makeText(this, "Series", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> {
                return false
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationView.setNavigationItemSelectedListener(this)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
        openFragment(MovieFragment())
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.containerMain, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
