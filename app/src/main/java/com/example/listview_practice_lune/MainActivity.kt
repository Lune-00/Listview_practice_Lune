package com.example.listview_practice_lune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview_practice_lune.adaptas.StudentAdapter
import com.example.listview_practice_lune.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("홍", 2017) )
        mStudentList.add( Student("초", 2018) )
        mStudentList.add( Student("해", 2019) )
        mStudentList.add( Student("동호", 2017) )
        mStudentList.add( Student("송화", 2017) )
        mStudentList.add( Student("올리버", 2017) )
        mStudentList.add( Student("클레어", 2017) )

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

    }
}