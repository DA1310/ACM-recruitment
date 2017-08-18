package Union_Find;

public class Client_Union_Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Union_Find test = new Union_Find(10);
	        test.remove(5);
	        System.out.println(test.successor(2));
	        test.remove(6);
	        System.out.println(test.successor(2));
	        System.out.println(test.successor(8));
	        test.remove(7);
	        System.out.println(test.successor(8));
	        test.remove(1);
	        System.out.println(test.successor(8));
	        test.remove(2);
	        System.out.println(test.successor(3));

	}

}
