package org.bubenheimer

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.os.StrictMode

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().detectExplicitGc().build())
        StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder().setClassInstanceLimit(Application::class.java, 10).build())
    }
}
