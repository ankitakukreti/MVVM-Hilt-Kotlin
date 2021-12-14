package com.sample.explore.base

import androidx.appcompat.app.AppCompatActivity
import com.sample.explore.utility.extensions.ConnectionLiveData

class BaseActivity : AppCompatActivity() {

    //Method to check network state
      fun checkNetworkState(){
        // init
        val connectionLiveData = ConnectionLiveData(this)

        // observe network state
        connectionLiveData.observe(this,{ isNetworkAvailable->
            if (isNetworkAvailable){

            }else{

            }
        })
    }
}