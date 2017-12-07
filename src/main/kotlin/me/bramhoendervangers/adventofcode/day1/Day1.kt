package me.bramhoendervangers.adventofcode.day1

import me.bramhoendervangers.adventofcode.util.asCyclingSequence

object Day1 {
    private fun sum(digits: Collection<Int>): Int {
        return digits.asCyclingSequence()
                .drop(1)
                .zip(digits.asSequence())
                .filter { it.first == it.second }
                .sumBy { it.first }
    }

    fun solve(string: String): Int = sum(string.map { it.toString().toInt() })
}