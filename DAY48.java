import java.util.Optional;

class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private static class Node {

        private int val;
        private Node next;
        private Node prev;

        private Node(int val) {
            this.val = val;
        }

        static Node valueOf(int val) {
            return new Node(val);
        }
    }


    public int get(int index) {

        Optional<Node> node = getNodeByIdx(index);

        return node.map(n -> n.val).orElse(-1);
    }

    public void addAtHead(int val) {

        var newNode = Node.valueOf(val);
        size++;

        if (head == null) {

            head = newNode;
            tail = newNode;

        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }
    }

    public void addAtTail(int val) {

        var newNode = Node.valueOf(val);
        size++;

        if (tail == null) {

            head = newNode;
            tail = newNode;

        } else {

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) return;

        if (index == 0) {

            addAtHead(val);

        } else if (index == size) {

            addAtTail(val);

        } else {

            getNodeByIdx(index - 1).ifPresent(current -> {

                var newNode = Node.valueOf(val);
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
                size++;
            });
        }
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) return;

        size--;
        if (size == 0) {

            head = tail = null;

        } else if (index == 0) {

            head = head.next;

        } else if (index == size) {

            getNodeByIdx(index - 1).ifPresent(newTail -> {

                tail = newTail;
                tail.next = null;

            });
            
        } else {
            
            getNodeByIdx(index).ifPresent(nodeToDel -> {

                nodeToDel.prev.next = nodeToDel.next;
                nodeToDel.next.prev = nodeToDel.prev;
                
            });
        }
    }


    private Optional<Node> getNodeByIdx(int idx) {
        
        if (size <= idx) return Optional.empty();

        Node current = head;
        while (current.next != null && idx-- > 0) {
            current = current.next;
        }

        return Optional.of(current);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
