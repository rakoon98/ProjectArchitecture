package com.example.projectarchitecture.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner

abstract class BaseActivity <T : ViewDataBinding> : AppCompatActivity() , LifecycleOwner {

    lateinit var viewDataBinding: T
    abstract val layoutResourceId: Int

    // 바인딩 관련해서 진행해야하는 것들.
    abstract fun aboutBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 적용 ( 공통 )
        viewDataBinding = DataBindingUtil.setContentView(this, layoutResourceId)

    }

}