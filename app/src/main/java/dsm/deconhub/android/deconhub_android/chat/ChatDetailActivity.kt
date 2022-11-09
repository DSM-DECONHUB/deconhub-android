package dsm.deconhub.android.deconhub_android.chat

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R

class ChatDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_detail)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            back.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(back)
        }

        val moreButton = findViewById<ImageButton>(R.id.moreButton)
        moreButton.setOnClickListener {
        }

    }
}