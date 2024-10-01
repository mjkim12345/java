package fc.java.fc.java.model2;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY=5;
    private int[] elements;
    private int size =0;
    public IntArray() {
        elements=new int[DEFAULT_CAPACITY];
    }
    public void add(int element) {
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
    public int get(int element){
        if(element>=size || element<0){
            throw new IndexOutOfBoundsException("범위 초과");
        }
        return elements[element];
    }
}
