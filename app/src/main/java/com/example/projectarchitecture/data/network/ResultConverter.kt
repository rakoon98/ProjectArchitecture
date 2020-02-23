package com.example.projectarchitecture.data.network

sealed class ResultConverter<out T> {

    // 성공의 경우 데이터 저장하는 부분
    data class Success<out T>(val data: T) : ResultConverter<T>()

    // 에러가 난 경우 에러 사항을 집어넣기 위함
    data class Error(val exception: Exception) : ResultConverter<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success [data=$data]"
            is Error -> "Error[Error=$exception]"
        }
    }

}