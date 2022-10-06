package dsm.deconhub.android.deconhub_android.loginsign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.R

class FindPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_findpassword)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressed()
        }

        val authenticationNumberButton = findViewById<Button>(R.id.authenticationNumberButton)
        authenticationNumberButton.setOnClickListener {
            val authenticationNumber = Intent(this, AuthenticationNumberActivity::class.java)
            startActivity(authenticationNumber)
        }
    }
}