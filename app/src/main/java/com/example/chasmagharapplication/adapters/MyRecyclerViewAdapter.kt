package com.example.chasmagharapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chasmagharapplication.R
import com.example.chasmagharapplication.datamodels.User
import kotlinx.android.synthetic.main.recycler_item.view.*

/**
 * Never use names like ViewHolder, Adapter or such that are predefined in Android
 * Class names, Method names etc should be clearly readable such that just by name a person get's gist of what this class might do
 * For example GooglesAdapter , this name gives idea that there must be something related to Googles etc
 */

class MyRecyclerViewAdapter (private val userList: List<User>):RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(user: User) {
            itemView.textViewUsername.text = user.name
            itemView.textViewAddress.text = user.description
        }
    }

    // Remove TODOs because they will create issues later on
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false);
        return MyViewHolder(view);

    }

    override fun getItemCount(): Int {
        return userList.size;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(userList[position]);
    }

}