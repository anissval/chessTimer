package com.`val`.aniss.chesstimer.model

/**
 * @author Anahi Valdiviezo
 */
public object Match {

    //intanciar ambos jugadores
    lateinit var player1 : Player
    lateinit var player2 : Player
    lateinit var chessTimer_player1 : ChessTimer
    lateinit var chessTimer_player2 : ChessTimer

    fun instantiate(time : Long) {
        chessTimer_player1  = ChessTimer(time)
        chessTimer_player2= ChessTimer(time)
        player1 = Player("Jugador1", chessTimer_player1)
        player2 = Player("Jugador2", chessTimer_player2)
    }



}