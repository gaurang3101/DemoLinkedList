package definition;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {

    @Override
    public void add(E item) {

    }

    @Override
    public E remove(E item) {
        return null;
    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }

    //create the Node class
    private static class Node<E> {
        private E data;
        private Node<E> next;


    }
}
