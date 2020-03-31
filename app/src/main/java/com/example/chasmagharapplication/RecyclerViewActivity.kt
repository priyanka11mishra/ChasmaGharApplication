package com.example.chasmagharapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val recycler = findViewById<RecyclerView>(R.id.recyclerview)
       // Recycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        val users=ArrayList<User>()
        users.add(User("Googles", "Range of Latest Googles"))
        users.add(User("Frames", "Range of Latest Frames"))
        users.add(User("Avitor", "Range of Latest Aviator"))
        users.add(User("Specs", "Range of Latest specs"))

        val adapter=Adapter(users)
        recycler.adapter=adapter
    }
}
