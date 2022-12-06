package dsm.deconhub.android.deconhub_android.contest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.loginsign.SignActivity
import kotlinx.android.synthetic.main.activity_contest_search.*
import kotlin.math.sign

class ContestSearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contest_search)

        backButtonContestSearch.setOnClickListener {
            onBackPressed()
        }

        searchButtonContestSearch.setOnClickListener {
            val searchList = Intent(this, ContestSearchListActivity::class.java)
            startActivity(searchList)
        }
    }
}