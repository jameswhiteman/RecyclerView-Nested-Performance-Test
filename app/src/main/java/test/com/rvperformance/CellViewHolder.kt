package test.com.rvperformance

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

open class CellViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(
            drawableResId: Int,
            text: String
    ) {
        val imageView = itemView.findViewById<ImageView>(R.id.icon)
        val textView = itemView.findViewById<TextView>(R.id.title)

        imageView.setImageResource(drawableResId)
        textView.text = text
    }
}