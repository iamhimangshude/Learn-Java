package LeetCode;

public class Problem2 {
    static void main() {
        ListNode head = new ListNode(9);
        ListNode one = new ListNode(9);
        ListNode two = new ListNode(9);
        ListNode three = new ListNode(9);
        ListNode four = new ListNode(9);
        ListNode five = new ListNode(9);
        ListNode six = new ListNode(9);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        ListNode head1 = new ListNode(9);
        ListNode one1 = new ListNode(9);
        ListNode two1 = new ListNode(9);
        ListNode three1 = new ListNode(9);

        head1.next = one1;
        one1.next = two1;
        two1.next = three1;

        ListNode temp = head;
        ListNode temp1 = head1;

        System.out.print("l1: ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }


        System.out.println();
        System.out.print("l2: ");
        while (temp1 != null) {
            System.out.print(temp1.val + " ");
            temp1 = temp1.next;
        }
        System.out.println();

        var result = addTwoNumbers(head, head1);
        System.out.println("result: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode resultHead = new ListNode();
        ListNode result = resultHead;

        while (l1 != null || l2 != null || carry != 0) {
            var value1 = l1 != null ? l1.val : 0;
            var value2 = l2 != null ? l2.val : 0;
            int sum = value1 + value2 + carry;

            result.next = new ListNode(sum % 10);
            carry = sum / 10;


            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            result = result.next;
        }

        return resultHead.next;
    }
}
