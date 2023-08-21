package com.example.prospect

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class FragmentTwo : Fragment() {

    private lateinit var userProfile: UserProfile
    private lateinit var acceptButton: Button
    private lateinit var rejectButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            userProfile = it.getParcelable(user_profile)!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two, container, false)

        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        val ageTextView: TextView = view.findViewById(R.id.ageTextView)
        val bioTextView: TextView = view.findViewById(R.id.bioTextView)
        acceptButton = view.findViewById(R.id.acceptButton)
        rejectButton = view.findViewById(R.id.rejectButton)

        nameTextView.text = userProfile.name
        ageTextView.text = userProfile.age.toString()
        bioTextView.text = userProfile.bio

        acceptButton.setOnClickListener {
            acceptButton.alpha = 0.5f // Set transparency to 50% (0.5)
            rejectButton.alpha = 1f // Set transparency to 100% (1.0)
        }

        rejectButton.setOnClickListener {
//            acceptButton.alpha = 1f
//            rejectButton.alpha = 0.5f
        }

        return view
    }

    companion object {
        private const val user_profile = "user_profile"

        fun newInstance(userProfile: UserProfile): FragmentTwo {
            val fragment = FragmentTwo()
            val args = Bundle()
            args.putParcelable(user_profile, userProfile)
            fragment.arguments = args
            return fragment
        }
    }
}




