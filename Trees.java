/* PRE ORDER                                 1
Its types are:							2			3
1.ROOT								4	5				6
2.LEFT SUBTREE
3.RIGHT SUBTREE

SOL = 1,2,4,5,3,6

IN ORDER:
1.LEFT SUBTREE
2.ROOT
3.RIGHT SUBTREE  

SOL = 4,2,5,1,3,6

POST ORDER:
1.LEFT SUBTREE
2.RIGHT SUBTREE
3.ROOT

SOL = 4,5,2,6,3,1   */




package Com;


public class Trees {
static class node{
	int data;
	node left;
	node right;
	node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
static class BinaryTree{
	static int idx = -1;
	public static node buildtree(int nodes[]) {
		idx++;
		if(idx >= nodes.length || nodes[idx] == -1)
			return null;

	node newnode = new node(nodes[idx]);
	newnode.left = buildtree(nodes);
	newnode.right = buildtree(nodes);
	return newnode;
}
public static void preorder(node root) {
	if(root == null) {
		return;
	}
	System.out.println(root.data+"");
	preorder(root.left);
	preorder(root.right);
}
	public static void inorder(node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data+"");
		inorder(root.right);
	}
	public static void postorder(node root) {
		if(root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data+"");
	}
	public static void main(String[] args) {
			// Correct preorder input: 124-1-15-1-13-16-1-1
			int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
			BinaryTree tree = new BinaryTree();
			node root = tree.buildtree(nodes);
			// System.out.println(root.data);
			// Output → 1
			tree.inorder(root);
	}}}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

