package com.`val`.aniss.chesstimer.ui

import com.`val`.aniss.chesstimer.model.Match
import com.`val`.aniss.chesstimer.model.Player

/**
 * @author Anahi Valdiviezo
 */
class DashBoardPresenter : DashBoardContract.Presenter {

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

    override fun instantiateGameByDefault() {
        var gameTotalTime : Long = 5
        Match.instantiate(gameTotalTime)    }

    override fun cancelRequests() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}