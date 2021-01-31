package C5_ArrayList;

import java.util.Arrays;

public class MyIntArrayList {

    private int[] elements;
    private int size;

    public MyIntArrayList() {
        this.size = 0;
        this.elements = new int[10];
    }

    public MyIntArrayList(int initialCapacity) {
        this.elements = new int[initialCapacity];
    }

    public MyIntArrayList(MyIntArrayList collection) { // Nu este corect, parametrul trebuie sa fie MyIntArrayList
        this.elements = collection.elements;
    }

    public void checkIndex(int index) {
        if (index < 0 || index > this.elements.length) {
            throw new IndexOutOfBoundsException("Throwing IndexOutOfBoundsException when trying to" +
                    " remove element at position " + index);
        }
    }

    public void printObject(){
        for(int i = 0; i < this.elements.length; i++){
            System.out.print(this.elements[i] + " ");
        }
        System.out.println();
    }

    public void add(int index, int element) {
        checkIndex(index);
        int[] newArray = new int[this.size + 1];
//
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (i != index) {
                    newArray[j] = this.elements[i];
                    i++;
                } else {
                    newArray[j] = element;
                    newArray[j + 1] = this.elements[i];
                    i++;
                    j++;
                }
            }
        }
        size++;
        this.elements = newArray;
    }

    public boolean add(int e) {

        if(this.size == this.elements.length){
            Arrays.copyOf(this.elements, this.elements.length * 2);
        }
        this.elements[size] = e;
        this.size++;

        return true;
    }


    public int size() {
        return this.size;
    }

    public boolean contains(int e) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        checkIndex(index);
        for (int i = index; i < this.elements.length; i++) {
                return this.elements[index];
        }
        return -1;
    }

    public int indexOf(int e) {
        for (int i = 0; i <= this.elements.length; i++) {
            if (this.elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int e) {

        int lastIndexOfElement = -1;
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == e) {
                lastIndexOfElement = i;
            }
        }
        return lastIndexOfElement;
    }

    public boolean remove(int element) {

        boolean wasRemoved = false;

        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == element) {
                this.elements[i] = this.elements[i + 1];
                i--;
                wasRemoved = true;
            }
        }
        return wasRemoved;
    }

    public int removeElementAtIndex(int index) {

        checkIndex(index);

        int removedElement = -1;
        for (int i = index; i < this.elements.length; i++) {
            removedElement = this.elements[index];
            this.elements[i] = this.elements[i + 1];
            i--;
            return removedElement;
        }
        return -1;
    }

    public void clear() {

        int[] newArray = new int[10];
        this.elements = newArray;
    }

    public int set(int index, int element) {

        checkIndex(index);
        int[] newArray = new int[this.elements.length + 1];
//        this.elements = Arrays.copyOf(this.elements, this.elements.length + 1);
        for (int i = 0; i < this.elements.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (i != index) {
                    newArray[j] = this.elements[i];
                    i++;
                } else {
                    newArray[j] = element;
                    newArray[j + 1] = this.elements[i];
                    i++;
                    j++;
                }
            }
        }
        this.elements = newArray;
        return element;
    }

    public boolean addAll(MyIntArrayList c) {

        int[] newArray = Arrays.copyOf(this.elements, this.elements.length + c.size);

        for(int i = this.elements.length; i < newArray.length; i++ ){
            for(int k = 0; k < c.size; k++){
                newArray[i] = c.elements[k];
                i++;
            }
        }
        this.elements = newArray;
        return true;
    }
    public boolean addAll(int index, MyIntArrayList c){

        int[] newArray = Arrays.copyOf(this.elements, this.elements.length + c.size);

        for (int i = 0; i < this.elements.length; i++) {
                newArray[i] = this.elements[i];
                if (i == index) {
                    for (int k = 0; k < c.size; k++) {
                        newArray[i] = c.elements[k];
                        i++;
                        continue;
                    }break;
                }
            }
        for(int k = index; k < this.elements.length; k++){
            newArray[k + c.size] = this.elements[k];
        }
        this.elements = newArray;
        return true;
    }

    public int[] toArray(){

        int[] newArray = Arrays.copyOf(this.elements, this.size);
        return newArray;
    }

    public void ensureCapacity(int minCapacity){
        int[] minCapArray= new int[minCapacity];
        this.elements = minCapArray;
    }
    public void trimToSize(){
        this.elements = Arrays.copyOf(this.elements,this.size);
    }



}

