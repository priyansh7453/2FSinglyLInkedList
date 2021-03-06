package myinterface;

public interface MySinglyLinkedList {
    // insertAtBeginning
    //insert ATHead
    void addFirst(int element);
    //insertAtEnd
    //insertAtTail
    //void addLast(int element);
    boolean isEmpty();  // will give true  if linked List is empty
    int size();  //will give total number of element in linked list
    void addLast(int element);
    void addLastWithoutUsingTail(int element);
    void traverse();
    void addAfterGivenNode(int givenElement , int element);
    //void addBeforeGivenNode(int givenElement , int element);
    int removeFirst();
    int removeLast();
    int removeGivenNode(int givenElement);
    boolean searchElement(int element);
    int first();
    int last();

}
