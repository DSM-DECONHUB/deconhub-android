package dsm.deconhub.android.deconhub_android.mypage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.loginsign.LoginActivity
import dsm.deconhub.android.deconhub_android.study.StudyDetailActivity

class MyPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_my_page, null)
        val myContestButton = view.findViewById<Button>(R.id.myContestButton)
        val settingButton = view.findViewById<Button>(R.id.settingButton)
        val setNewPasswordButton = view.findViewById<Button>(R.id.setNewPasswordButton)
        val leaveButton = view.findViewById<Button>(R.id.leaveButton)

        myContestButton.setOnClickListener(
            ({
            })
        )

        settingButton.setOnClickListener(
            ({
            })
        )

        setNewPasswordButton.setOnClickListener(
            ({
            })
        )

        leaveButton.setOnClickListener(
            ({
            })
        )

        return view
    }
}