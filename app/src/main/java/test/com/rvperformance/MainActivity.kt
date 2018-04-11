package test.com.rvperformance

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val slow = findViewById<Button>(R.id.slow)
        val fast = findViewById<Button>(R.id.fast)
        slow.setOnClickListener(this)
        fast.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = when (v!!.id) {
            R.id.slow -> {
                Intent(this, SlowActivity::class.java)
            }
            R.id.fast -> {
                Intent(this, FastActivity::class.java)
            }
            else -> {
                null
            }
        }
        intent?.let {
            startActivity(it)
        }
    }
}