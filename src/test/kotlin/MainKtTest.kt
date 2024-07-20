import org.junit.Test

import org.junit.Assert.*

class MainKtTest {
    @Test
    fun commissionMaestroWithLimit() {
        val cardType:String = "Maestro"
        val previousTransfersThisMonth = 150_000
        val transferAmount = 74_999
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(469, result)
    }
    @Test
    fun commissionMaestroNoLimit() {
        val cardType:String = "Maestro"
        val previousTransfersThisMonth = 0
        val transferAmount = 74_999
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(0, result)
    }
    @Test
    fun commissionMaestroNoLimit2() {
        val cardType:String = "Maestro"
        val previousTransfersThisMonth = 199
        val transferAmount = 1
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(20, result)
    }
    @Test
    fun commissionMaestroDailyLimitExceeded() {
        val cardType:String = "Maestro"
        val previousTransfersThisMonth = 0
        val transferAmount = 150_001
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(null, result)
    }
    @Test
    fun commissionMaestroMonthlyLimitExceeded() {
        val cardType:String = "Maestro"
        val previousTransfersThisMonth = 600_001
        val transferAmount = 0
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(null, result)
    }
    @Test
    fun commissionMastercardWithLimit() {
        val cardType:String = "Mastercard"
        val previousTransfersThisMonth = 150_000
        val transferAmount = 74_999
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(469, result)
    }
    @Test
    fun commissionMastercardNoLimit() {
        val cardType:String = "Mastercard"
        val previousTransfersThisMonth = 0
        val transferAmount = 74_999
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(0, result)
    }
    @Test
    fun commissionMastercardNoLimit2() {
        val cardType:String = "Mastercard"
        val previousTransfersThisMonth = 199
        val transferAmount = 1
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(20, result)
    }
    @Test
    fun commissionMastercardDailyLimitExceeded() {
        val cardType:String = "Mastercard"
        val previousTransfersThisMonth = 0
        val transferAmount = 150_001
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(null, result)
    }
    @Test
    fun commissionMastercardMonthlyLimitExceeded() {
        val cardType:String = "Mastercard"
        val previousTransfersThisMonth = 600_001
        val transferAmount = 0
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)

        assertEquals(null, result)
    }
    @Test
    fun commissionMir(){
        val cardType:String = "Мир"
        val previousTransfersThisMonth = 0
        val transferAmount = 100_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(750,result)
    }
    @Test
    fun commissionMirMin(){
        val cardType:String = "Мир"
        val previousTransfersThisMonth = 0
        val transferAmount = 100
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(35,result)
    }
    @Test
    fun testMirDailyLimitExceeded(){
        val cardType:String = "Мир"
        val previousTransfersThisMonth = 0
        val transferAmount = 150_001
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(0,result)
    }
    @Test
    fun testMirMonthlyLimitExceeded(){
        val cardType:String = "Мир"
        val previousTransfersThisMonth = 600_001
        val transferAmount = 0
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(0,result)
    }
    @Test
    fun commissionVisa(){
        val cardType:String = "Visa"
        val previousTransfersThisMonth = 0
        val transferAmount = 100_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(750,result)
    }
    @Test
    fun commissionVisaMin(){
        val cardType:String = "Visa"
        val previousTransfersThisMonth = 0
        val transferAmount = 100
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(35,result)
    }
    @Test
    fun testVisaDailyLimitExceeded(){
        val cardType:String = "Visa"
        val previousTransfersThisMonth = 0
        val transferAmount = 150_001
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(0,result)
    }
    @Test
    fun testVisaMonthlyLimitExceeded(){
        val cardType:String = "Visa"
        val previousTransfersThisMonth = 600_001
        val transferAmount = 0
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(0,result)
    }
    @Test
    fun testVKPayNoCommission(){
        val cardType:String = "VKPay"
        val previousTransfersThisMonth = 0
        val transferAmount = 10_000
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(0,result)
    }
    @Test
    fun testVKPayDailyLimit(){
        val cardType:String = "VKPay"
        val previousTransfersThisMonth = 0
        val transferAmount = 15_001
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(null,result)
    }
    @Test
    fun testVKPayMonthlyLimit(){
        val cardType:String = "VKPay"
        val previousTransfersThisMonth = 40_001
        val transferAmount = 0
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(null,result)
    }
    @Test
    fun testNone(){
        val cardType = "Tinkoff"
        val previousTransfersThisMonth = 0
        val transferAmount = 0
        val sumOfTransfers = transferAmount+previousTransfersThisMonth

        val result = commission(cardType, previousTransfersThisMonth, transferAmount, sumOfTransfers)
        assertEquals(0,result)
    }
}