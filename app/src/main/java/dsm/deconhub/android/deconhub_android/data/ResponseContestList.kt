package dsm.deconhub.android.deconhub_android.data

import com.google.gson.annotations.SerializedName

data class ResponseContestList(
    val data: List<Data>
) {
    data class Data(
        @SerializedName("id") val id: Long,
        @SerializedName("category") val category: String,
        @SerializedName("date_time") val dateTime: String,
        @SerializedName("title") val title: String,
        @SerializedName("period") val period: String,
    )
}
