package dsm.deconhub.android.deconhub_android

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signButton = findViewById<TextView>(R.id.textButton1)
        val findPasswordButton = findViewById<TextView>(R.id.textButton2)

        signButton.setOnClickListener {
            val sign = Intent(this, SignActivity::class.java)

            startActivity(sign)
        }
        findPasswordButton.setOnClickListener {
            val findPassword = Intent(this, FindPasswordActivity::class.java)

            startActivity(findPassword)
        }
    }
}