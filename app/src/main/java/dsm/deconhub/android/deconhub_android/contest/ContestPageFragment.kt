package dsm.deconhub.android.deconhub_android.contest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import dsm.deconhub.android.deconhub_android.R

class ContestPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contest_page, null)
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