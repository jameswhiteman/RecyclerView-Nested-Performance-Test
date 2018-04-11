package test.com.rvperformance

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView

class SlowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.slow_layout)
        val items = findViewById<RecyclerView>(R.id.items)
        items.setHasFixedSize(false)
        items.isNestedScrollingEnabled = false
        items.adapter = CellAdapter(hasHeader = false, itemCount = 1000)
    }
}