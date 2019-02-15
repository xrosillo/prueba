package circularlinkedlisttest;

public class Node<E> {

  private E info;
  private Node<E> next;

  public Node() {
    info = null;
    next = null;
  }

  public Node(E o, Node<E> n) {
    setInfo(o);
    setNext(n);
  }

  public void setInfo(E o) {
    info = o;
  }

  public void setNext(Node<E> n) {
    next = n;
  }

  public E getInfo() {
    return info;
  }

  public Node<E> getNext() {
    return next;
  }
}