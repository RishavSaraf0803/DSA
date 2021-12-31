package Graph;

import java.util.List;
import java.util.Scanner;

public class TopologicalSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please enter number of vertices u want in graph");
//		int vertices = sc.nextInt();
//		Graph graph = new DirectedGraph(vertices);
//		int[][] arr = new int[vertices][2];
//		for(int i = 0; i < vertices; i++) {
//			arr[i][0] = sc.nextInt();
//			arr[i][1] = sc.nextInt();
//			graph.addEdge(arr[i][0], arr[i][1]);
//		}
		Graph g = new DirectedGraph(6);
		Graph g1 = new UndirectedGraph(6);
        g1.addEdge(5, 2);
        g1.addEdge(5, 0);
        g1.addEdge(4, 0);
        g1.addEdge(4, 1);
        g1.addEdge(2, 3);
        g1.addEdge(3, 1);
		g1.printGraph();
		
		
		

	}
	
	public List<Integer> dfsTopologicalSort(Graph g){
		
		return null;
	}

}
