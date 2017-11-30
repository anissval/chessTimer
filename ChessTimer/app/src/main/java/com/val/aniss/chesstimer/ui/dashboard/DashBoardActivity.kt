package com.`val`.aniss.chesstimer

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.`val`.aniss.chesstimer.model.Player
import com.`val`.aniss.chesstimer.model.ChessTimer
import com.`val`.aniss.chesstimer.model.Match
import com.`val`.aniss.chesstimer.ui.DashBoardContract
import com.`val`.aniss.chesstimer.ui.DashBoardPresenter
import com.`val`.aniss.chesstimer.ui.Settings.SettingsActivity
import kotlinx.android.synthetic.main.activity_main.*

class DashBoardActivity : AppCompatActivity(), DashBoardContract.View {

    var player1 : Player? = null
    var player2 : Player? = null
    var timerPlayer1 : ChessTimer? = null
    var timerPlayer2 : ChessTimer? = null
    var showTimer : Boolean = true

    override fun setPresenter(presenter: DashBoardActivity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var dashboardPresenter : DashBoardPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        initElements()
    }

    fun initTimerforPlayer(p: Player?) {
        if(p != null) {
            chronometer_chess1!!.base = (SystemClock.elapsedRealtime() + (p.timer!!.timeWhenStopped * 60000))

            //(p1.timer!!.totalTime * 60000 + 30 * 1000)
            //1000ms = 1seg -- 60000ms = 1min -- 60000*60 == 1hora
            //chronometer.isCountDown = true
            //chronometer.setOnClickListener({ v -> changeStatusChronometer(p) })
        }
    }

    fun changeStatusChronometer (p : Player?) {
        if (p != null) {
            when (p.timer!!.isPaused) {
                true -> {
                        p.timer!!.isPaused = false
                       // chronometer!!.base = (SystemClock.elapsedRealtime() + (timeWhenStopped * 60000))
                       // chronometer!!.start()
                    }
                false -> {
                        p.timer!!.isPaused = true
                       // chronometer!!.stop()
                       // timeWhenStopped = (SystemClock.elapsedRealtime() + chronometer.base * 60000)
                    }
                    }
        }
    }

    fun pauseChronometer (p : Player?) {
        when (p) {
            player1 -> {
                        chronometer_chess1.stop()
                        chronometer_chess2.start()
            }
            player2 -> {
                        chronometer_chess2.stop()
                        chronometer_chess1.start()
            }
        }
    }

    fun restartChronometer (p : Player) {
       // chronometer.start()
    }

    override fun onResume() {
        super.onResume()
    }

    fun updateUi(result: String) {

    }

    private fun initElements() {

        setPresenter(dashboardPresenter)

        initConfigurationElements()
        initChronometers()

    }

    fun initConfigurationElements() {

        imageButton_settings.setOnClickListener {
            openSettings()
        }

        imageButton_start_pause.setOnClickListener{
            startOrPauseGame()
        }

        imageButton_stop.setOnClickListener {
            stopOrResetGame()
        }
        imageButton_list.setOnClickListener {
            showMatchPlayed()
        }

        chronometer_chess1.setOnClickListener {
            startOrPausePlayerTimer()
        }

        chronometer_chess2.setOnClickListener {
            startOrPausePlayerTimer()
        }
    }

    fun initChronometers() {
        
    }


    // implementation of methods from View Contract

    override fun changeButtonState() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showQuantityOfMoves() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ringAlarm() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPresenter(presenter: DashBoardPresenter?) {
        this.dashboardPresenter = DashBoardPresenter()
    }

    override fun openSettings() {
        val i = Intent(this, SettingsActivity::class.java)
        startActivity(i)
        finish()
    }

    override fun startOrPauseGame() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stopOrResetGame() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showMatchPlayed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startOrPausePlayerTimer() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}