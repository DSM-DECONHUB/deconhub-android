package dsm.deconhub.android.deconhub_android.mypage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.data.RequestToServer
import dsm.deconhub.android.deconhub_android.data.ResponseLogin
import dsm.deconhub.android.deconhub_android.data.ResponseUser
import dsm.deconhub.android.deconhub_android.loginsign.LoginActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
        val logoutButton = view.findViewById<Button>(R.id.logoutButton)
        val leaveButton = view.findViewById<Button>(R.id.leaveButton)

        val accountIdMy = view.findViewById<TextView>(R.id.accountIdMy)
        val emailMy = view.findViewById<TextView>(R.id.emailMy)



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

        logoutButton.setOnClickListener(
            ({
                val intent = Intent(context, LoginActivity::class.java)
                startActivity(intent)
                activity?.finish()
            })
        )
        leaveButton.setOnClickListener(
            ({
            })
        )

        return view
    }
}