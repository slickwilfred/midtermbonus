package org.bcit.midterm.questions;

import java.util.Iterator;

public class Advanced02LinkedListQueue<T> implements Iterable<T>{
     //Instance variables - create head and tail nodes
    //Size holds the size of the linked list
     Advanced02LinkedListNode<T> head;
     Advanced02LinkedListNode<T> tail;
     int size;


     //this method adds a node to the linked list
    //Takes a T label (node label) and an int value as arguments
    public void enqueue(T label, int value) {
      //Create a new node object
      //Set the next node to null so another node can be added
      Advanced02LinkedListNode<T> newNode = new Advanced02LinkedListNode<>(label, value, null, tail);
      if (isEmpty()) {
        //If the linked list is empty, assign the new node to the head of the linked list
        head = newNode;
      } else {
        //set the tail's next pointer to the new node
        tail.setNext(newNode);
        //set the new node's prev pointer to the tail node
        newNode.setPrev(tail);
      }
      //Set tail node to the value of the new node
      tail = newNode;
      //Increment the size of the list
      size++;
    }

    //This method removes the head from the linked list
    public T dequeue() {
      //If the list is empty, throw exception
      if (isEmpty()) {
        throw new IllegalStateException("Queue is empty");
      }
      //get the label of the head node
      T label = head.getLabel();
      //The next pointer of the head node now becomes the head node
      head = head.getNext();
      //if the head is null, make the tail node null
      if (head == null) {
        tail = null;
      }
      //Decrement the linked list size
      size--;
      return label;
    }

    //Method that returns true if the linked list has a size of 0 (empty)
    public boolean isEmpty() {
      return size == 0;
    }


    //Create forwards and backwards iterators
    public Iterator<T> iterator() {
      return new Advanced02LinkedListQueueIterator<>(head, false);
    }

    public Iterator<T> reverseIterator() {
      return new Advanced02LinkedListQueueIterator<>(tail, true);
    }
}




