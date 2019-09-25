package jp.st_ventures.kotlinfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

const val EXTRA_MESSAGE = "jp.st_ventures.kotolinfirstapp"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{

            val editText = findViewById<EditText>(R.id.editText)
            val msg = editText.text.toString()

            val intent = Intent(this, DisplayMessageActivity::class.java).apply{
                putExtra(EXTRA_MESSAGE, msg)
            }
            startActivity(intent)
        }
    }
}
