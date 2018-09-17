package br.com.wille.cwiflix.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.com.wille.cwiflix.R
import br.com.wille.cwiflix.adapters.MediaAdapter
import br.com.wille.cwiflix.api.MovieDatabaseService
import br.com.wille.cwiflix.models.MediaResult
import kotlinx.android.synthetic.main.fragment_movies.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SeriesFragment : Fragment(), Callback<MediaResult> {

    lateinit var adapter: MediaAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        MovieDatabaseService.service.getPopularTVShows().enqueue(this)

        return inflater.inflate(R.layout.fragment_series, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("fragmentCycle - Series", "onCreate")
    }

    override fun onResume() {
        super.onResume()

        Log.d("fragmentCycle - Series", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("fragmentCycle - Series", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("fragmentCycle - Series", "onStop")
    }

    override fun onFailure(call: Call<MediaResult>, t: Throwable) {
        Log.e("SeriesFragment", t.localizedMessage, t)
    }

    override fun onResponse(call: Call<MediaResult>, response: Response<MediaResult>) {
        response.body()?.results?.let {
            adapter = MediaAdapter(it) {media ->
                Toast.makeText(context, media.title, Toast.LENGTH_SHORT).show()
            }
            recyclerView.adapter = adapter
        }
    }
}
