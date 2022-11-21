package dsm.deconhub.android.deconhub_android.data

import com.google.gson.annotations.SerializedName

data class RequestLogin(
    @SerializedName("account_id") var accountId: String,
    @SerializedName("password") var password: String
)
