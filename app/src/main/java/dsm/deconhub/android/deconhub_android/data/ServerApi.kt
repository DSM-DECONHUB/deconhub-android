package dsm.deconhub.android.deconhub_android.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

object ServerApi {
    var retrofit = Retrofit.Builder()
        .baseUrl("http://54.180.109.55/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}