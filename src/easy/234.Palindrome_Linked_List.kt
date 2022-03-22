package easy

//Definition for singly-linked list.
class MyListNode(var `val`: Int) {
    var next: MyListNode? = null
}

fun isPalindrome(head: MyListNode?): Boolean {
    var list = head
    val listString = StringBuilder()
    while (list != null) {
        listString.append(list.`val`)
        list = list.next
    }
    return listString.toString() == listString.reverse().toString()
}

fun main() {

    var node1 = MyListNode(1)
    var node2 = MyListNode(2)
    var node3 = MyListNode(2)
    var node4 = MyListNode(1)
    node1.next=node2
    node2.next=node3
    node3.next=node4
    println(isPalindrome(node1))
}
