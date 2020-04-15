package com.example.sqlitetest6

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var btnStore: Button? = null
    private var btnGetall: Button? = null
    private var etname: EditText? = null
    private var ettitle: EditText? = null
    private var etlink: EditText? = null
    private var databaseHelper: DatabaseHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        databaseHelper = DatabaseHelper(this)

        btnStore = findViewById(R.id.btnstore) as Button
        btnGetall = findViewById(R.id.btnget) as Button
        etname = findViewById(R.id.etname) as EditText
        ettitle = findViewById(R.id.ettitle) as EditText
        etlink = findViewById(R.id.etlink) as EditText

        btnStore!!.setOnClickListener {
            databaseHelper!!.addUserDetail(etname!!.text.toString(), ettitle!!.text.toString(), etlink!!.text.toString())
            etname!!.setText("")
            ettitle!!.setText("")
            etlink!!.setText("")
            Toast.makeText(this@MainActivity, "Stored Successfully!", Toast.LENGTH_SHORT).show()
        }

        btnGetall!!.setOnClickListener {
            val intent = Intent(this@MainActivity, GetAllUsersActivity::class.java)
            startActivity(intent)
        }

    }
}
