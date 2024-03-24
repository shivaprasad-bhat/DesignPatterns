import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

// Dummy test class
class CalculatorTest {
    @Test
    fun `test sum function`() {
        val calc = Calculator()
        Assertions.assertEquals(calc.sum(3, 2), 5)
    }

}