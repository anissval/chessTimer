package com.`val`.aniss.chesstimer.ui

import android.widget.Chronometer
import com.`val`.aniss.chesstimer.DashBoardActivity
import com.`val`.aniss.chesstimer.model.Player
import com.`val`.aniss.chesstimer.util.BasePresenter
import com.`val`.aniss.chesstimer.util.BaseView

/**
 * @author Anahi Valdiviezo
 */
interface DashBoardContract {

    interface View : BaseView {
        fun changeButtonState()
        fun showQuantityOfMoves()
        fun ringAlarm()
        fun openSettings()
        fun startOrPauseGame()
        fun stopOrResetGame()
        fun showMatchPlayed()
        fun startOrPausePlayerTimer(chronometer : Chronometer, p : Player)
    }

    interface Presenter : BasePresenter<DashBoardActivity> {
        fun getListOfPlayed()
        fun getTotalGameTime()
        fun getMatchWinner()
        fun getQuantityOfMoves()
        fun instantiateGameByDefault()
    }
}