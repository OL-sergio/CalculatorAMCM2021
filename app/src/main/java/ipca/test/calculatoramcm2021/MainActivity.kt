package ipca.test.calculatoramcm2021

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var textViewDisplay: TextView

    var onClickNum: (view: View) -> Unit = {
        val buttonPressed = it as Button
        textViewDisplay.text = textViewDisplay.text.toString().plus(buttonPressed.text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewDisplay = findViewById<TextView>(R.id.texteViewNumb)

        findViewById<Button>(R.id.button_0).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_1).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_2).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_3).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_4).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_5).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_6).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_7).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_8).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_9).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_mais).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_menos).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_ac).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_div).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_x).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_igual).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_virbula).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_mn).setOnClickListener(onClickNum)
        findViewById<Button>(R.id.button_prc).setOnClickListener(onClickNum)

    }
}