@file:Suppress("DEPRECATION")

package com.noneoftheuser.bookapp.util

import android.content.Context
import android.content.Context.*
import android.net.ConnectivityManager
import android.net.NetworkInfo

class ConnectionManager {
    fun checkConnectivity(context: Context): Boolean {

    val connectivityManager = context.getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager

    val activeNetwork = connectivityManager.activeNetworkInfo

        return if (activeNetwork?.isConnected != null){
            activeNetwork.isConnected
        } else {
            false
        }
}
}


