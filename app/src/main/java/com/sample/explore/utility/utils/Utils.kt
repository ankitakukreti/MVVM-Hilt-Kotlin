package com.sample.explore.utility.utils

import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class Utils {
    companion object{
        /**
         * UI Helper Starts
         */
        private var snackbar: Snackbar? = null
        fun showSnackBar(layout: View, color: Int, error: String) {
            snackbar = Snackbar.make(layout, error, Snackbar.LENGTH_SHORT)
            snackbar?.view?.setBackgroundColor(color)
            val tv = snackbar?.view?.findViewById<TextView>(com.google.android.material.R.id.snackbar_text) as TextView
            tv.maxLines = 4
            snackbar?.show()
        }
    }
}