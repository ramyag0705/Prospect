package com.example.prospect

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//class FragmentOne : Fragment() {
//
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var adapter: UserProfileAdapter
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.fragment_one, container, false)
//
//        recyclerView = view.findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = LinearLayoutManager(requireContext())
//        adapter = UserProfileAdapter(getSampleUserProfiles(), ::onItemClick)
//        recyclerView.adapter = adapter
//
//        return view
//    }
//
//    private fun getSampleUserProfiles(): List<UserProfile> {
//        // Replace this with your actual data retrieval logic
//        return listOf(
//            UserProfile("User 1", 25, "Bio 1"),
//            UserProfile("User 2", 30, "Bio 2"),
//            UserProfile("User 3", 27, "Bio 3"),
//            UserProfile("User 4", 35, "Bio 4"),
//            UserProfile("User 5", 35, "Bio 5"),
//            UserProfile("User 6", 35, "Bio 6"),
//            UserProfile("User 7", 35, "Bio 7"),
//            UserProfile("User 8", 35, "Bio 8"),
//            UserProfile("User 9", 35, "Bio 9"),
//            UserProfile("User 10", 35, "Bio 10"),
//            UserProfile("User 11", 35, "Bio 11"),
//            UserProfile("User 12", 35, "Bio 12"),
//            UserProfile("User 13", 35, "Bio 13"),
//        )
//    }
//
//    private fun onItemClick(userProfile: UserProfile) {
//        val fragmentTwo = FragmentTwo.newInstance(userProfile)
//        requireActivity().supportFragmentManager.beginTransaction()
//            .replace(R.id.fragmentContainer, fragmentTwo)
//            .addToBackStack(null)
//            .commit()
//    }
//}

class FragmentOne : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: UserProfileAdapter
//    private lateinit var acceptButton: Button
//    private lateinit var rejectButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = UserProfileAdapter(getSampleUserProfiles(), ::onItemClick)
        recyclerView.adapter = adapter
        val list=getSampleUserProfiles()
        adapter.submitList(list)

//        acceptButton = view.findViewById(R.id.acceptButton)
//        rejectButton = view.findViewById(R.id.rejectButton)

//        acceptButton.setOnClickListener {
//            acceptButton.setBackgroundColor(Color.GREEN)
//            rejectButton.setBackgroundColor(Color.TRANSPARENT)
//        }

        return view
    }

    private fun getSampleUserProfiles(): List<UserProfile> {
        // Replace this with your actual data retrieval logic
        return listOf(
            UserProfile("User 1", 25, "Bio 1"),
            UserProfile("User 2", 30, "Bio 2"),
            UserProfile("User 3", 27, "Bio 3"),
            UserProfile("User 4", 35, "Bio 4"),
            UserProfile("User 5", 35, "Bio 5"),
            UserProfile("User 6", 35, "Bio 6"),
            UserProfile("User 7", 35, "Bio 7"),
            UserProfile("User 8", 35, "Bio 8"),
            UserProfile("User 9", 35, "Bio 9"),
            UserProfile("User 10", 35, "Bio 10"),
            UserProfile("User 11", 35, "Bio 11"),
            UserProfile("User 12", 35, "Bio 12"),
            UserProfile("User 13", 35, "Bio 13"),
        )
    }

    private fun onItemClick(userProfile: UserProfile) {
        val fragmentTwo = FragmentTwo.newInstance(userProfile)
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragmentTwo)
            .addToBackStack(null)
            .commit()
    }
}


