fun main(args: Array<String>) {


    var list1 = ListNode(1)
    var list2 = ListNode(3)
    var list3 = ListNode(5)
    var list4 = ListNode(7)
    list1.next = list2
    list2.next = list3
    list3.next = list4

    var list5 = ListNode(2)
    var list6 = ListNode(4)
    var list7 = ListNode(6)
    var list8 = ListNode(8)
    list5.next = list6
    list6.next = list7
    list7.next = list8

    mergeTwoLists(list1, list5)
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(lOne: ListNode?, lTwo: ListNode?): ListNode? {

    var l1 = lOne
    var l2 = lTwo

    var fackHead: ListNode = ListNode(0)
    var l3 = fackHead

    while (l1 != null && l2 != null) {
        if (l1.value <= l2.value) {
            l3.next = l1
            l1 = l1.next
        } else {
            l3.next = l2
            l2 = l2.next
        }
        l3 = l3.next!!
    }
    if (l2 == null) l3.next = l1;
    else l3.next = l2;

    return fackHead.next
}