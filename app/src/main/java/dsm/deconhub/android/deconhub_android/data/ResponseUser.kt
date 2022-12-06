package dsm.deconhub.android.deconhub_android.data

import com.google.gson.annotations.SerializedName

data class ResponseUser(
    @SerializedName("account_id") val accountId: String,
    @SerializedName("email") val email: String
)
