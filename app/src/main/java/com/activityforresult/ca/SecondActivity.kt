package com.activityforresult.ca

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btSendResult.setOnClickListener{
            var text:String = edText.text.toString()

            val intent = Intent()
            intent.putExtra("keyName", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}
