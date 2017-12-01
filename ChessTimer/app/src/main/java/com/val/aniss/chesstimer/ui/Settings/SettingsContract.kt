package com.`val`.aniss.chesstimer.ui.Settings

import com.`val`.aniss.chesstimer.util.BasePresenter
import com.`val`.aniss.chesstimer.util.BaseView

/**
 * @author Anahi Valdiviezo
 */
interface SettingsContract {

    interface View : BaseView{

    }

    interface Presenter : BasePresenter<SettingsActivity> {
        fun instantiateGame (time : Long, name1 : String , name2 : String)
    }

    }