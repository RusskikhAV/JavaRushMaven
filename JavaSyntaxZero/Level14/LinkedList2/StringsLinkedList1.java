package JavaSyntaxZero.Level14.LinkedList2;

public class StringsLinkedList1 {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        if (index >= 0) {
            Node currentElement = first.next;

            for (int i = 0; i < index; i++) {
                if (currentElement == null)
                    break;
                else currentElement = currentElement.next;
            }

            if (currentElement == null)
                return null;
            else return currentElement.value;
        }

        return null;
    }


    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
