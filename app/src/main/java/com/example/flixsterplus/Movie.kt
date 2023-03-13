package com.example.flixsterplus
import com.google.gson.annotations.SerializedName
import org.json.JSONArray

class Movie (title: String,poster_path : String, overview: String) {
    @SerializedName("title")
    var movieName = title
    //@SerializedName("poster_path")
    //var movieImageUrl = "https://image.tmdb.org/t/p/w500${poster_path}"
    @SerializedName("poster_path")
    var movieImageUrl: String? = null
    @SerializedName("overview")
    var description = overview
}