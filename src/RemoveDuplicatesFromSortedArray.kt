fun main(args: Array<String>) {

    println(removeDuplicates(intArrayOf(1,1,2)))
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))

}

fun removeDuplicates(nums: IntArray): Int {
    var prePointer=0
    for (pointer in nums.indices){
        if (nums[pointer]!= nums[prePointer])
            nums[++prePointer]=nums[pointer]

    }
    return ++prePointer
}