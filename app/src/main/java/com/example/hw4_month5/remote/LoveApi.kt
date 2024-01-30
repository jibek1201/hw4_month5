package com.example.hw4_month5.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.hw4_month5.Repository

class LoveApi : ViewModel() {

    private val repository = Repository()

    fun getLove(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getLoveModel(firstName = firstName, secondName = secondName)
    }




}