package com.example.customtoast

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.emreesen.sntoast.SnToast
import com.emreesen.sntoast.Type
import com.shashank.sony.fancytoastlib.FancyToast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val defaultButton = findViewById<Button>(R.id.buttondefault)
        val fancytButton = findViewById<Button>(R.id.buttonfancy)

        defaultButton.setOnClickListener{
           // FancyToast.makeText(this,"Hello World !", FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show()
           // Aik ma usi wala ma khud sa chiza change
            SnToast.Builder()
                .context(this@MainActivity)
                .backgroundColor(R.color.custom)
                .type(Type.ERROR)     //IMP
                .icon(R.drawable.baseline_auto_awesome_24)
                .message("Neatroots !!! ")   // .iconSize(int size) Optional Default: 34dp
                .textSize(24)                // Optional Default: 18sp
                .animation(true)            // Optional Default: True
                .cancelable(false)          // Optional Default: False
                .duration(3000)            // Optional Default: 3000ms
             .build()
        }
        // jo last ma true ya false ha wo is liya ka icon show ho toast ka upar jab message ma click karta android ka so it's up to you
        fancytButton.setOnClickListener{
           // FancyToast.makeText(this,"Hello Khan G 🎂",FancyToast.LENGTH_SHORT,FancyToast.WARNING,false).show()
            // Aik ma sida copy paste
            SnToast.Builder()
                .context(this@MainActivity)
                .type(Type.INFORMATION)
                .message("Information !")    //.cancelable(false or true) Optional Default: False
                // .iconSize(int size) Optional Default: 34dp
                // .textSize(int size) Optional Default 18sp
                // .animation(false or true) Optional Default: True
                // .duration(int ms) Optional Default: 3000ms
                // .backgroundColor(R.color.example) Default: It is filled according to the toast type. If an assignment is made, the assigned value is used
                // .icon(R.drawable.example) Default: It is filled according to the toast type. If an assignment is made, the assigned value is used
                .build()
        }
    }
}