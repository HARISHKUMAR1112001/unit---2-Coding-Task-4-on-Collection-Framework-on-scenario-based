/*
 * Write a simple program using Queue interface and add 6 integers and print
 * them and remove 2 integral out of it, print the removed elements and existing
 * elements (Stack)
 */

import java.util.*;

class Main {
  Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();

  int remove() {
    if (q1.isEmpty())
      return 0;

    // Leave one element in q1 and push others in q2.
    while (q1.size() != 1) {
      q2.add(q1.peek());
      q1.remove();
    }

    // Pop the only left element from q1
    int n = q1.remove();

    // swap the names of two queues
    Queue<Integer> q = q1;
    q1 = q2;
    q2 = q;
    return n;
  }

  void add(int x) {
    q1.add(x);
  }

  void display() {
    System.out.print(q1);
  }

  // Driver code
  public static void main(String[] args) {
    Main s = new Main();

    for (int i = 0; i < 6; i++) {
      s.add(i);
    }
    System.out.print("Elements of queue - ");
    s.display();

    int element1 = s.remove();
    System.out.println(" \nremoved element1 - " + element1);

    int element2 = s.remove();
    System.out.println("removed element2 - " + element2);

    System.out.print("Elements of queue after deletion operation - ");
    s.display();
  }
}
