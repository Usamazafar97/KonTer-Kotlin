package com.example.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reset.setOnClickListener {
            count = 0
            setTextView(count)
        }
        increment.setOnClickListener {
            count += 1
            setTextView(count)
        }
        decrement.setOnClickListener {
            if (count >= 1)
                count -= 1
            setTextView(count)
        }
    }

    fun setTextView(value: Int) {
        quantity_text_view.setText(value.toString())
    }
}