# OJEveryDay
每天一道OJ题（almost）

###11月
####1108 求最大窗口数组：
给定要给数组和一个窗口的大小，从左滑倒最右边，求这个窗口每次滑动中最大的值的数组。要求时间复杂度O(n)

####1110 杨氏矩阵求目标是否存在
问题：已知一个2维矩阵，其中的元素每一行从左至右依次增加，每一列从上到下依次增加。
即对于矩阵Table有Table[i][j] ≤Table[i][j + 1], Table[i][j] ≤ Table[i + 1][j]，
我们也称这样的矩阵为杨氏矩阵。给出判定某个数是否存在该矩阵中的高效算法。

####1113
问题：将一个字符串中的空格替换成%20，例如We Are Happy替换成We%20Are%20Happy

####1114
问题：输入一个链表，从尾到头打印链表的每个节点的值

####1115
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果
中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
则重建二叉树并返回。

####1116
用两个栈实现队列的pop和push。

####1117
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的
一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为
1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

####1118
输入一个链表，从尾到头打印链表每个节点的值。

####1119
斐波那契数列

####1120
矩形覆盖:我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

####1121
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

####1122
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

####1123
输入一个链表，输出该链表中倒数第k个结点。

####1124
 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 
####1125
 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 
 ####1126
 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 
 ####1127
二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
    	
####1128
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵：
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
则依次打印出数字
1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

####1129
定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。

####1130
输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
（注意：这两个序列的长度是相等的）

####1201
从上往下打印出二叉树的每个节点，同层节点从左至右打印。

####1202
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

####1203
输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。