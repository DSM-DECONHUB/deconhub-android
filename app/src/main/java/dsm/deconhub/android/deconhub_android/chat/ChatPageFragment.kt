package dsm.deconhub.android.deconhub_android.chat

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.databinding.FragmentChatPageBinding
import dsm.deconhub.android.deconhub_android.study.StudySearchActivity

class ChatPageFragment : Fragment() {
    lateinit var binding: FragmentChatPageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat_page, null)
        val chatDetailButton = view.findViewById<LinearLayout>(R.id.chatDetailButton)
        val friendsButton = view.findViewById<ImageButton>(R.id.friendsButton)

        chatDetailButton.setOnClickListener(
            ({
                val intent = Intent(context, ChatDetailActivity::class.java)
                startActivity(intent)
                activity?.finish()
            })
        )

        friendsButton.setOnClickListener(
            ({
                val intent = Intent(context, ChatFriendsActivity::class.java)
                startActivity(intent)
                activity?.finish()
            })
        )

        return view
    }
}