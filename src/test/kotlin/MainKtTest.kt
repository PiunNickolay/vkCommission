import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commission() {
        val cardType:String = "Visa"
        val previousTransfersThisMonth = 0
        val transferAmount = 100_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(750, result)
    }
}