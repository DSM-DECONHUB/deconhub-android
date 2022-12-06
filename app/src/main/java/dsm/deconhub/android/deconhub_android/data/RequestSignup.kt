package dsm.deconhub.android.deconhub_android.data

import com.google.gson.annotations.SerializedName

data class RequestSignup(
    @SerializedName("account_id") var accountId: String,
    @SerializedName("email") var email: String,
    @SerializedName("password") var password: String,
    @SerializedName("password_valid") var passwordValid: String
)
