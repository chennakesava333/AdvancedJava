package jrp.pack1;

class Test 
{
	public void meth1(int a,String b) 
	{
		System.out.println(a+"   "+b);
	}
	public Test(String s) 
	{
		System.out.println(s);
	}
	public Test() {
		// TODO Auto-generated constructor stub
	}
}
public class Grabage_collector_demo1 {

	public static void main(String[] args) {
		
		Test t1=new Test();
		t1.meth1(111, "nikhil");
       t1 =new Test("hello");
      
	}

}
