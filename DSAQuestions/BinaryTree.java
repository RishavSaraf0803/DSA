package DSAQuestions;
import java.util.*;
import  DSAQuestions.TreeNode;
public class BinaryTree {
	
	TreeNode root;
	
	
public void inorder(TreeNode root) {
	if(root==null)return;
	TreeNode curr=root;
	Stack<TreeNode> st=new Stack<>();
	while(curr!=null||st.size()>0) {
		
		while(curr!=null) {
			st.push(curr);
			curr=curr.left;
		}
		curr=st.pop();
		System.out.print(curr.data+" ");
		curr=curr.right;
	}
}
public void preorder(TreeNode root) {
	if(root==null)return;
	TreeNode curr=root;
	Stack<TreeNode> st=new Stack<>();
	
	while(curr!=null||!st.isEmpty()) {
		
		while(curr!=null) {
			System.out.print(curr.data+" ");
			st.push(curr.right);
			curr=curr.left;
		}
		curr=st.pop();		
	}
}
	public void postorder(TreeNode root) {
		if(root==null)return;
		
	}
	//Right View BST
	 public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> l=new ArrayList<>();
	        if(root==null)return l;
	        Queue<TreeNode> q=new LinkedList<>();
	        TreeNode curr=root;
	        q.add(root);
	        while(!q.isEmpty()){
	            int size=q.size();
	            int i=0;
	            while(i<size){
	              curr=q.poll();
	                if(i==size-1){
	                    l.add(curr.data);
	                    
	                }
	                if(curr.left!=null)q.add(curr.left);
	                if(curr.right!=null)q.add(curr.right);
	                i++;
	            }
	        }
	        return l;
	    }
	 //Left View of BST
	 public List<Integer> leftSideView(TreeNode root) {
	        List<Integer> l=new ArrayList<>();
	        if(root==null)return l;
	        Queue<TreeNode> q=new LinkedList<>();
	        TreeNode curr=root;
	        q.add(root);
	        while(!q.isEmpty()){
	            int size=q.size();
	            int i=0;
	            while(i<size){
	              curr=q.poll();
	                if(i==0){
	                    l.add(curr.data);
	                    
	                }
	                if(curr.left!=null)q.add(curr.left);
	                if(curr.right!=null)q.add(curr.right);
	                i++;
	            }
	        }
	        return l;
	    }
	 //TopSideView
	 public List<Integer> TopSideView(TreeNode root){
		 class Obj{
			 int hd;TreeNode node;
			 Obj(int hd,TreeNode root){
				 this.hd=hd;
				 this.node=root;
			 }
		 }
		 
		 List<Integer> l=new ArrayList<>();
		 if(root==null)return l;
		 
		 Queue<Obj> q=new LinkedList<>();
		 Map<Integer,TreeNode> map=new HashMap<>();
		 q.add(new Obj(0,root));
		 
		 while(!q.isEmpty()) {
			 Obj ob=q.poll();
			 if(!map.containsKey(ob.hd))
				 map.put(ob.hd, ob.node);
			 if(ob.node.left!=null)q.add(new Obj(ob.hd-1,ob.node.left));
			 if(ob.node.right!=null)q.add(new Obj(ob.hd+1,ob.node.right));
		 }
		 for(Map.Entry<Integer,TreeNode> entry:map.entrySet()) {
			 l.add(entry.getValue().data);
		 }
		 return l;
	 }
	 //BottomView
	 public List<Integer> BottomSideView(TreeNode root){
		 class Obj{
			 int hd;TreeNode node;
			 Obj(int hd,TreeNode root){
				 this.hd=hd;
				 this.node=root;
			 }
		 }
		 
		 List<Integer> l=new ArrayList<>();
		 if(root==null)return l;
		 
		 Queue<Obj> q=new LinkedList<>();
		 Map<Integer,TreeNode> map=new HashMap<>();
		 q.add(new Obj(0,root));
		 
		 while(!q.isEmpty()) {
			 Obj ob=q.poll();
			 
				 map.put(ob.hd, ob.node);
			 if(ob.node.left!=null)q.add(new Obj(ob.hd-1,ob.node.left));
			 if(ob.node.right!=null)q.add(new Obj(ob.hd+1,ob.node.right));
		 }
		 for(Map.Entry<Integer,TreeNode> entry:map.entrySet()) {
			 l.add(entry.getValue().data);
		 }
		 return l;
	 }
	 
	 //vertical order traversal
	 
	 public List<List<Integer>> verticalTraversal(TreeNode root) {
	     class Obj{
	    	 int hd;TreeNode node;
	    	 Obj(int hd,TreeNode node){
	    		 this.node=node;
	    		 this.hd=hd;
	    	 }
	     }
		 
		 List<List<Integer>> l=new ArrayList<>();
	        if(root==null)return l;
	        Queue<Obj> q=new LinkedList<>();
	        Map<Integer,List<Integer>> map=new TreeMap<>();
	        q.add(new Obj(0,root));
	        while(!q.isEmpty()){
	            Obj temp=q.poll();
	            
	            if(map.containsKey(temp.hd))
	                map.get(temp.hd).add(temp.node.data);
	            else{
	                ArrayList<Integer> al=new ArrayList<>();
	                al.add(temp.node.data);
	                map.put(temp.hd,al);
	            }
	            if(temp.node.left!=null)q.add(new Obj(temp.hd-1,temp.node.left));
	            if(temp.node.right!=null)q.add(new Obj(temp.hd+1,temp.node.right));
	        }
	            for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
	                List<Integer> res=entry.getValue();
	              //Collections.sort(res);
	                l.add(res);
	            }
	        return l;
	        }
	 //Diagonal Traversal
	 public List<List<Integer>> DiagonalTraversal(TreeNode root) {
	     class Obj{
	    	 int hd;TreeNode node;
	    	 Obj(int hd,TreeNode node){
	    		 this.node=node;
	    		 this.hd=hd;
	    	 }
	     }
		 
		 List<List<Integer>> l=new ArrayList<>();
	        if(root==null)return l;
	        Queue<Obj> q=new LinkedList<>();
	        Map<Integer,List<Integer>> map=new TreeMap<>();
	        q.add(new Obj(0,root));
	        while(!q.isEmpty()){
	            Obj temp=q.poll();
	            
	            if(map.containsKey(temp.hd))
	                map.get(temp.hd).add(temp.node.data);
	            else{
	                ArrayList<Integer> al=new ArrayList<>();
	                al.add(temp.node.data);
	                map.put(temp.hd,al);
	            }
	            if(temp.node.left!=null)q.add(new Obj(temp.hd-1,temp.node.left));
	            if(temp.node.right!=null)q.add(new Obj(temp.hd,temp.node.right));
	        }
	            for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
	                List<Integer> res=entry.getValue();
	              //Collections.sort(res);
	                l.add(res);
	            }
	        return l;
	        }
	//Level Order Traversal
 public	List<Integer> PrintLOT(TreeNode root) { 
		Queue<TreeNode> q=new LinkedList<>();
		List<Integer> result=new ArrayList<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode temp=q.poll();
		    result.add(temp.data);
		    if(temp.left!=null)q.add(temp.left);
		    if(temp.right!=null)q.add(temp.right);
		}
		return result;
	}
//Reverse Level order Traversal
	public List<Integer> PrintReverseLOT(TreeNode root){
		Queue<TreeNode> q=new LinkedList<>();
		Stack<TreeNode> st=new Stack<>();
		List<Integer> result=new ArrayList<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode temp=q.poll();
			st.push(temp);
			if(temp.right!=null)q.add(temp.right);
			if(temp.left!=null)q.add(temp.left);
		}
		while(!st.isEmpty()) {
			result.add(st.peek().data);
			st.pop();
		}
		return result;
	}
	
	public List<Integer>  SpiralLOT(TreeNode root){
     
		int height=TreeNode.Height(root);
		int flag=0;
		List<Integer> l=new ArrayList<>();
		for(int i=1;i<=height;i++) {
		   l= spiral(root,i,flag,l);
			flag^=1;
			
		}
		return l;
	}
	 List<Integer> spiral(TreeNode root,int level,int flag,List<Integer> l) {		//spiral traversal of BST
		 if(root==null)return l;
		 if(level==1)l.add(root.data);
         if(level>1) {
        	 if(flag==0) {
        		 spiral(root.left,level-1,flag,l);
        		 spiral(root.right,level-1,flag,l);
        	 }
        	 if(flag==1) {
        		 spiral(root.right,level-1,flag,l);
        		 spiral(root.left,level-1,flag,l);
        	 }
         }
         return l;
	 
	 }
	 int diameter(TreeNode root) {								//diameter of BST
		 if(root==null)return 0;
		 int lheight=TreeNode.Height(root.left);
		 int rheight=TreeNode.Height(root.right);
		 int ldiameter=diameter(root.left);
		 int rdiameter=diameter(root.right);
		 return Integer.max(lheight+rheight+1, Integer.max(ldiameter,rdiameter));
	 }
	 
	 

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		 BinaryTree tree_level = new BinaryTree(); 
	        tree_level.root = new TreeNode(1); 
	        tree_level.root.left = new TreeNode(2); 
	        tree_level.root.right = new TreeNode(3); 
	        tree_level.root.left.left = new TreeNode(4); 
	        tree_level.root.left.right = new TreeNode(5);
	       //LevelOrderTraversal
	        List<Integer> lot=tree_level.rightSideView(tree_level.root);
	        List<List<Integer>> rlot=tree_level.DiagonalTraversal(tree_level.root);
	        for(int ele:lot)
	        	System.out.print(ele+" ");
	        System.out.println();
	        for(List<Integer> ele:rlot) {
	        	System.out.print(ele);
	            System.out.println();
	        }
	        System.out.println();
	        int height=TreeNode.Height(tree_level.root);
	        System.out.println(height);
	      List<Integer> spirallot= tree_level.leftSideView(tree_level.root);
	      for(int ele:spirallot)
	    	  System.out.print(ele+" ");
	        System.out.println();
	        System.out.println(tree_level.diameter(tree_level.root));
	        tree_level.inorder(tree_level.root);
	        System.out.println();
	        tree_level.preorder(tree_level.root);
	}
	
	
}
