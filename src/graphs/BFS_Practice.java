package graphs;

import java.util.LinkedList;

public class BFS_Practice {

    static class Graph
    {
        int value;
        LinkedList<Integer>[] adjList;

        Graph(int vertex)
        {
            this.value = vertex;
            adjList = new LinkedList[vertex];
        }

        void addEdge(int vertex, Integer connection)
        {
            LinkedList<Integer> list = adjList[vertex];
            if(list == null)
                list = new LinkedList<Integer>();
            list.add(connection);
            adjList[vertex] = list;
        }
    }

    public static void main(String[] args)
    {
        Graph graph = new Graph(6);

        graph.addEdge(1, 3);

    }
}
