package easy

fun duplicateZeros(arr: IntArray): Unit {

    var zeroes: Int = 0
    for (index in arr) {
        if (index == 0) zeroes++
    }
    var header: Int = arr.size - 1
    var tail: Int = arr.size + zeroes - 1

    while (header != tail) {
        if (arr[header] == 0)
            insert(arr, header, tail--)
        insert(arr, header--, tail--)
    }
}

fun insert(arr: IntArray, header: Int, tail: Int): Unit {
    if (tail < arr.size)
        arr[tail] = arr[header]
}

fun main() {
    val arr = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0)
    duplicateZeros(arr)
    for (element in arr.indices)
        println(arr[element])
}