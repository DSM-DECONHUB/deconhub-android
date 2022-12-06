package dsm.deconhub.android.deconhub_android.data

data class ResponseLogin(
    val data: Data?
)

data class Data(
    val accessToken: String,
    val refreshToken: String
)
