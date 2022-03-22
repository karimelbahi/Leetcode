package easy

fun main(args: Array<String>) {
    var lst = intArrayOf(3, 3, 2, 5, 9)
    twoSum(lst, 11)
}

fun twoSum(nums: IntArray, target: Int): IntArray {

    var numMap: MutableMap<Int, Int> = HashMap()

    for (indexOne in nums.withIndex()) {
        var complement = target - indexOne.value
        if (numMap.containsKey(complement)) {
            return intArrayOf(numMap[complement]!!, indexOne.index)
        }
        numMap[nums[indexOne.index]] = indexOne.index
    }
    return intArrayOf(0)
}