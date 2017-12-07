package me.bramhoendervangers.adventofcode.day1

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals

object Day1Spec : Spek({
    given("the day 1 puzzle") {
        on("solving 1122") {
            val result = Day1.solve("1122")
            it("should produce the sum of 3 (1 + 2)") {
                assertEquals(3, result)
            }
        }

        on("solving 1111 where each digit matches the next") {
            val result = Day1.solve("1111")
            it("should produce the sum of 4") {
                assertEquals(4, result)
            }
        }

        on("solving 1234 where no digit matches the next") {
            val result = Day1.solve("1234")
            it("should produce the sum of 0") {
                assertEquals(0, result)
            }
        }

        on("solving 91212129 where the last digit matches the first") {
            val result = Day1.solve("91212129")
            it("should produce the sum of 9") {
                assertEquals(9, result)
            }
        }
    }
})
