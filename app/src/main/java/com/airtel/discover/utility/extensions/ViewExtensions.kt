package com.workwin.aurora.commons.extensions

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/**
 *  Some useful extension function
 *
 * @author Sandeep Kasar
 * @version v1.0.16
 * */

/** to show view */
fun View.visible() {
    visibility = View.VISIBLE
}

/** to hide view */
fun View.invisible() {
    visibility = View.INVISIBLE
}

/** to gone view */
fun View.gone() {
    visibility = View.GONE
}

/** to enable view */
fun View.enable() {
    isEnabled = true
}

/** to disable view */
fun View.disable() {
    isEnabled = false
}

/** to empty Text view */
fun TextView.setEmpty() {
    text = ""
}

/** to get Color compat view */
fun Context.getColorCompat(@ColorRes colorRes: Int) = ContextCompat.getColor(this, colorRes)

