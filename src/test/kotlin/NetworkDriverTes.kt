import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import singleton.NetworkDriver
import kotlin.test.assertEquals
import kotlin.test.assertIs

class NetworkDriverTes {

    @Test
    fun `test NetworkDriver Class`() {
        println("Start")
        val driver1 = NetworkDriver.log()
        val driver2 = NetworkDriver.log()

        Assertions.assertSame(driver1, driver2)
    }

}