package dsm.deconhub.android.deconhub_android.chat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.databinding.FragmentHomePageBinding

class ChatPageFragment : Fragment() {lateinit var binding: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomePageBinding.inflate(inflater, container, false)

        return binding.root
    }
}