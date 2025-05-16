package codegym.collections.list;

public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T data) {
        Node<T> newNode = new Node<>();

        newNode.data = data;

        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }

        tail = newNode;
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new BadIndexForListException("El índice " + index + " está fuera del tamaño de la lista");
        }
        int currentIndex = 0;
        Node<T> currentNode = head;

        while (currentIndex < index) {
            currentIndex++;
            currentNode = currentNode.next;
        }
        if (currentNode.prev == null) {
            head = currentNode.next;
        } else {
            currentNode.prev.next = currentNode.next;
        }
        if (currentNode.next == null) {
            tail = currentNode.prev;
        } else {
            currentNode.next.prev = currentNode.prev;
        }
        size--;

        return currentNode.data;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new BadIndexForListException("El índice " + index + " está fuera del tamaño de la lista");
        }

        int currentIndex = 0;
        Node<T> currentNode = head;

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        return currentNode != null ? currentNode.data : null;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            throw new BadIndexForListException("El índice " + index + " está fuera del tamaño de la lista");
        }

        int currentIndex = 0;
        Node<T> currentNode = head;

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode != null) {
            currentNode.data = data;
        }

    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    static private class Node<G> {
        Node<G> prev;
        G data;
        Node<G> next;
    }

    private class LinkedListIterator implements Iterator<T> {

        Node<T> currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            T data = currentNode.data;

            currentNode = currentNode.next;

            return data;
        }
    }


}
