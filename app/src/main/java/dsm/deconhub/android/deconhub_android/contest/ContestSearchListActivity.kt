package dsm.deconhub.android.deconhub_android.contest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.loginsign.SignActivity
import kotlinx.android.synthetic.main.activity_contest_search_list.*
import kotlin.math.sign

class ContestSearchListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contest_search_list)

        backButtonContestSearchList.setOnClickListener {
            val back = Intent(this, MainActivity::class.java)
            back.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(back)
        }

        searchButtonContestSearchList.setOnClickListener {
            onBackPressed()
            val searchList = Intent(this, ContestSearchListActivity::class.java)
            startActivity(searchList)
        }
    }
}