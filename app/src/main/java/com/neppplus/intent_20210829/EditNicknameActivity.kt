package com.neppplus.intent_20210829

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

            //확인 버튼이 눌리면?

            //입력한 닉네임이 뭔지 변수에 저장
            val inputNickname = nicknameEdt.text.toString()

            //그 변수를 들고 이전화면으로 복귀(finish())
            //들고 : 데이터 첨부 -> Intent putExtra 활용

            //왕복용 티켓 (출발지 / 목적지 비워두자)

            val resultIntent = Intent()

            //닉네임 첨부

            resultIntent.putExtra("newNickname", inputNickname)

            //완료 (ok) 누른게 맞다 + Intent 세팅. => 이 화면의 결과 지정

            setResult(RESULT_OK, resultIntent)

            // 복귀 처리
            finish()


        }

    }
}