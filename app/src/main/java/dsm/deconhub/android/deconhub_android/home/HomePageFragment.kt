package dsm.deconhub.android.deconhub_android.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.chat.ChatDetailActivity
import dsm.deconhub.android.deconhub_android.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_page, null)
        val searchButton = view.findViewById<ImageButton>(R.id.searchButton)
        val notificationButton = view.findViewById<ImageButton>(R.id.notificationButton)

        searchButton.setOnClickListener(
            ({
            })
        )

        notificationButton.setOnClickListener(
            ({
            })
        )

        return view
    }
}