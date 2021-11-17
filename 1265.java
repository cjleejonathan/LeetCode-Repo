/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

/**
 *Recursive
 */
class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        if (head.getNext() != null)
            printLinkedListInReverse(head.getNext());
        head.printValue();
        
    }
    
}

/**
 *Iterative
 */
class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.getNext();
        }
        
        while (!stack.isEmpty()) {
            stack.pop().printValue();
        }
        
    }
    
}
