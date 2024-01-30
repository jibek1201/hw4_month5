package com.example.hw4_month5

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.hw4_month5.remote.LoveModel

class LoveViewModel : ViewModel() {

    private val repository = Repository()

    fun getLove(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getLoveModel(firstName = firstName, secondName = secondName)
    }

}