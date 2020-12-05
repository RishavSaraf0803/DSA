package DSAQuestions;

public  class TreeNode {
	int data;
	TreeNode left,right;
	
	public TreeNode(int item){
		data=item;
		left=null;
		right=null;
	}
	public static int Height(TreeNode root) {
		if(root==null)return 0;
		else
			return Integer.max(Height(root.left),Height(root.right))+1;
	}

}
