package com.practiceExample.ArrayList;

// 1) 인스턴스/객체의 주소를 담을 레퍼런스 배열을 준비한다.
// 2) 인스턴스를 추가하는 add() 메서드 정의 
// 3) 특정 인덱스의 인스턴스를 리턴하는 get(int)메서드를 정의한다.
// 4) 인스턴스의 특정 위치에 삽입하는 add(int, Object)메서드를 정의한다.
// 5) 특정 위치의 항목을 다른 인스턴스로 교체하는 set(int, Object)메서드를 정의한다.
// 6) 특정 위치의 항목을 제거하는 remove(int)메서드를 정의한다.
public class MyArrayList06 {
  static Object[] elementData = new Object[5];
  static int size;
  
  static public boolean add(Object e) {
    elementData[size++] = e;
    return true;
  }
  
  static public void add(int index, Object element) {
    if(index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }
    for(int i = size; i > index; i--) {
      elementData[i] = elementData[i-1];
    }
      elementData[index] = element;
      size++;
  }
  
  static public Object get(int index) {
    return elementData[index];
  }
  
  static public Object set(int index, Object element) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
      Object old = elementData[index];
      elementData[index] = element;
      return old;
  }
  
  static public Object remove(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Object old = elementData[index];
    for(int i = index; i < size-1; i++) {
      elementData[i] = elementData[index+1];
    }
    size--;
    return old;
  }
}
