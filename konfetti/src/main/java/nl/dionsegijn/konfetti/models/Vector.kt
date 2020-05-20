package nl.dionsegijn.konfetti.models

import kotlin.math.PI
import kotlin.math.atan
import kotlin.math.sqrt

/**
 * Created by dionsegijn on 3/25/17.
 */
data class Vector(var x: Float = 0f, var y: Float = 0f) {
    fun add(v: Vector) {
        x += v.x
        y += v.y
    }

    fun mult(n: Float) {
        x *= n
        y *= n
    }

    fun div(n: Float) {
        x /= n
        y /= n
    }

    fun angle(v: Vector): Float {
        val h = sqrt((x - v.x)*(x - v.x) + (y - v.y)*(y - v.y))
        val o = x - v.x
        val a = y - v.y

        return atan(a/o) * 180 / PI.toFloat()
    }
}
