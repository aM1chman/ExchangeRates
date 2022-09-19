package com.arlitin.retrofit.data.repository

import com.arlitin.retrofit.data.api.RetrofitInstance
import com.arlitin.retrofit.model.beznal.Beznal
import com.arlitin.retrofit.model.nal.Nalichka
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoney()
    }
}