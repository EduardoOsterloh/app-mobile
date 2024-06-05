package com.example.app

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircularProgressView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var progress: Float = 0f
    private val maxProgress: Float = 100f
    private val paint = Paint().apply {
        isAntiAlias = true
        strokeWidth = 20f
        style = Paint.Style.STROKE
        color = Color.GREEN
    }
    private val backgroundPaint = Paint().apply {
        isAntiAlias = true
        strokeWidth = 20f
        style = Paint.Style.STROKE
        color = Color.GRAY
    }
    private val textPaint = Paint().apply {
        isAntiAlias = true
        textSize = 60f
        color = Color.BLACK
        textAlign = Paint.Align.CENTER
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val width = width
        val height = height
        val radius = (Math.min(width, height) / 2f) - 40

        val centerX = width / 2f
        val centerY = height / 2f

        // Draw background circle
        canvas.drawCircle(centerX, centerY, radius, backgroundPaint)

        // Draw progress arc
        val sweepAngle = (progress / maxProgress) * 360
        canvas.drawArc(
            centerX - radius,
            centerY - radius,
            centerX + radius,
            centerY + radius,
            -90f,
            sweepAngle,
            false,
            paint
        )

        // Draw progress text
        canvas.drawText(
            "${progress.toInt()}%",
            centerX,
            centerY + (textPaint.textSize / 4),
            textPaint
        )
    }

    fun setProgress(progress: Float) {
        this.progress = progress
        invalidate() // Redraw the view
    }}