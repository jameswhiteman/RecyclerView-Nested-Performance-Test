package test.com.rvperformance

import android.support.v7.widget.RecyclerView.Adapter
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup

class CellAdapter(
        private val hasHeader: Boolean = false,
        private val itemCount: Int
) : Adapter<CellViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return if (position == 0 && hasHeader) {
            1
        } else {
            0
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CellViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return if (viewType == 0) {
            val view = inflater.inflate(R.layout.cell, parent, false)
            CellViewHolder(itemView = view)
        } else {
            val view = inflater.inflate(R.layout.header_item, parent, false)
            HeaderViewHolder(itemView = view)
        }
    }

    override fun getItemCount(): Int {
        val headerCount = if (hasHeader) {
            1
        } else {
            0
        }

        return itemCount + headerCount
    }

    override fun onBindViewHolder(holder: CellViewHolder, position: Int) {
        if (hasHeader && position == 0) {
            Log.d("CellAdapter", "Rendering header")
            return
        }

        Log.d("CellAdapter", "Rendering cell")
        holder.bind(R.drawable.ic_event_seat_red_24dp, "Hello, world!")
    }

}
