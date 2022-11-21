package dsm.deconhub.android.deconhub_android.data

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestInterface {
    @POST("user/login")
    fun requestLogin(@Body body: RequestLogin): Call<ResponseLogin>
}