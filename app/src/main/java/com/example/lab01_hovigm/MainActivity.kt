package com.example.lab01_hovigm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.newsRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Bonus (2 pts): different content per item
        val newsList = listOf(
            NewsItem(
                "Campus Event Announced",
                "A new student event will happen this weekend. Check the schedule and register.",
                android.R.drawable.ic_dialog_info
            ),
            NewsItem(
                "Exam Schedule Updated",
                "The midterm exam timetable has been updated. Please review the new dates.",
                android.R.drawable.ic_menu_my_calendar
            ),
            NewsItem(
                "New Lab Materials Uploaded",
                "Slides, starter code, and examples are now available. Download them from the course page.",
                android.R.drawable.ic_menu_upload
            ),
            NewsItem(
                "Workshop Reminder",
                "Don’t forget the mobile workshop tomorrow at 10:00 AM. Attendance is recommended.",
                android.R.drawable.ic_menu_agenda
            ),
            NewsItem(
                "Important Announcement",
                "Please read the new course policy update posted today. It affects deadlines.",
                android.R.drawable.ic_dialog_alert
            )
        )

        recyclerView.adapter = NewsAdapter(newsList)
    }
}