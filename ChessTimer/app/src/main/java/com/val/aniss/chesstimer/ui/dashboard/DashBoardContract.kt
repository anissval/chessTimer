package com.`val`.aniss.chesstimer.ui

import com.`val`.aniss.chesstimer.DashBoardActivity
import com.`val`.aniss.chesstimer.util.BasePresenter
import com.`val`.aniss.chesstimer.util.BaseView

/**
 * @author Anahi Valdiviezo
 */
interface DashBoardContract {

    interface View : BaseView <DashBoardActivity>{
        fun changeButtonState()
        fun showQuantityOfMoves()
        fun ringAlarm()
        fun setPresenter(presenter : DashBoardPresenter?)
        fun openSettings()
        fun startOrPauseGame()
        fun stopOrResetGame()
        fun showMatchPlayed()
        fun startOrPausePlayerTimer()
    }

    interface Presenter : BasePresenter<DashBoardActivity>{
        fun getListOfPlayed()
        fun getTotalGameTime()
        fun getMatchWinner()
        fun getQuantityOfMoves()
        fun instantiateGame()
    }
}