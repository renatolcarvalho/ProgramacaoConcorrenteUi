package br.edu.ifsp.scl.programacaoconcorrenteui

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import kotlinx.coroutines.*
import java.lang.Thread.sleep

class CoroutinesActivity : ProgramacaoConcorrenteActivity() {

    val job = SupervisorJob();
    val scope = CoroutineScope(Dispatchers.Default + job)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun run() {
        scope.launch {
            altaIv.setImageResource(R.drawable.android_preto)
            baixaIv.setImageResource(R.drawable.android_verde)
        }
    }
}