package com.company

import processing.core.PApplet
import processing.core.PConstants

object Sketch : PApplet(){
    init {
        this.runSketch()
    }

    val sketchWidth: Float
        get() = width.toFloat()
    val sketchHeight: Float
        get() = height.toFloat()

    override fun settings() {
        super.settings()
        size(400, 400)
    }

    override fun setup() {
        background(0)
        rectMode(PConstants.CENTER)
    }

    override fun draw() {
        circle(sketchWidth/2, sketchHeight/2, sketchWidth*0.8f)
    }

}

fun main() {
    Sketch
}