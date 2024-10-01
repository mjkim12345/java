package fc.java.fc.java.model2;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY=5;
    private Object[] elements;
    private int size =0;
    public ObjectArray() {
        this(5);  // this() : 생성자안에서 다른 생성자를 호출할 때 사용
    }
    public ObjectArray(int capacity) {
        elements=new Object[capacity]; // 원하는 크기의 배열을 생성한다.
    }
    public void add(Object element) {
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
    public Object get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("index의 범위가 초과됨");
        }
        return elements[index];
    }
}
