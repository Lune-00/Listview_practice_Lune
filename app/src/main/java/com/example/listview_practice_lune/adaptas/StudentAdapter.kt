package com.example.listview_practice_lune.adaptas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
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

        return row
    }

}