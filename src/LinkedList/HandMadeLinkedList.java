package LinkedList;

import java.util.NoSuchElementException;

public class HandMadeLinkedList <T>{
    /**
     * Указатель на первый элемент списка. Он же first
     */
    private Node<T> head;

    /**
     * Указатель на последний элемент списка. Он же last
     */
    private Node<T> tail;

    private int size = 0;

    public void addFirst(T element){
        final Node<T> oldHead = head;
        final Node<T> newNode = new Node<>(null, element, oldHead);
        head = newNode;
        if (oldHead == null){
            tail = newNode;
        } else {
            oldHead.prev = newNode;
        }
        size++;
    }

    public T getFirst(){
        final Node<T> curHead = head;
        if (curHead == null){
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public void addLast(T element){
         final Node<T> oldTail = tail;
         final Node<T> newNode = new Node<>(tail, element, null);
         tail = newNode;
         if (oldTail == null){
             head = newNode;
         } else {
             oldTail.next = newNode;
         }
         size++;
    }

    public T getLast(){
        final Node<T> curTail = tail;
        if (curTail == null){
            throw new NoSuchElementException();
        }
        return tail.data;
    }

    public int size(){
        return this.size;
    }
}
