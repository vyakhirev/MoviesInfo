package com.vyakhirev.filmsinfo.model.db

import androidx.room.*
import com.vyakhirev.filmsinfo.model.Movie
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(movies: List<Movie>): Completable

    @Query("SELECT * FROM movie")
    fun getAllMovie(): Flowable<List<Movie>>

    @Query("SELECT * FROM movie WHERE uuid=:Id")
    fun getMovie(Id: Int): Single<Movie>
//    fun getMovie(Id: Int): Movie

    @Query("SELECT * FROM movie WHERE isFavorite=:isFavorite")
    fun getFavorites(isFavorite: Boolean): Flowable<List<Movie>>
//    fun getFavorites(isFavorite: Boolean): List<Movie>

    @Query("DELETE FROM movie")
    fun deleteAllMovies():Completable

    @Update
    fun switchFavoriteStar(movie: Movie): Single<Int>
}
