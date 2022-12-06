package dsm.deconhub.android.deconhub_android.contest

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import dsm.deconhub.android.deconhub_android.R

class ContestPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contest_page, null)
        val searchButton = view.findViewById<ImageButton>(R.id.searchButtonContest)
        val idContest = view.findViewById<LinearLayout>(R.id.idContest)
        val createContest = view.findViewById<FloatingActionButton>(R.id.createContestButton)

        searchButton.setOnClickListener(({
            val intent = Intent(context, ContestSearchActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }))


        idContest.setOnClickListener(
            ({
                val intent = Intent(context, ContestDetailActivity::class.java)
                startActivity(intent)
                activity?.finish()
            })
        )

        createContest.setOnClickListener(
            ({
                val intent = Intent(context, ContestCreateActivity::class.java)
                startActivity(intent)
                activity?.finish()
            })
        )
        return view
    }
}