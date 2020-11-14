package com.example.madlevel6example.services

import com.example.madlevel6example.models.Trivia
import retrofit2.http.GET

interface TriviaApiServices {
    @GET("/random/trivia?json")
    suspend fun getRandomNumberTrivia(): Trivia
}