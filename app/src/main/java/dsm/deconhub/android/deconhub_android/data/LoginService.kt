package dsm.deconhub.android.deconhub_android.data

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginService {

    @FormUrlEncoded
    @POST("user/login")
    fun requestLogin(
        @Field("accountId") accountId:String,
        @Field("password") password:String
    ): Call<Login>
}