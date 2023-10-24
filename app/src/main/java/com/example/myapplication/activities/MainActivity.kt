package com.example.myapplication.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {
    private lateinit var btnInsertData: Button
    private lateinit var btnFetchData: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnInsertData = findViewById(R.id.btnInsertData)
        btnFetchData = findViewById(R.id.btnFetchData)

        btnInsertData.setOnClickListener {
            val intent = Intent(this, InsertionActivity::class.java)
            startActivity(intent)
        }

        btnFetchData.setOnClickListener {
            val intent = Intent(this, FetchingActivity::class.java)
            startActivity(intent)
        }

    }
}


//    override fun onStart() {
//        super.onStart()
//        val toast =Toast.makeText(applicationContext,"onStart called",Toast.LENGTH_LONG).show()
//        Log.d("LIFE","onStart called")
//    }
//    override fun onRestart() {
//        super.onRestart()
//        val toast =Toast.makeText(applicationContext,"onRestart called",Toast.LENGTH_LONG).show()
//        Log.d("LIFE","onRestart called")
//    }
//    override fun onResume() {
//        super.onResume()
//        val toast =Toast.makeText(applicationContext,"onResume called",Toast.LENGTH_LONG).show()
//        Log.d("LIFE","onResume called")
//    }
//    override fun onPause() {
//        super.onPause()
//        val toast =Toast.makeText(applicationContext,"onPause called",Toast.LENGTH_LONG).show()
//        Log.d("LIFE","onPause called")
//    }
//    override fun onStop() {
//        super.onStop()
//        val toast = Toast.makeText(applicationContext,"onStop called",Toast.LENGTH_LONG).show()
//        Log.d("LIFE","onStop called")
//    }
//    override fun onDestroy() {
//        super.onDestroy()
//        val toast =Toast.makeText(applicationContext,"onDestroy called",Toast.LENGTH_LONG).show()
//        Log.d("LIFE","onDestroy called")
//    }


