package com.example.prospect

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.prospect.databinding.ItemUserProfileBinding

class UserProfileAdapter(
    private val profiles: List<UserProfile>,
    private val itemClickListener: (UserProfile) -> Unit
) :
    ListAdapter<UserProfile, UserProfileAdapter.CustomViewHolder>(LightShowDiffUtil) {

    inner class CustomViewHolder(
        private val context: Context,
        private val binding: ItemUserProfileBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(option: UserProfile) {
            binding.nameTextView.text = option.name
            binding.acceptButton.setOnClickListener {
//                itemClickListener(option)
                binding.rejectButton.setBackgroundColor(context.resources.getColor(R.color.black))
            }
            binding.rejectButton.setOnClickListener {
                itemClickListener(option)
//                binding.acceptButton.setBackgroundColor(context.resources.getColor(R.color.text_approved_color))
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            parent.context,
            ItemUserProfileBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val option = getItem(position)
        holder.itemView.setOnClickListener {

        }
        holder.bind(option)
    }

    companion object {
        object LightShowDiffUtil : DiffUtil.ItemCallback<UserProfile>() {
            override fun areItemsTheSame(
                oldItem: UserProfile,
                newItem: UserProfile
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: UserProfile,
                newItem: UserProfile
            ): Boolean {
                return oldItem.name == newItem.name
            }
        }
    }
}