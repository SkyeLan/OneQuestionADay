package Naive;

public class _0466_CountLinkedListNodes {
    int val;
    _0466_CountLinkedListNodes next;

    _0466_CountLinkedListNodes(int x) {
        val = x;
        next = null;
    }

    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public static int countNodes(_0466_CountLinkedListNodes head) {
        if (head == null)
            return 0;
        int num = 1;
        while (head.next != null) {
            num++;
            head = head.next;
        }
        return num;
    }

    public static void main(String[] args) {
        _0466_CountLinkedListNodes first = new _0466_CountLinkedListNodes(1);
        _0466_CountLinkedListNodes second = new _0466_CountLinkedListNodes(2);
        _0466_CountLinkedListNodes third = new _0466_CountLinkedListNodes(3);
        first.next = second;
        second.next = third;
        int num = countNodes(first);
        System.out.println(num);
    }
}
