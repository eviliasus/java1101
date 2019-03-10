package com.mamonow.java1101.implementationLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyImplList<E extends Boom> implements List<E> {

    private Boom<E> previous;
    private Boom<E> next;
    private int size = 0;
    private Boom<E> first;
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
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
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
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
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
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean addM(E e) {
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
    private E getM(int index) {
        this.index = index;
        E element;
        if (index >= 0 && index < size()) {
            element = getByIndex(index).getT();
        } else throw new IndexOutOfBoundsException();
        return element;
    }
    private boolean containsM(Object o) {
        this.o = o;
        for (int i = 0; i < size(); i++) {
            if (get(i).equals(o)) return true;
        }
        return false;
    }
    private boolean removeM(Object o) {
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


}