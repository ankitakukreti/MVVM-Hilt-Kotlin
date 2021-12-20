package com.workwin.aurora.utils.extensions

import android.view.View
import android.widget.EditText
import android.widget.TextView

/** to clear editText */
fun EditText.clear(){
    if(text!=null){
        text.clear()
    }
}

/** to clear and then hide editText */
fun TextView.hideAndClear(){
    text = ""
    this.visibility = View.GONE
}