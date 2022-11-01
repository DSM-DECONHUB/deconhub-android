package dsm.deconhub.android.deconhub_android.study

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R

class StudySearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_search)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            back.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(back)
        }

        val searchButton = findViewById<ImageButton>(R.id.imageButton2)
        searchButton.setOnClickListener {
        }
    }
}