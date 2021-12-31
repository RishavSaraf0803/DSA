package Graph;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph implements Graph {

	int noOfVertices;
	List<List<Integer>> graph;
	DirectedGraph(int vertices){
		noOfVertices = vertices;
		graph = new ArrayList<>(vertices);
		for(int i = 0; i < vertices; i++) {
			graph.add(new ArrayList<>());
		}
		}
	public void addEdge(int src, int des) {
		graph.get(src).add(des);
	}
	public void printGraph() {
		for(int i = 0; i < noOfVertices;i++) {
			//System.out.print(graph.get(i));
			for(int ele : graph.get(i)) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}
	
	
	}

