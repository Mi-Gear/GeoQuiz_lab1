package com.example.lab1

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1.ui.theme.Lab1Theme
import android.widget.Toast


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
                    Message(applicationContext,"Рутинный пельмень 2")

        }
    }
}
fun Message(con:Context, text: String)
{
    val toast = Toast.makeText(con, text, Toast.LENGTH_LONG)
    toast.setGravity(Gravity.TOP,0,0)
    toast.show()
}