package org.bcit.midterm.questions;

//This represents a node in a doubly-linked list
//The class uses a generic type parameter (T) that allows it to
//store any data type
public class Advanced02LinkedListNode<T> {
    //Instance variables
    T label;
    int value;
    //Create references to the previous and next node in the list
    Advanced02LinkedListNode<T> next;
    Advanced02LinkedListNode<T> prev;


    //Constructor
    //Each node needs a label, value and references to the previous/next nodes in the list
    public Advanced02LinkedListNode(T label, int value, Advanced02LinkedListNode<T> next, Advanced02LinkedListNode<T> prev) {
      //Initialize instance variables
      this.label = label;
      this.value = value;
      this.next = next;
      this.prev = prev;
    }


    //Accessor - returns the data stored in the node
    public T getLabel() {
      return label;
    }

    //Accessor - returns the value stored in a node
    public int getValue() {
      return value;
    }

    //Accessor - returns the reference to the next node in the list
    public Advanced02LinkedListNode<T> getNext() {
      return next;
    }

    //Mutator - sets the reference of next node in the list
    public void setNext(Advanced02LinkedListNode<T> next) {
      this.next = next;
    }

    //Accessor - returns the reference to the previous node in the list
    public Advanced02LinkedListNode<T> getPrev() {
    return prev;
  }

    //Mutator - sets the reference of the previous node in the list
    public void setPrev(Advanced02LinkedListNode<T> prev) {
    this.prev = prev;
  }


}
