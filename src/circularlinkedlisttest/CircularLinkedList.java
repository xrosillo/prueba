package circularlinkedlisttest;

public class CircularLinkedList<E> {

  // in a circle there is no "first", so we change the name
  private Node<E> position;
  //private Node<E> first;
  private int tamany;

  // a list is always created in an empty state
  protected CircularLinkedList() {
    position = null;
  //  first = null;
    tamany = 0;
  }

  // if we need position in classes that extend this one
  protected Node<E> getPosition() {
    return position; 
  }

  // simple and self-explained code. Worth to reuse it
  public boolean isEmpty() {
    return (position == null);
  }

  // we insert after position, just because we had
  // to decide where to insert, but no special reason
  public void insert(E o) {
    Node<E> tmp = new Node(o, null);
    
    
    
    
    
    
    /*
    // the following sentence has no problem with null values of "first"
    tmp.setNext(position);
    // we move the "first" reference
    position = tmp;
    tamany++;
    if (this.size() == 1) position.setNext(position);
    if (this.size() == 2) position.setNext(position.getNext());
    */
  }

  public E extract() {
    // look carefully which value is returned in each case
    //
    // 1 - if the list is empty, return null
    // 2 - if the list has only one value,
    // return the value and state that the list is empty
    // 3 - if the list has more than one value,
    // return the value that is next to 'position' and
    // the Node that contained the returned Object.
    //
    // Look that in the third case, instead of returning the value of
    // position, it is returned the next in the list. Why? Because it was
    // easier to implement, nothing else. (draw it for a better understanding)
    if (this.isEmpty()) {
        return(null);
    } else if (this.size() == 1) {        
        E aux = position.getInfo();
        position = null;
        return(aux);
    }
    // the list has more than one value
    E aux = position.getNext().getInfo();
    position.setNext(position.getNext().getNext());
    position = position.getNext().getNext();
    // TODO 
    return aux;
  }

  public String toString() {
    // TODO
    return "";
  }

  public int size() {
    return tamany;
  }

  public Object[] toArray() {

    return null;
  }

}