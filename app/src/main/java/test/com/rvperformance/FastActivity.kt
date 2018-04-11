package test.com.rvperformance

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView

class FastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fast_layout)
        val items = findViewById<RecyclerView>(R.id.items)
        items.setHasFixedSize(true)
        items.adapter = CellAdapter(hasHeader = true, itemCount = 1000)
    }
}