package com.snakotech.testproblem

import com.snakotech.testproblem._11.*
import com.snakotech.testproblem._11._1121.Solution
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testWindowArray() {
        _1108.mainTest();
    }

    @Test
    fun testSearch2Array() {
        _1110.testMain();
    }

    @Test
    fun testReplaceBlack() {
        _1113.testMain();
    }

    @Test
    fun testLinkChainRevertPrint() {
        _1114.testMain();
    }

    @Test
    fun testContractTree() {
        _1115.testMain();
    }
    @Test
    fun testGetCountOf1() {
        val c = Solution()
        Integer.MIN_VALUE
        System.out.println(c.NumberOf1(-12))
        System.out.println(c.NumberOf1_1(-12))
        System.out.println(c.NumberOf1(128))
        System.out.println(c.NumberOf1_1(128))
        System.out.println(c.NumberOf1(-2147483648))
        System.out.println(c.NumberOf1_1(-2147483648))
        System.out.println(c.NumberOf1(-1))
        System.out.println(c.NumberOf1_1(-1))
    }

    @Test
    fun testStack() {
        val test = com.snakotech.testproblem._11._1129.Solution()
        test.push(3)
        System.out.print(test.min())
        test.push(4)
        System.out.print(test.min())
        test.push(2)
        System.out.print(test.min())
        test.push(3)
        System.out.print(test.min())
        test.pop()
        System.out.print(test.min())
        test.pop()
        System.out.print(test.min())
        test.pop()
        System.out.print(test.min())
        test.push(0)
        System.out.print(test.min())
    }

    @Test
    fun testOrderPop() {
        val orderPop = com.snakotech.testproblem._11._1130.Solution()
        System.out.println(orderPop.IsPopOrder(intArrayOf(1,2,3,4,5), intArrayOf(3,5,4,2,1)))
    }

}
