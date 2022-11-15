package dsm.deconhub.android.deconhub_android.loginsign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.data.Login
import dsm.deconhub.android.deconhub_android.data.LoginService
import dsm.deconhub.android.deconhub_android.data.ServerApi.retrofit
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressed()
        }

        val signupButton = findViewById<Button>(R.id.signupButton)
        signupButton.setOnClickListener {
        }
    }
}
