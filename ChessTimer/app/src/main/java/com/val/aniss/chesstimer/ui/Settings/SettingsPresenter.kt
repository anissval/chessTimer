package com.`val`.aniss.chesstimer.ui.Settings

import com.`val`.aniss.chesstimer.model.Match

/**
 * @author Anahi Valdiviezo
 */
class SettingsPresenter : SettingsContract.Presenter {

    override fun cancelRequests() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun instantiateGame(time: Long, name1: String, name2: String) {
        var gameTotalTime : Long = time
        Match.instantiate(gameTotalTime)
    }

}