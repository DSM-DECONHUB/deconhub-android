package dsm.deconhub.android.deconhub_android.contest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.R
import kotlinx.android.synthetic.main.activity_contest_question_detail.*

class ContestQuestionDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contest_question_detail)

        backButtonContestQuestionDetail.setOnClickListener {
            onBackPressed()
        }
    }
}