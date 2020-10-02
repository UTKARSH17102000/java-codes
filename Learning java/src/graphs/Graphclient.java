  package graphs;
 
import java.util.HashMap;

public class Graphclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Graph graph = new Graph();
		  graph.addVertex("A");
		  graph.addVertex("B");
		  graph.addVertex("C");
		  graph.addVertex("D");
		  graph.addVertex("E");
		  graph.addVertex("F");
		  graph.addVertex("G");
		  
		  graph.addEdge("A","B" , 2);
		  graph.addEdge("A","D" , 10);
		  graph.addEdge("B","C" , 3);
		  graph.addEdge("C","D" , 1);
		  graph.addEdge("D","E" , 8);
		  graph.addEdge("E","F" , 5);
		  graph.addEdge("E","G" , 6);
		  graph.addEdge("F","G" , 4);
		  
     graph.display();
     System.out.println(graph.numVertex());
     System.out.println(graph.numEdges());
     
     System.out.println(graph.containsEdge("A" ,"B"));
     System.out.println(graph.containsEdge("A" ,"F"));
     
 //  graph.removeEdge("B", "C");
    graph.display();
    
 //   graph.removeVertex("F"); 
    graph.display();
    
 //   graph.addVertex("F");
 //   graph.addEdge("F", "A", 10);
    graph.display();
 //   System.out.println(graph.hasPath("A", "F",new HashMap<>()));
    System.out.println(graph.bfs("A","F"));
    System.out.println(graph.dfs("A","F"));
	graph.dft();
	//  graph.removeEdge("F", "G");
	//     graph.removeEdge("D", "E");
	System.out.println(graph.iscyclic());
	System.out.println(graph.isConnected());
	System.out.println(graph.isTree());
	System.out.println(graph.getCC());
	
	graph.prims().display();
//	System.out.println(graph.dijkstra("A"));
	graph.kruskal();
	}

}
