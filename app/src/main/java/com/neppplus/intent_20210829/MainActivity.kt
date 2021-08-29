package com.neppplus.intent_20210829

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {

            //clicked moveToOtherBtn??

            //어디서 -> 어느 화면으로 이동할건지 정보(Intent) 명시. => 변수에 담아서 저장.
            val myIntent = Intent(this, OtherActivity::class.java)

            //실제로 이동 시키자
            startActivity(myIntent)

        }

    }
}