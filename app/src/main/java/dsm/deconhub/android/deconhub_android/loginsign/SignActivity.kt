package dsm.deconhub.android.deconhub_android.loginsign

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.data.RequestSignup
import dsm.deconhub.android.deconhub_android.data.RequestToServer
import kotlinx.android.synthetic.main.activity_sign.*

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        val requestToServer = RequestToServer
        signupButton.setOnClickListener {
            Log.d(
                "id, email, pw, valid",
                "\nid ${accountIdSign.text.toString()} \nemail ${emailSign.text.toString()} \npw ${passwordSign.text.toString()} \nvalid ${passwordValidSign.text.toString()}"
            )

            requestToServer.service.requestSignup(
                RequestSignup(
                    accountIdSign.text.toString(),
                    emailSign.text.toString(),
                    passwordSign.text.toString(),
                    passwordValidSign.text.toString()
                )
            )
            finish()
        }


        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}
