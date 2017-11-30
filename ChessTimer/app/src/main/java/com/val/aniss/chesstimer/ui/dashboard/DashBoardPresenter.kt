package com.`val`.aniss.chesstimer.ui

import com.`val`.aniss.chesstimer.model.ChessTimer
import com.`val`.aniss.chesstimer.model.Player
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Anahi Valdiviezo
 */
class DashBoardPresenter : DashBoardContract.Presenter {

    var player1 : Player? = null
    var player2 : Player? = null
    var timerPlayer1 : ChessTimer? = null
    var timerPlayer2 : ChessTimer? = null

    override fun instantiateGame() {

    }


    fun initTimerforPlayer(p: Player?) {
        if(p != null) {
         //   chronometer_chess1!!.base = (SystemClock.elapsedRealtime() + (p.timer!!.timeWhenStopped * 60000))

            //(p1.timer!!.totalTime * 60000 + 30 * 1000)
            //1000ms = 1seg -- 60000ms = 1min -- 60000*60 == 1hora
            //  chronometer.isCountDown = true
           // chronometer.setOnClickListener({ v -> changeStatusChronometer(p) })
        }
    }
    override fun cancelRequests() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    // implementation of methods from Presenter

    override fun getListOfPlayed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTotalGameTime() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMatchWinner() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getQuantityOfMoves() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}