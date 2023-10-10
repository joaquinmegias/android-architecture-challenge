package com.example.desafioarquitecturas.data.remote

import retrofit2.http.GET

interface MoviesService {
    @GET("discover/movie?api_key=010bac772828c84d4cacc14b5af56d05")
    suspend fun getMovies(): MovieResult
}