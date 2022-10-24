package dsm.deconhub.android.deconhub_android.study

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dsm.deconhub.android.deconhub_android.databinding.FragmentStudyPageBinding

class StudyPageFragment : Fragment() {
    lateinit var binding: FragmentStudyPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStudyPageBinding.inflate(inflater, container, false)

        return binding.root
    }
}