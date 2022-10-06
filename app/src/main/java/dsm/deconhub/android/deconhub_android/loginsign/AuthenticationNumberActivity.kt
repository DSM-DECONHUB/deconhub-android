package dsm.deconhub.android.deconhub_android.loginsign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R

class AuthenticationNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authenticationnumber)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressed()
        }

        val setNewPasswordButton = findViewById<Button>(R.id.setNewPasswordButton)
        setNewPasswordButton.setOnClickListener {
            val setNewPassword = Intent(this, SetNewPasswordActivity::class.java)
            startActivity(setNewPassword)
        }
    }
}