package dsm.deconhub.android.deconhub_android.loginsign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val login = Intent(this, MainActivity::class.java)
            login.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(login)
        }

        val signButton = findViewById<TextView>(R.id.signButton)
        signButton.setOnClickListener {
            val sign = Intent(this, SignActivity::class.java)
            startActivity(sign)
        }

        val findPasswordButton = findViewById<TextView>(R.id.findPasswordButton)
        findPasswordButton.setOnClickListener {
            val findPassword = Intent(this, FindPasswordActivity::class.java)
            startActivity(findPassword)
        }
    }
}