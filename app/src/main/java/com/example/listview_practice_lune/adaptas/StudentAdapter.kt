package com.example.listview_practice_lune.adaptas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listview_practice_lune.R
import com.example.listview_practice_lune.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

        val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        "tem"Row> 임시로 쓰는 한 칸(다른 이름이어도 상관X)

        var tempRow = convertView
        if (tempRow == null){

            tempRow = inf.inflate(R.layout.student_list_item, null)

        }

        val row = tempRow!!

        val studentData = mList[position]

        val nameTxT = row.findViewById<TextView>(R.id.nameTxt)
        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearTxt)

        nameTxT.text = studentData.name

//        출생년도를 가지고 => 나이(2021년 기준 한국나이)로 변환해서 보여주기

        val koreanAge = 2021 - studentData.birthYear + 1

//        birthYearTxt.text = "(${studentData.birthYear})년생"

        birthYearTxt.text = "(${koreanAge})세"

        return row
    }

}