public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getDecimalValue(ListNode head) {
        int sum = 0;

        while (head != null) {
            sum *= 2;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        ListNode solution = new ListNode();
        ListNode head1 = new ListNode(1, new ListNode(0, new ListNode(1)));
        int result1 = solution.getDecimalValue(head1);
        System.out.println("Binary [1, 0, 1] = " + result1);

        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        int result2 = solution.getDecimalValue(head2);
        System.out.println("Binary [1, 1, 1, 1] = " + result2);
        
        ListNode head3 = new ListNode(0);
        int result3 = solution.getDecimalValue(head3);
        System.out.println("Binary [0] = " + result3);
    }
}