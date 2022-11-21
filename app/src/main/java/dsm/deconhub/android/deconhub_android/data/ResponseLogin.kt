package dsm.deconhub.android.deconhub_android.data

data class ResponseLogin(
    val data : SomeData?
)

data class SomeData(
    val accessToken : String,
    val refreshToken : String
)
