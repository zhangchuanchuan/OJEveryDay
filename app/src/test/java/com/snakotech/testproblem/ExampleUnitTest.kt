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

    @Test
    fun testPabc() {
        val solution = com.snakotech.testproblem._12._1206.Solution()
        System.out.println(solution.Permutation("aabc"))
    }

    @Test
    fun testArray() {
        val solution = com.snakotech.testproblem._12._1207.Solution()
        System.out.println(solution.MoreThanHalfNum_Solution(intArrayOf(1,2,3,2,2,2,5,4,2)))
        System.out.println(solution.MoreThanHalfNum_Solution(intArrayOf(1,2,3,2,4,2,5,2,3)))
        System.out.println(solution.MoreThanHalfNum_Solution(intArrayOf(2,2,2,2,2,1,3,4,5)))
        System.out.println(solution.MoreThanHalfNum_Solution(intArrayOf(1,2,3)))
    }

    @Test
    fun test1208() {
        val solution = com.snakotech.testproblem._12._1208.Solution()
        System.out.println(solution.GetLeastNumbers_Solution(intArrayOf(4,5,1,6,2,7,3,8), 4))
    }

    @Test
    fun test1210() {
        val solution = com.snakotech.testproblem._12._1210.Solution()
        System.out.println(solution.FindGreatestSumOfSubArray(intArrayOf(6,-3,-2,7,-15,1,2,2)))
        System.out.println(solution.FindGreatestSumOfSubArray(intArrayOf(-2,-8,-1,-5,-9)))
    }

    @Test
    fun test1211() {
        val solution = com.snakotech.testproblem._12._1211.Solution()
        System.out.println(solution.NumberOf1Between1AndN_Solution(13))
        System.out.println(solution.NumberOf1Between1AndN_Solution(25))
    }
}
