
package circularlinkedlisttest;

/**
 *
 * @author xrosi
 */
public class CircularLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CircularLinkedQueue<Integer> q = new CircularLinkedQueue<Integer>();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
       
                

        System.out.println("Size: " + q.size());

        Integer e = q.front();
        System.out.println("Size: " + q.size());
        System.out.println(e);

        e = q.dequeue();
        e = q.dequeue();
        System.out.println("Size: " + q.size());

        e = q.dequeue();
        e = q.dequeue();
        e = q.dequeue();
        System.out.println("Size: " + q.size() + " isEmpty: " + q.isEmpty());

    }
    
}
