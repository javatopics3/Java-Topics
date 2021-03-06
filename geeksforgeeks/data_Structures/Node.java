package data_Structures;

import java.util.Arrays;

/*Java program to find LCA of u and v by reducing problem to RMQ
 */
// A binary tree node
public class Node {
	Node left, right;
	int data;

	Node(int item) {
		data = item;
		left = right = null;
	}
}// Node---class

class St_class {
	int st;
	int stt[] = new int[10000];
}

class BinaryTree {
	Node root;
	int v = 9; // v is the highest value of node in our tree
	int euler[] = new int[2 * v - 1]; // for euler tour sequence
	int level[] = new int[2 * v - 1]; // level of nodes in tour sequence
	int f_occur[] = new int[2 * v - 1]; // to store 1st occurance of nodes
	int fill; // variable to fill euler and level arrays
	St_class sc = new St_class();

	// log base 2 of x
	int Log2(int x) {
		int ans = 0;
		int y = x >>= 1;
		while (y-- != 0)
			ans++;
		return ans;
	}

	int swap(int a, int b) {
		return a;
	}

	/*
	 * A recursive function to get the minimum value in a given range of array
	 * indexes. The following are parameters for this function.
	 * 
	 * st --> Pointer to segment tree index --> Index of current node in the
	 * segment tree. Initially 0 is passed as root is always at index 0 ss & se
	 * --> Starting and ending indexes of the segment represented by current
	 * node, i.e., st[index] qs & qe --> Starting and ending indexes of query
	 * range
	 */
	int RMQUtil(int index, int ss, int se, int qs, int qe, St_class st) {
		// If segment of this node is a part of given range, then return
		// the min of the segment
		if (qs <= ss && qe >= se)
			return st.stt[index];

		// If segment of this node is outside the given range
		else if (se < qs || ss > qe)
			return -1;

		// If a part of this segment overlaps with the given range
		int mid = (ss + se) / 2;

		int q1 = RMQUtil(2 * index + 1, ss, mid, qs, qe, st);
		int q2 = RMQUtil(2 * index + 2, mid + 1, se, qs, qe, st);

		if (q1 == -1)
			return q2;
		else if (q2 == -1)
			return q1;

		return (level[q1] < level[q2]) ? q1 : q2;
	}

	// Return minimum of elements in range from index qs (quey start) to
	// qe (query end). It mainly uses RMQUtil()
	int RMQ(St_class st, int n, int qs, int qe) {
		// Check for erroneous input values
		if (qs < 0 || qe > n - 1 || qs > qe) {
			System.out.println("Invalid input");
			return -1;
		}

		return RMQUtil(0, 0, n - 1, qs, qe, st);
	}

	// A recursive function that constructs Segment Tree for array[ss..se].
	// si is index of current node in segment tree st
	void constructSTUtil(int si, int ss, int se, int arr[], St_class st) {
		// If there is one element in array, store it in current node of
		// segment tree and return
		if (ss == se)
			st.stt[si] = ss;
		else {
			// If there are more than one elements, then recur for left and
			// right subtrees and store the minimum of two values in this node
			int mid = (ss + se) / 2;
			constructSTUtil(si * 2 + 1, ss, mid, arr, st);
			constructSTUtil(si * 2 + 2, mid + 1, se, arr, st);

			if (arr[st.stt[2 * si + 1]] < arr[st.stt[2 * si + 2]])
				st.stt[si] = st.stt[2 * si + 1];
			else
				st.stt[si] = st.stt[2 * si + 2];
		}
	}

	/*
	 * Function to construct segment tree from given array. This function
	 * allocates memory for segment tree and calls constructSTUtil() to fill the
	 * allocated memory
	 */
	int constructST(int arr[], int n) {
		// Allocate memory for segment tree
		// Height of segment tree
		int x = Log2(n) + 1;

		// Maximum size of segment tree
		int max_size = 2 * (1 << x) - 1; // 2*pow(2,x) -1

		sc.stt = new int[max_size];

		// Fill the allocated memory st
		constructSTUtil(0, 0, n - 1, arr, sc);

		// Return the constructed segment tree
		return sc.st;
	}

	// Recursive version of the Euler tour of T
	void eulerTour(Node node, int l) {
		/* if the passed node exists */
		if (node != null) {
			euler[fill] = node.data; // insert in euler array
			level[fill] = l; // insert l in level array
			fill++; // increment index

			/* if unvisited, mark first occurrence */
			if (f_occur[node.data] == -1)
				f_occur[node.data] = fill - 1;

			/*
			 * tour left subtree if exists, and remark euler and level arrays
			 * for parent on return
			 */
			if (node.left != null) {
				eulerTour(node.left, l + 1);
				euler[fill] = node.data;
				level[fill] = l;
				fill++;
			}

			/*
			 * tour right subtree if exists, and remark euler and level arrays
			 * for parent on return
			 */
			if (node.right != null) {
				eulerTour(node.right, l + 1);
				euler[fill] = node.data;
				level[fill] = l;
				fill++;
			}
		}
	}

	// returns LCA of node n1 and n2 assuming they are present in tree
	int findLCA(Node node, int u, int v) {
		/*
		 * Mark all nodes unvisited. Note that the size of firstOccurrence is 1
		 * as node values which vary from 1 to 9 are used as indexes
		 */
		Arrays.fill(f_occur, -1);

		/* To start filling euler and level arrays from index 0 */
		fill = 0;

		/* Start Euler tour with root node on level 0 */
		eulerTour(root, 0);

		/* construct segment tree on level array */
		sc.st = constructST(level, 2 * v - 1);

		/*
		 * If v before u in Euler tour. For RMQ to work, first parameter 'u'
		 * must be smaller than second 'v'
		 */
		if (f_occur[u] > f_occur[v])
			u = swap(u, u = v);

		// Starting and ending indexes of query range
		int qs = f_occur[u];
		int qe = f_occur[v];

		// query for index of LCA in tour
		int index = RMQ(sc, 2 * v - 1, qs, qe);

		/* return LCA node */
		return euler[index];

	}

	// Driver program to test above functions
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();

		// Let us create the Binary Tree as shown in the diagram.
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.right.left = new Node(8);
		tree.root.left.right.right = new Node(9);

		int u = 4, v = 9;
		System.out.println("The LCA of node " + u + " and " + v + " is "
				+ tree.findLCA(tree.root, u, v));
	}

}