package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 =  findViewById<Button>(R.id.button)
        button1.setOnClickListener{
            val intent1 = Intent (this, SecondActivity::class.java)
            startActivity(intent1)
        }
    }

    @Override
    protected fun OnStart() {
        super.onStart();
        Toast.makeText(this,"App on Start",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected fun OnStop() {
        super.onStop();
        Toast.makeText(this,"App on Stop",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected fun OnRestart() {
        super.onRestart();
        Toast.makeText(this,"App on Restart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected fun OnResume() {
        super.onResume();
        Toast.makeText(this,"App on Resume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected fun OnPause() {
        super.onPause();
        Toast.makeText(this,"App on Pause",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected fun OnDestroy() {
        super.onDestroy();
        Toast.makeText(this,"App on Destroy",Toast.LENGTH_SHORT).show();
    }
}