package dsm.deconhub.android.deconhub_android.contest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R
import kotlinx.android.synthetic.main.activity_contest_create.*

class ContestCreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contest_create)

        backButtonContestCreate.setOnClickListener {
            val connect = Intent(this, MainActivity::class.java)
            connect.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(connect)
        }

        finishButtonContesteCreate.setOnClickListener {
            val finish = Intent(this, MainActivity::class.java)
            finish.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(finish)
        }
    }
}