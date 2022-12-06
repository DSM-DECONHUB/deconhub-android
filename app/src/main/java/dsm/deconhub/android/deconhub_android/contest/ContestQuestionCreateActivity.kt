package dsm.deconhub.android.deconhub_android.contest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R
import kotlinx.android.synthetic.main.activity_contest_question_create.*

class ContestQuestionCreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contest_question_create)

        backButtonContestQuestionCreate.setOnClickListener {
            onBackPressed()
        }

        finishButtonContestQuestionCreate.setOnClickListener {
            val finish = Intent(this, MainActivity::class.java)
            finish.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(finish)
        }
    }
}