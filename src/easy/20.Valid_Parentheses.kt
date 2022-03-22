package easy

import java.util.*

fun main(args: Array<String>) {
   println(isValid("()"))
   println(isValid("()[]{}"))
   println(isValid("(]"))
   println(isValid("([)]"))
   println(isValid("{[]}"))

}

fun isValid(s: String): Boolean {
    if ((s.length <= 1)) return false
    var stack: Stack<Char> = Stack()
    for (i in s.withIndex()) {
        when (i.value) {
            '(' -> {
                stack.push(')')
            }
            '{' -> {
                stack.push('}')
            }
            '[' -> {
                stack.push(']')
            }
            ')', ']', '}' -> {
                if (stack.isEmpty() || stack.pop() != i.value) return false
            }
        }
    }
    return stack.isEmpty()
}