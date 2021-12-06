package com.workwin.aurora.utils.extensions

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.reflect.KClass

/** Extension fun for fragment to create its own view model object */
fun <T : ViewModel> Fragment.viewModel(factory: ViewModelProvider.Factory,
                                       model: KClass<T>): T {
    return ViewModelProvider(this, factory).get(model.java)
}

/** Extension fun for fragment to create its shared view model object */
fun <T : ViewModel> Fragment.sharedViewModel(factory: ViewModelProvider.Factory,
                                             model: KClass<T>): T {
        return ViewModelProvider(this.requireActivity(), factory).get(model.java)

}