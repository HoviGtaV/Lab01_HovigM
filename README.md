# Lab01_HovigM
Lab 01 - News List (Lab01_HovigM)

This app has only one Activity (MainActivity). It displays a list of news items like the lab screenshot.

What I did:
- Used RecyclerView in activity_main.xml to show the list.
- Created item_news.xml for the row layout (image + title + description).
- Created a NewsItem data class (title, description, image).
- Created a NewsAdapter (RecyclerView Adapter) to connect the data to the list.

Bonus:
- Added a divider line between items.
- Made each item different (different title/description/icon).

How to run:
Open the project in Android Studio, wait for Gradle sync, then press Run on an emulator/device.