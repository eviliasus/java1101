package com.mamonow.java1101.implementationLinkedList;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class MyImplList<E extends Boom> implements List<E> {

    private Boom<E> previous;
    private Boom<E> next;
    private int size = 0;
    private Boom<E> first;
    private Boom<E> last;
    private int index;
    private Object o;
    private E e;

    public MyImplList() {
        this.previous = new Boom<E>();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {
    }
    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }
    @Override
    public E remove(int index) {
        return null;
    }

    public boolean add(E e) {
        this.e = e;
        Boom<E> boom = new Boom<E>(e);
        if(first == null){
            first = boom;
        }else{
            previous = first;
        }
        if(size() == 1){
            first.setNext(boom);
        }
        size++;

        return true;
    }
    private Boom<E> getByIndex(int index) {
        Boom<E> boom = null;
        if (!isEmpty() && (index >= 0 && index < size)) {
            boom = first;
            for(int i=1; i<=index; i++){
                boom = boom.getNext();
            }
        }
        return boom;
    }
    private E get(int index) {
        this.index = index;
        E element;
        if (index >= 0 && index < size()) {
            element = getByIndex(index).getT();
        } else throw new IndexOutOfBoundsException();
        return element;
    }
    private boolean contains(Object o) {
        this.o = o;
        for (int i = 0; i < size(); i++) {
            if (get(i).equals(o)) return true;
        }
        return false;
    }
    private boolean remove(Object o) {
        this.o = o;
        Boom<E> node = first;
        for(int i=0; i<size(); i++){
            if(node.equals(o)){
                node.getPrevious().setNext(node.getNext());
                return true;
            }
        }
        return false;
    }
    private void clear() {
        first = null;
        last = null;
        size = 0;
    }
}
