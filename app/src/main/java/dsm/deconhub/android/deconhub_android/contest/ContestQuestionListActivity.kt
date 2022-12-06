package dsm.deconhub.android.deconhub_android.contest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.loginsign.SignActivity
import kotlinx.android.synthetic.main.activity_contest_question_list.*
import kotlin.math.sign

class ContestQuestionListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contest_question_list)

        backButtonContestQuestionList.setOnClickListener {
            onBackPressed()
        }


        questionButtonContestQuestionList.setOnClickListener {
            val questionCreate = Intent(this, ContestQuestionCreateActivity::class.java)
            startActivity(questionCreate)
        }
    }
}