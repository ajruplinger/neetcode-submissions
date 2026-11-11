class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        ListNode current = head.next;
        int i = 0;
        while (current != null) {
            if ( i == index) return current.value;
            i++;
            current = current.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
        if (node.next == null) tail = node;
    }

    public void insertTail(int val) {
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
    }

    public boolean remove(int index) {
        ListNode previous = head;
        for (int i = 0; i < index && previous != null; i++) {
            previous = previous.next;
        }

        if (previous == null || previous.next == null) {
            return false;
        }
        if (previous.next == tail) {
            tail = previous;
        }
        previous.next = previous.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        ListNode current = head.next;
        while (current != null) {
            result.add(current.value);
            current = current.next;
        }
        return result;
    }
}
