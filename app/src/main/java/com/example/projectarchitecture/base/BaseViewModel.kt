package com.example.projectarchitecture.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.projectarchitecture.data.network.ResultConverter
import retrofit2.HttpException

abstract class BaseViewModel : ViewModel() {

    // For Error Message
    var _errorTypeMessage = MutableLiveData<String>()

    fun <T> commonHandler(result : ResultConverter<T>, callback: (data:T) -> Unit){
        if (result is ResultConverter.Success) {
            callback(result.data)
        } else if(result is ResultConverter.Error) {
            result.exception.let {
                // httpException 이면 response 를 받아와서 메시지를 띄워줄수 있게해준다.
                when (it) {
                    is HttpException -> {

                    }
                }
            }
        }
    }

}