package com.haeyul.goodwords

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("사람에게 하나의 입과 두 개의 귀가 있는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다.")
        sentenceList.add("세상에 실패할 것 같은 것이 성공하는 이유가 있다. 그건 근처에서 다 알려주기 때문이다.")
        sentenceList.add("그 사람 입장에서 서기 전까지 절대 그 사람을 욕하거나 책망하지 마라.")
        sentenceList.add("뛰어난 말에게도 채찍이 필요하다.")
        sentenceList.add("승자는 눈을 밝아 길을 만들지만 패자는 눈이 녹기를 기다린다.")
        sentenceList.add("두 개의 화살을 갖지 마라. 두 번째 화살이 있기 떄문에 첫 번째 화살에 집중하지 않게 된다.")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter
    }
}