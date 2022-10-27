package dsm.deconhub.android.deconhub_android.mypage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.loginsign.LoginActivity


class MyPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_my_page, null)
        val logoutButton = view.findViewById<Button>(R.id.logout)

        logoutButton.setOnClickListener(
            ({
                val intent = Intent(context, LoginActivity::class.java)
                startActivity(intent)
                activity?.finish()
            }))
            return view
    }
}