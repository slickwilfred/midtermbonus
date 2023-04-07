package org.bcit.midterm.questions;

import java.util.Iterator;

public class Advanced02LinkedListQueueTest {

  public static void main(String[] args){
    //Create a new linked list queue object
    Advanced02LinkedListQueue<String> q = new Advanced02LinkedListQueue<>();
    //Add nodes to the linked list queue object using the enqueue method
    q.enqueue("Node 1", 1);
    q.enqueue("Node 2", 2);
    q.enqueue("Node 3", 15);
    q.enqueue("Node 4", 50);
    q.enqueue("Node 5", 22);


    //Print out the nodes using the forward iterator
    System.out.println("Nodes printed using the forwards iterator:");
    //Call the iterator method on the q
    //While there is a next node & label, print the label
    Iterator<String> forwards = q.iterator();
    while (forwards.hasNext()){
      String label = forwards.next();
      System.out.println(label);
    }


    //Print out the nodes using the backwards iterator
    System.out.println("\nNodes printed using the backwards iterator:");
    //Call the iterator method on the q
    //While there is a next node & label, print the label
    Iterator<String> backwards = q.reverseIterator();
    while (backwards.hasNext()){
      String label = backwards.next();
      System.out.println(label);
    }


    //Remove the head node with the dequeue method
    q.dequeue();

    //Current contents of linked list
    System.out.println("\nUpdated linked list after use of the dequeue method");
    for (String s : q){
      if (q != null){
        System.out.println(s);
      } else {
        System.out.println("The linked list is empty");
      }
    }



  }


}
