package org.bcit.midterm.questions;

import java.util.Iterator;

public class Advanced02LinkedListQueueIterator<T> implements Iterator<T> {
  //Instance variables
  //Current node the iterator is pointing to
  //Boolean that indicates if the iterator is reversing
  Advanced02LinkedListNode<T> currentNode;
  boolean reverse;

  //Constructor - implements the reverse iterator
  public Advanced02LinkedListQueueIterator(Advanced02LinkedListNode<T> start, boolean reverse) {
    currentNode = start;
    this.reverse = reverse;
  }

  //Constructor - sets up the forward iterator
  public Advanced02LinkedListQueueIterator(Advanced02LinkedListNode<T> start) {
    //Call the reverse iterator constructor and set reverse to false
    this(start, false);
  }

  //Override method that needs to be implemented when implementing an Iterator
  //This method checks if current node is null
  //If the node isn't null - return true
  //This lets us know that there is another node
  @Override
  public boolean hasNext() {
    return currentNode != null;
  }

  //Override method that needs to be implemented when implementing an Iterator
  //This method returns the label of the next node in the linked list queue
  @Override
  public T next() {
    //If there isn't a next node, throw an error exception
    if (!hasNext()) {
      throw new IllegalStateException("No more nodes");
    }
    //Get the label of the current node
    T label = currentNode.getLabel();

    if (reverse) {
      //If the iterator is in reverse, move to the previous node in reverse
      currentNode = currentNode.getPrev();
    } else {
      //Iterator isn't in reverse, move to the next node with forwards iterator
      currentNode = currentNode.getNext();
    }
    //Return the label of the current node
    return label;
  }

}
