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
        test.push(4)
        test.push(8)
        System.out.print(test.min())
        test.pop()
        System.out.print(test.min())
        System.out.println("")
        val test1 = com.snakotech.testproblem._11._1129.Solution1()
        test1.push(4)
        test1.push(8)
        System.out.print(test1.min())
        test1.pop()
        System.out.print(test1.min())

    }

    @Test
    fun testOrderPop() {
        val orderPop = com.snakotech.testproblem._11._1130.Solution()
        System.out.println(orderPop.IsPopOrder(intArrayOf(1,2,3,4,5), intArrayOf(4,3,5,1,2)))
    }

    @Test
    fun testPrintFromTopToBottom() {
        val solution = com.snakotech.testproblem._12._1201.Solution()
        val root = solution.TreeNode(2)
        root.left = solution.TreeNode(3)
        root.right = solution.TreeNode(5)
        System.out.print(solution.PrintFromTopToBottom(root))

    }

    @Test
    fun testCheckIsSearch() {
        val solution = com.snakotech.testproblem._12._1202.Solution()
        System.out.print(solution.VerifySquenceOfBST(intArrayOf(4,8,6,12,16,14,10)))
        System.out.print(solution.VerifySquenceOfBST(intArrayOf(1,2,3,4,5)))
    }

    @Test
    fun testMultiLinked() {
        val solution = com.snakotech.testproblem._12._1204.Solution()
        val pHead = solution.RandomListNode(1)
        pHead.next = solution.RandomListNode(2)
        var node = pHead.next
        node.next = solution.RandomListNode(3)
        node = node.next
        node.next = solution.RandomListNode(3)
        node = node.next
        node.next = solution.RandomListNode(4)
        node = node.next
        node.next = solution.RandomListNode(5)
        solution.Clone(pHead)
    }

}
