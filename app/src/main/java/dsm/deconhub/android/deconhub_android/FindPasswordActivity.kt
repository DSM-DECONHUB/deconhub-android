package dsm.deconhub.android.deconhub_android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FindPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_findpassword)
        val nextButton = findViewById<Button>(R.id.nextbutton)

        nextButton.setOnClickListener{
            val next = Intent(this, FindPasswordActivity::class.java)

            startActivity(next)
        }
    }
}