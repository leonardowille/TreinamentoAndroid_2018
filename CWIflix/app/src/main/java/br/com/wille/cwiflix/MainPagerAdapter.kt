package br.com.wille.cwiflix

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import br.com.wille.cwiflix.fragments.ActorsFragment
import br.com.wille.cwiflix.fragments.MoviesFragment
import br.com.wille.cwiflix.fragments.SeriesFragment

class MainPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(p0: Int): Fragment {
        return when(p0) {
            0 -> MoviesFragment()
            1 -> SeriesFragment()
            else -> ActorsFragment()

        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "MOVIES"
            1 -> "SERIEES"
            else -> "ACTORS"
        }
    }
}