package dsm.deconhub.android.deconhub_android.contest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.loginsign.SignActivity
import kotlinx.android.synthetic.main.activity_contest_detail.*
import kotlin.math.sign

class ContestDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contest_detail)

        backButtonContestDetail.setOnClickListener {
            val connect = Intent(this, MainActivity::class.java)
            connect.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(connect)
        }

        questionContestDetail.setOnClickListener {
            val questionList = Intent(this, ContestQuestionListActivity::class.java)
            startActivity(questionList)
        }

        finishButtonContestDetail.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com/"))
            startActivity(intent)
        }
    }
}