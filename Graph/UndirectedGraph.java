package Graph;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph implements Graph{
	
	int noOfVertices;
	List<List<Integer>> graph;
	UndirectedGraph(int vertices){
		noOfVertices = vertices;
		graph = new ArrayList<>(vertices);
		for(int i = 0; i < noOfVertices; i++) {
			graph.add(new ArrayList<>());
		}
		}
	public void addEdge(int src, int des) {
		graph.get(src).add(des);
		graph.get(des).add(src);
	}
	public void printGraph() {
		for(int i = 0; i < noOfVertices; i++) {
			for(int ele : graph.get(i))
				System.out.print(ele+"  ");
			System.out.println();
		}
	}

}
