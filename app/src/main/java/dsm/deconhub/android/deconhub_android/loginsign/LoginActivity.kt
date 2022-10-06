package dsm.deconhub.android.deconhub_android.loginsign

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signButton = findViewById<TextView>(R.id.textButton1)
        signButton.setOnClickListener {
            val sign = Intent(this, SignActivity::class.java)

            startActivity(sign)
        }

        val findPasswordButton = findViewById<TextView>(R.id.textButton2)
        findPasswordButton.setOnClickListener {
            val findPassword = Intent(this, FindPasswordActivity::class.java)

            startActivity(findPassword)
        }
    }
}