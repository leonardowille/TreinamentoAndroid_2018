package br.com.wille.cwiflix.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.wille.cwiflix.R
import br.com.wille.cwiflix.adapters.ActorAdapter
import br.com.wille.cwiflix.api.MovieDatabaseService
import br.com.wille.cwiflix.models.PersonResult
import kotlinx.android.synthetic.main.fragment_movies.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ActorsFragment : Fragment(), Callback<PersonResult> {

    lateinit var adapter: ActorAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        MovieDatabaseService.service.getPopularPeople().enqueue(this)

        return inflater.inflate(R.layout.fragment_actors, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("fragmentCycle - Actors", "onCreate")
    }

    override fun onResume() {
        super.onResume()

        Log.d("fragmentCycle - Actors", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("fragmentCycle - Actors", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("fragmentCycle - Actors", "onStop")
    }

    override fun onFailure(call: Call<PersonResult>, t: Throwable) {
        Log.e("ActorsFragment", t.localizedMessage, t)
    }

    override fun onResponse(call: Call<PersonResult>, response: Response<PersonResult>) {
        response.body()?.results?.let {
            adapter = ActorAdapter(it)
            recyclerView.adapter = adapter
        }
    }

}
