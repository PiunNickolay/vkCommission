import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionMastercard() {
        val cardType:String = "Mastercard"
        val previousTransfersThisMonth = 0
        val transferAmount = 180_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(null, result)
    }
    @Test
    fun commissionMastercardMonthLimit() {
        val cardType:String = "Mastercard"
        val previousTransfersThisMonth = 430_000
        val transferAmount = 180_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(null, result)
    }
    @Test
    fun commissionMastercardSecond() {
        val cardType:String = "Mastercard"
        val previousTransfersThisMonth = 0
        val transferAmount = 50_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(0, result)
    }
    @Test
    fun commissionMastercardThird() {
        val cardType:String = "Mastercard"
        val previousTransfersThisMonth = 0
        val transferAmount = 100_000

        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(620, result)
    }
    @Test
    fun commissionVisa() {
        val cardType:String = "Visa"
        val previousTransfersThisMonth = 0
        val transferAmount = 180_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(0, result)
    }
    @Test
    fun commissionVisaMonthLimit() {
        val cardType:String = "Visa"
        val previousTransfersThisMonth = 430_000
        val transferAmount = 180_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(0, result)
    }
    @Test
    fun commissionVisaSecond() {
        val cardType:String = "Visa"
        val previousTransfersThisMonth = 0
        val transferAmount = 3500
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(35, result)
    }
    @Test
    fun commissionVisaThird() {
        val cardType:String = "Visa"
        val previousTransfersThisMonth = 0
        val transferAmount = 100_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(750, result)
    }
    @Test
    fun commissionVKPay() {
        val cardType:String = "VKPay"
        val previousTransfersThisMonth = 0
        val transferAmount = 18_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(null, result)
    }
    fun commissionVKPayMonthLimit() {
        val cardType:String = "VKPay"
        val previousTransfersThisMonth = 33_000
        val transferAmount = 18_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(null, result)
    }
    fun commissionVKPaySecond() {
        val cardType:String = "VKPay"
        val previousTransfersThisMonth = 0
        val transferAmount = 10_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(0, result)
    }



}