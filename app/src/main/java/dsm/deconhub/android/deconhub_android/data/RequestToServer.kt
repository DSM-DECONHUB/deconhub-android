package dsm.deconhub.android.deconhub_android.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RequestToServer {
    var retrofit = Retrofit.Builder()
        .baseUrl("http://54.180.109.55/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: RequestInterface = retrofit.create(
        RequestInterface::class.java)
}