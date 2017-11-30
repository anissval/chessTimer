package com.`val`.aniss.chesstimer.model

/**
 * @author Anahi Valdiviezo
 */
    data class ChessTimer(var totalTime : Long) {

    var timeAvailable: Long = totalTime
    var timeWhenStopped : Long = totalTime
    var isPaused : Boolean = false
    var currentTime : String = "00:00:00"

    var  begin  : Long? = null
    var end : Long? = null

    fun updateTimer (hour : Int, minutes : Int , seconds : Int ) : String {
        //obtener el tiempo disponible al pausarse
        currentTime = " $hour : $minutes : $seconds "
        return currentTime
    }

    fun pauseGame (gameState : Boolean) {
        //pause and start game
        isPaused = gameState
    }

    fun resetGame () {

        //stop
    }




}