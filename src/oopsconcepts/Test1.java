package oopsconcepts;

public class Test1 {
  public void test1() {
	  System.out.println("Test1");
  }
   void test2() {
	  System.out.println("Test2");
  }
  protected void test3() {
	  System.out.println("Test3");
  }
  private void test4() {
	  System.out.println("Test4");
  }
  
  public static void main(String[] args) {
	Test1 t1  = new Test1();
	t1.test1();
	t1.test2();
	t1.test3();
	t1.test4();
}
}
