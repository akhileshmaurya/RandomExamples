
package practice.hackerearth;

import java.util.ArrayList;

@SuppressWarnings("deprecation")

public class LockImpl implements Lock {

  public static void main(String[] args) {
    ArrayList<Integer> obj = new ArrayList<Integer>();
    obj.add(new Integer(0));
    obj.add(new Integer(6));
    obj.add(new Integer(0));
    obj.removeAll(obj);
    boolean x = false;
    System.out.println(x);
    System.out.println(obj.isEmpty());

  }

  @Override
  public void acquire() {

  }

  @Override
  public void release() {
    // TODO Auto-generated method stub

  }

}


interface Lock {

  public void acquire();

  public void release();

}
