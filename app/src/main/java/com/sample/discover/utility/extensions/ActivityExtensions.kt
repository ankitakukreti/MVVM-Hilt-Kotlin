package com.workwin.aurora.commons.extensions

import android.app.Activity
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.airtel.discover.BuildConfig
import kotlin.reflect.KClass

/** Extension fun for Fragment activity to create view model object */
fun <T : ViewModel> FragmentActivity.viewModel(
    factory: ViewModelProvider.Factory,
    model: KClass<T>
): T {
    return ViewModelProvider(this, factory).get(model.java)
}

/** Extension fun for AppCompact activity to create view model object */
fun <T : ViewModel> AppCompatActivity.viewModel(
    factory: ViewModelProvider.Factory,
    model: KClass<T>
): T {
    return ViewModelProvider(this, factory).get(model.java)
}

/** Extension fun for Fragment activity to show toast */
fun Activity.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

/** Extension fun for AppCompact activity to show toast */
fun FragmentActivity.showToast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

/** Extension fun for activity to print debug log */
fun Activity.logE(message: String) {
    if (BuildConfig.DEBUG) Log.d(this::class.java.simpleName, message)
}