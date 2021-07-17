package bfs;
import java.util.*;
import node.*;

public class BFSByLinkedList {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	
	//Constructor
	public BFSByLinkedList(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}//end of method
	
	
	//BFS Algorithm
	void bfs() {
		//if a node is unvisited then run bfs on it
		/*
		 * for(GraphNode node: nodeList) { if(!node.isVisited()) bfsVisit(node); }
		 */
		bfsVisit(nodeList.get(0));
	}//end of method
	
	/*
	 * Printing BFS from source: V1 V1 V2 V4 V3 V5 V7 V6 V10 V8 V9
	 */
	
	//BFS internal method
	void bfsVisit(GraphNode node) {
		Queue<GraphNode>queue = new LinkedList<>();
		queue.add(node); //add source node to queue
		while(!queue.isEmpty()) {
			GraphNode presentNode = queue.remove();
			presentNode.setVisited(true);
			System.out.print(presentNode.getName()+" ");
			if(presentNode.getNeighbors().size()==1) {
				System.out.println("its critical node "+presentNode.getName());;
			}
			for(GraphNode neighbor: presentNode.getNeighbors()) { //for each neighbor of present node
				if(!neighbor.isVisited()) { //if neighbor is not visited then add it to queue
					queue.add(neighbor);
					neighbor.setVisited(true);
				}
			}//end of for loop
		}//end of while loop
	}//end of method
	
	
	
	
	// Add an undirected edge between two nodes
	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i-1);
		GraphNode second = nodeList.get(j-1);
		first.getNeighbors().add(second);//Neighbour of first is second. Store it.
		second.getNeighbors().add(first);//Neighbour of second is first. Store it.
	}//end of method
	
}//end of class
