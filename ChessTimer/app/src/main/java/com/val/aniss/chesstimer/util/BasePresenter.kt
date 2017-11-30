package com.`val`.aniss.chesstimer.util

/**
 * @author Anahi Valdiviezo
 */

interface BasePresenter<V : BaseView<V>>{

//    protected fun getString(langKey: String): String {
//        return Lang.L(langKey)
//    }

    abstract fun cancelRequests()
}