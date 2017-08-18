package Union_Find;



public class Union_Find {

	 
	private boolean data[]; // data[i] == false if removed
	private FindLargest FL; // used to find largest unremoved element
	private int N; // N integers in S

	public Union_Find(int x) {
	        this.N = x;
	        data = new boolean[N];
	        for (int i = 0; i < N; ++i) 
	            data[i] = true;
	        FL = new FindLargest(N);
	    }

	public void remove(int x) {
		data[x] = false;
		if (x > 0 && !data[x - 1])
			FL.union(x, x - 1);
		if (x < N - 1 && !data[x + 1])
			FL.union(x, x + 1);
	}

	public int successor(int x) {
	        if (data[x]) {
	            return x;
	        } else {
	            int succ = FL.find(x) + 1;
	            if (succ >= N) {
	                System.out.println("No such larger number");
	                return -1;
	            } else {
	                return succ;
	            }
	        }
	 }
}
