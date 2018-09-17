package br.com.wille.cwiflix.api

import br.com.wille.cwiflix.models.MediaResult
import br.com.wille.cwiflix.models.PersonResult
import retrofit2.Call
import retrofit2.http.GET

interface IMovieDatabaseService {

    @GET("movie/popular")
    fun getPopularMovies()
        : Call<MediaResult>

    @GET("tv/popular")
    fun getPopularTVShows()
            : Call<MediaResult>

    @GET("person/popular")
    fun getPopularPeople()
            : Call<PersonResult>
}