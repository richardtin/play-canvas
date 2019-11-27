package io.richardtin.playcanvas

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        canvas.drawCircle(100f, 100f, 50f, Paint())

        val textPaint = Paint().apply {
            isAntiAlias = true
            textSize = 32f
            color = Color.RED
            style = Paint.Style.STROKE
        }
        canvas.drawText("canvas text", 20f, 180f, textPaint)

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageBitmap(bitmap)
    }
}
