package br.com.wille.cwiflix.models

import com.google.gson.annotations.SerializedName

class MediaResult(val results: List<Media>)

class Media(
        val id: String,
        @SerializedName("title", alternate = ["name"]) val title: String,
        val overview: String,
        @SerializedName("poster_path") val image: String,
        @SerializedName("release_date", alternate = ["first_air_date"]) val releaseDate: String,
        @SerializedName("vote_average") val grade: String
)

class PersonResult(val results: List<Person>)

class Person(
        val name: String,
        @SerializedName("profile_path") val photo: String
)