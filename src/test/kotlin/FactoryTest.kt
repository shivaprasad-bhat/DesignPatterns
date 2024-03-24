import factory.CurrencyFactory
import factory.Greece
import factory.USA
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FactoryTest {

    @Test
    fun `greek currency test`() {
        val greekCurrency = CurrencyFactory.currencyForCountry(Greece("greece")).code
        assertEquals(greekCurrency, "EUR")
    }

    @Test
    fun `USA currency test`() {
        val usaCurrency = CurrencyFactory.currencyForCountry(USA("america")).code
        assertEquals(usaCurrency, "USD")
    }
}