package com.`val`.aniss.chesstimer

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import android.widget.Chronometer
import com.`val`.aniss.chesstimer.model.Player
import com.`val`.aniss.chesstimer.model.Match
import com.`val`.aniss.chesstimer.ui.DashBoardContract
import com.`val`.aniss.chesstimer.ui.DashBoardPresenter
import com.`val`.aniss.chesstimer.ui.Settings.SettingsActivity
import kotlinx.android.synthetic.main.activity_main.*

class DashBoardActivity : AppCompatActivity(), DashBoardContract.View {

    lateinit var dashboardPresenter : DashBoardPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        initElements()
    }

/*    fun initTimerforPlayer(p: Player?) {
        if(p != null) {
            chronometer_chess1!!.base = (SystemClock.elapsedRealtime() + (p.timer.timeWhenStopped * 60000))

            //(p1.timer!!.totalTime * 60000 + 30 * 1000)
            //1000ms = 1seg -- 60000ms = 1min -- 60000*60 == 1hora
            //chronometer.isCountDown = true
            //chronometer.setOnClickListener({ v -> changeStatusChronometer(p) })
        }
    }*/

    override fun onResume() {
        super.onResume()
    }

    private fun initElements() {
        dashboardPresenter= DashBoardPresenter()
        dashboardPresenter.instantiateGameByDefault()
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
    }

    fun initChronometers() {
        //init with totalTime
        chronometer_chess1.base = (SystemClock.elapsedRealtime() + (Match.player1.timer.totalTime * 60000))
        chronometer_chess2.base = (SystemClock.elapsedRealtime() + (Match.player2.timer.totalTime * 60000))
            //(p1.timer!!.totalTime * 60000 + 30 * 1000)
            //1000ms = 1seg -- 60000ms = 1min -- 60000*60 == 1hora
        chronometer_chess1.isCountDown = true
        chronometer_chess2.isCountDown = true

        //chronometers from player 1 and player 2
        chronometer_chess1.setOnClickListener {
            startOrPausePlayerTimer(chronometer_chess1, Match.player1)
        }

        chronometer_chess2.setOnClickListener {
            startOrPausePlayerTimer(chronometer_chess2, Match.player2)
        }
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

    override fun startOrPausePlayerTimer(chronometer: Chronometer, p : Player) {
        if (p.timer.isPaused) {
            chronometer.start()
            p.timer.isPaused = false
        } else {
            chronometer.stop()
            p.timer.isPaused = true
        }
    }

}