package com.example.mein_erfolgsjournal.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.mein_erfolgsjournal.data.Repository

class MainViewModel(application: Application):AndroidViewModel(application) {

    val repository = Repository()

}