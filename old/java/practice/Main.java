public class Main {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Helper Linked List class for operations
    static class LinkedList {
        ListNode head;

        // Insert a new node at the end
        public void insert(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                return;
            }
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Display the linked list
        public void display() {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Return head node
        public ListNode getHead() {
            return head;
        }
    }

    // Your original Solution class (unchanged logic)
    static class Solution {
        public boolean isPalindrome(ListNode head) {
            int size = 0;
            ListNode temp = head;
            ListNode rightHead;

            // FINDING SIZE
            while (temp != null) {
                size++;
                temp = temp.next;
            }

            // FINDING THE NODE BEFORE MID
            temp = head;
            int mid = size / 2;
            for (int i = 0; i < mid - 1; i++) {
                temp = temp.next;
            }

            // BREAKING THE NODE FROM THE MID ACC TO EVEN-ODD
            if (size % 2 == 0) {
                rightHead = temp.next;
                temp.next = null;
            } else {
                rightHead = temp.next.next;
                temp.next = null;
            }

            // REVERSE THE RIGHT PART OF THE NODE
            rightHead = reverse(rightHead);

            // CHECKING IF PALINDROME OR NOT
            while (head != null) {
                if (head.val != rightHead.val) {
                    return false;
                }
                rightHead = rightHead.next;
                head = head.next;
            }
            return true;
        }
        public ListNode oddEvenList(ListNode head) {
            if(head == null || head.next == null){
                return null ;
            }
            ListNode odd = head ;
            ListNode even = head.next ;
            ListNode second = head.next ;
            while(even != null && even.next != null){
                    odd.next = even.next ;
                    odd = odd.next ;
                    even.next = odd.next ;
                    even = even.next ;
            }
            odd.next = second ;
            return head ;
        }

        public static ListNode reverse(ListNode head) {
            ListNode node = null;
            while (head != null) {
                ListNode temp = head.next;
                head.next = node;
                node = head;
                head = temp;
            }
            return node;
        }
    }

    // Main method for debugging
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the linked list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original Linked List:");
        list.display();

        // Check if it's a palindrome
        Solution solution = new Solution();
        solution.oddEvenList(list.head) ;
        list.display();



    }
}
