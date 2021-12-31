package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    int levelOrderTraversal(TreeNode root, int height){
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
             if(level == height)return queue.poll().val;
            for(int i = 0; i < size; i++){
               
                TreeNode node = queue.poll();
                if(node.left!= null)queue.add(node.left);
                if(node.right != null)queue.add(node.right);
            }
        }
        return -1;
    }
}
