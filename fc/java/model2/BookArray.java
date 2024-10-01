package fc.java.fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY=5;
    private Book[] elements;
    private int size =0;
    public BookArray() {
        elements=new Book[DEFAULT_CAPACITY];
    }
    public void add(Book element) {
        if(size==elements.length){
            ensureCapacity();
        }
        elements[size++]=element;
    }

    public void ensureCapacity() {
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements,newCapacity);
    }
    public int size(){
        return size;
    }
    public Book get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("index의 범위가 초과됨");
        }
        return elements[index];
    }
}
