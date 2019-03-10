package com.mamonow.java1101.implementationLinkedList;

class Boom<T> {

    private Boom next;
    private Boom previous;
    private T t;

    public Boom() {
        this.next = null;
        this.previous = null;
    }

    public Boom(Boom previous) {
        this.next = null;
        this.previous = previous;
    }

    public Boom getNext() {
        return next;
    }

    public void setNext(Boom next) {
        this.next = next;
    }

    public Boom getPrevious() {
        return previous;
    }

    public void setPrevious(Boom previous) {
        this.previous = previous;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    private int size = 0;

    private int size() {
        return this.size;
    }

    private boolean isEmpty() {
        return size() == 0;
    }


}