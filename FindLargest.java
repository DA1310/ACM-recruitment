package Union_Find;

public class FindLargest {

	private int id[]; // id[i] = parent of node i
	private int size[]; // size[i] = size of node i
	private int large[]; // large[i] = largest element in component

	public FindLargest(int N) {
		size = new int[N];
		id = new int[N];
		large = new int[N];
		for (int i = 0; i < N; ++i) {
			id[i] = i;
			size[i] = 1;
			large[i] = i;
		}
	}

	private int root(int p) {
		while (id[p] != p) {
			id[p] = id[id[p]];
			p = id[p];
		}
		return p;
	}

	public int find(int p) {
		return large[root(p)];
	}

	public void union(int p, int q) {
		int rootp = root(p);
		int rootq = root(q);
		if (rootp == rootq) {
			return;
		}
		int largestp = large[rootp];
		int largestq = large[rootq];
		if (size[rootp] < size[rootq]) {
			id[rootp] = rootq;
			size[rootq] += size[rootp];

			if (largestp > largestq)
				large[rootq] = largestp;
		} else {
			id[rootq] = rootp;
			size[rootp] += size[rootq];

			if (largestq > largestp)
				large[rootp] = largestq;
		}
	}
}
