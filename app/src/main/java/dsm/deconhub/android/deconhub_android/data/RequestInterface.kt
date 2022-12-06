package dsm.deconhub.android.deconhub_android.data

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface RequestInterface {
    @POST("user/login")
    fun requestLogin(@Body body: RequestLogin): Call<ResponseLogin>

    @POST("uesr/signup")
    fun requestSignup(@Body body: RequestSignup)

    @GET("contest/list")
    fun requestContestList(): Call<ResponseContestList>

    @GET("uesr")
    fun requestUser(@Header("accessToken") accessToken: String): Call<ResponseUser>
}