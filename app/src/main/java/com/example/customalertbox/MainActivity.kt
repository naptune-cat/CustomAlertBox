package com.example.customalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickbtn = findViewById<Button>(R.id.clickBtn)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_alertbox)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.round_bg))
        var okbtn = dialog.findViewById<Button>(R.id.okBtn)
        var cancelBtn = dialog.findViewById<Button>(R.id.cancelBtn)

        okbtn.setOnClickListener {
            dialog.dismiss()
        }
        cancelBtn.setOnClickListener {
            Toast.makeText(this, "CAncelled", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        clickbtn.setOnClickListener {
             dialog.show()
        }
    }
}