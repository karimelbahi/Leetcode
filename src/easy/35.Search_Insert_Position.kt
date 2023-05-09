package easy

fun main() {
    println(searchInsert(intArrayOf(1,3,5,6),5))
    println(searchInsert(intArrayOf(1,3,5,6),2))
    println(searchInsert(intArrayOf(1,3,5,6),7))

    println(searchInsertBinarySearch(intArrayOf(1,3,5,6),5))
    println(searchInsertBinarySearch(intArrayOf(1,3,5,6),2))
    println(searchInsertBinarySearch(intArrayOf(1,3,5,6),7))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    for ((index, value) in nums.withIndex()) {
       if (value == target || value > target)
           return index
    }
    return nums.size
}

fun searchInsertBinarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2
        if (nums[mid] == target) {
            return mid
        } else if (nums[mid] > target) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    return left
}