package com.example.chasmagharapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chasmagharapplication.adapters.MyRecyclerViewAdapter
import com.example.chasmagharapplication.datamodels.User
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = getAdapter()
    }

    private fun getAdapter() : MyRecyclerViewAdapter {
        return MyRecyclerViewAdapter(getListOfUsers())
    }

    /**
     * Check out difference between a List and MutableList and ArrayList
     */
    private fun getListOfUsers() : List<User> {
        val userList = mutableListOf<User>()

        userList.add(getUser("Googles" , "Range of latest Googles"))
        userList.add(getUser("Frames" , "Range of latest Frames"))
        userList.add(getUser("Aviator" , "Range of latest Aviator"))
        userList.add(getUser("Specs" , "Range of latest Specs"))

        return userList
    }

    private fun getUser(name : String, description : String) : User {
        return User(name, description)
    }
}
