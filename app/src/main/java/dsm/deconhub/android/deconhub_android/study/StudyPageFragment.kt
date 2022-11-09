package dsm.deconhub.android.deconhub_android.study

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

class StudyPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_study_page, null)
        val studyDetailButton = view.findViewById<LinearLayout>(R.id.studyDetail)
        val searchButton = view.findViewById<ImageButton>(R.id.searchButton)
        val createStudyButton = view.findViewById<FloatingActionButton>(R.id.createStudyButton)

        studyDetailButton.setOnClickListener(
            ({
                val intent = Intent(context, StudyDetailActivity::class.java)
                startActivity(intent)
                activity?.finish()
            })
        )

        searchButton.setOnClickListener(
            ({
                val intent = Intent(context, StudySearchActivity::class.java)
                startActivity(intent)
                activity?.finish()
            })
        )

        createStudyButton.setOnClickListener(
            ({
                val intent = Intent(context, StudyCreateActivity::class.java)
                startActivity(intent)
                activity?.finish()
            })
        )

        return view
    }
}