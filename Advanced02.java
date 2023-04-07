package org.bcit.midterm.questions;

public class Advanced02 {


}
/*

 Similarly to the original question, this question tests my understanding and ability to implement custom data structures
 and iterators. As I think the implementation of linked lists is a key concept to understand, this question is fairly similar
 to the original to help better my understanding of the topic.


Advanced02:
You are working on a project that requires you to implement a custom data structure that behaves like a queue.
To achieve this, you decide to implement the data structure as a linked list of nodes.
Each node has a label field that stores a string value, a value field that stores an integer value,
and a next field that stores a reference to the next node in the list.

Your task is to create a class called LinkedListQueue that implements this data structure as a linked list of nodes.
The class should have the following methods:

enqueue(label: str, value: int) - Adds a new node to the end of the queue with the given label and value.
dequeue() - Removes and returns the first node in the queue.
is_empty() - Returns True if the queue is empty, False otherwise.
size() - Returns the number of nodes in the queue.

You also need to create two iterators that allow you to traverse the linked list in forward and backward directions.

Write a class called LinkedListNode that represents a node in the linked list. This class should have the following fields:
label - a string value representing the label of the node
value - an integer value representing the value of the node
next - a reference to the next node in the list

Write a class called LinkedListQueueIterator that implements both forward and backward iterators for the LinkedListQueue.
The forward iterator should be implemented as a generator function that yields each node in
the queue in the order they were added. The backward iterator should also be implemented as a generator function
that yields each node in the queue in reverse order.

Write a test class that thoroughly tests the LinkedListQueue, LinkedListNode, and LinkedListQueueIterator classes,
including testing for the correctness of the state after the various methods are called, and the proper iteration over the nodes in the
queue in both forward and backward directions.







 */
