package dsm.deconhub.android.deconhub_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import dsm.deconhub.android.deconhub_android.chat.ChatPageFragment
import dsm.deconhub.android.deconhub_android.contest.ContestPageFragment
import dsm.deconhub.android.deconhub_android.mypage.MyPageFragment
import dsm.deconhub.android.deconhub_android.study.StudyPageFragment

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    lateinit var bottomNavigationView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener(this)

        //첫 프래그먼트 화면은 home fragment로
        bottomNavigationView.selectedItemId = R.id.homeFragment


    }

    //Implement member
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.homeFragment ->{
                val fragment = ContestPageFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.bottom_container,fragment)
                    // view_main이 보여지는 화면에 fragment를 보여줘라
                    .commit()
                return true
            }
            R.id.studyFragment ->{
                val fragment = StudyPageFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.bottom_container,fragment)
                    .commit()
                return true
            }
            R.id.chatFragment ->{
                val fragment = ChatPageFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.bottom_container,fragment)
                    .commit()
                return true
            }
            R.id.myPageFragment ->{
                val fragment = MyPageFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.bottom_container,fragment)
                    .commit()
                return true
            }
        }
        return false
    }
}