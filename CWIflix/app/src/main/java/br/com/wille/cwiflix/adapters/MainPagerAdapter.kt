package br.com.wille.cwiflix.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import br.com.wille.cwiflix.R
import br.com.wille.cwiflix.fragments.ActorsFragment
import br.com.wille.cwiflix.fragments.MoviesFragment
import br.com.wille.cwiflix.fragments.SeriesFragment

class MainPagerAdapter(fm: FragmentManager, val context: Context) : FragmentPagerAdapter(fm) {

    val moviesFragment: MoviesFragment by lazy {
        MoviesFragment()
    }

    val seriFragment: SeriesFragment by lazy {
        SeriesFragment()
    }

    val actorsFragment: ActorsFragment by lazy {
        ActorsFragment()
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> moviesFragment
            1 -> seriFragment
            else -> actorsFragment
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> context.getString(R.string.filmes)
            1 -> context.getString(R.string.series)
            else -> context.getString(R.string.estrelas)
        }
    }
}