package com.example.interactive.data.remote

import SquadMatchData
import com.example.interactive.data.remote.dto.MatchDetail
import retrofit2.http.GET

interface ApiService {

    @GET("nzin01312019187360.json")
    suspend fun getMatchDetails(): MatchDetail

    @GET("sapk01222019186652.json")
    suspend fun getSquadsDetails(): SquadMatchData

}