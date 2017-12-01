package com.`val`.aniss.chesstimer.ui.Settings

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.`val`.aniss.chesstimer.DashBoardActivity
import com.`val`.aniss.chesstimer.R
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity(), SettingsContract.View {

    var settingsPresenter : SettingsPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        initUI()
    }

    private fun initUI() {
        configure_game_buttton.setOnClickListener {

            //obtiene y pasa tiempo configurado (nombre tmb?)
            var time: Long = 5

            settingsPresenter!!.instantiateGame(time,"Jugador 1", "Jugador 2")

            var i : Intent = Intent(this, DashBoardActivity::class.java)
            startActivity(i)
            finish()
        }
    }

}
