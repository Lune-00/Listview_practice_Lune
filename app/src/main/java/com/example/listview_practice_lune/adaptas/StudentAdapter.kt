package com.example.listview_practice_lune.adaptas

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listview_practice_lune.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}