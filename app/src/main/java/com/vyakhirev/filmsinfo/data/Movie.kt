package com.vyakhirev.filmsinfo.data

import com.google.gson.annotations.SerializedName

import java.util.ArrayList

class Movie(
    posterPath: String,
    @SerializedName("adult")
    var isAdult: Boolean,
    @SerializedName("overview")
    var overview: String?,
    @SerializedName("release_date")
    var releaseDate: String?,
    genreIds: List<Int>,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("original_title")
    var originalTitle: String?,
    @SerializedName("original_language")
    var originalLanguage: String?,
    @SerializedName("title")
    var title: String?,
    @SerializedName("backdrop_path")
    var backdropPath: String?,
    @SerializedName("popularity")
    var popularity: Double?,
    @SerializedName("vote_count")
    var voteCount: Int?,
    @SerializedName("video")
    var video: Boolean?,
    @SerializedName("vote_average")
    var voteAverage: Double?,
    var isViewed:Boolean=false,
    var isFavorite:Boolean=false
) {
    @SerializedName("poster_path")
    var posterPath: String? = null
        get() = "https://image.tmdb.org/t/p/w500$field"
}

var films: List<Movie> = listOf()