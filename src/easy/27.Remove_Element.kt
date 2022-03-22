package easy

fun main(args: Array<String>) {
    println(removeElement(intArrayOf(3, 2, 2, 3), 3))
    println(removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
}

fun removeElement(nums: IntArray, num: Int): Int {

    var pointer = 0
    for (index in nums.indices) {
        nums[index - pointer] = nums[index]
        if (nums[index] == num) {
            pointer++
        }
    }
    return nums.size - pointer

}