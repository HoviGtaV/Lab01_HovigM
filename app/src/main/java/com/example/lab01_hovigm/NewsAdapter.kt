package com.example.lab01_hovigm
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val items: List<NewsItem>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.newsIcon)
        val title: TextView = itemView.findViewById(R.id.newsTitle)
        val desc: TextView = itemView.findViewById(R.id.newsDescription)
        val divider: View = itemView.findViewById(R.id.divider)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = items[position]
        holder.title.text = item.title
        holder.desc.text = item.description
        holder.icon.setImageResource(item.imageRes)

        // Bonus: divider between items (hide last)
        holder.divider.visibility = if (position == items.lastIndex) View.GONE else View.VISIBLE
    }

    override fun getItemCount(): Int = items.size
}