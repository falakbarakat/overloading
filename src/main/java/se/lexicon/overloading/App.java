package se.lexicon.overloading;

/**
 * Hello world!
 *
 */
public class App {
    	public static void main( String[] args ){	
    	A ob=new A();
    	ob.display(20,"Nils");
    	ob.display("java",10);
    	double d=321.456;
    	ob.display((int)d,"judy");
    	ob.display("programing",(int)d);
    }
    

}

class A{
	public void display(int i,String s) {
	System.out.println("int:"+i +"String:"+s);	
	}
	
	public void display(String s,int i) {
		System.out.println("String:"+s+"int:"+i);	
	}

}
