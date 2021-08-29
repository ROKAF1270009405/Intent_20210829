package com.neppplus.intent_20210829

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        //복귀 버튼이 눌리면 => 메인화면으로 이동.

        returnToMainBtn.setOnClickListener {

            //Intent를 이용, 메인으로 이동

            //val otherIntent = Intent(this, MainActivity::class.java)

            //startActivity(otherIntent)


            //지금 보고 있는 다른 화면을 종료처리

            finish()

        }
    }
}