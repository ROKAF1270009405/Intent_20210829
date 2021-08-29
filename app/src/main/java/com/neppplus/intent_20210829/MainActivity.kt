package com.neppplus.intent_20210829

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE_FOR_NICKNAME = 1004

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNicknameBtn.setOnClickListener {

            //닉네임 변경 화면으로 이동.

            //단순 이동 X, 새 닉네임을 받아오기 위한 왕복 이동

            //Intent 변수 만드는 과정 동일

            val myIntent = Intent(this,editNicknameBtn::class.java)

            //데이터(닉네임)를 받아오기 위한 왕복 이동 명시

            startActivityForResult(myIntent, REQUEST_CODE_FOR_NICKNAME)

        }

        sendMessageBtn.setOnClickListener {

            //메세지 보내기가 눌리면

            //입력한 내용이 어떻게 되는지 변수에 저장

            val inputContent = messageEdt.text.toString()

            //메세지조회화면으로 (입력한 내용을 들고) 이동

            val myIntent = Intent(this,ViewMessageActivity::class.java)

            //String을 첨부
            myIntent.putExtra("inputMessage", inputContent)
            // Int을 첨부
            myIntent.putExtra("number",2021)

            startActivity(myIntent)

        }

        moveToOtherBtn.setOnClickListener {


            //clicked moveToOtherBtn??

            //어디서 -> 어느 화면으로 이동할건지 정보(Intent) 명시. => 변수에 담아서 저장.
            val myIntent = Intent(this, OtherActivity::class.java)

            //실제로 이동 시키자
            startActivity(myIntent)

        }

    }
}