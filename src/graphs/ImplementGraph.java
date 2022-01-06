package graphs;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class ImplementGraph {
    static class Graph
    {
        int value;
        LinkedList<Integer>[] adjList;
        Graph(int vertex)
        {
            this.value = vertex;
            adjList = new LinkedList[vertex+1];
        }
        public void addEdge(int vertex, Integer edge)
        {
            LinkedList<Integer> list = adjList[vertex];
            if(list == null)
            {
                list = new LinkedList<Integer>();
            }
            adjList[vertex] = list;
            list.add(edge);
        }

        public void BFS(Integer startingVertex)
        {
            Deque<Integer> queue = new ArrayDeque<>();
            queue.offer(startingVertex);
            boolean[] isVisited = new boolean[value+1];

            while(!queue.isEmpty()) {

                Integer vertex = queue.poll();
                System.out.print(vertex + " ");
                LinkedList<Integer> list = adjList[vertex];

                if(list!=null)
                {
                    for(Integer c:list)
                    {
                        if(c != null) {
                            if (!isVisited[c]) {
                                queue.offer(c);
                                isVisited[c] = true;
                            }
                        }
                    }
                }
            }
        }

        public void DFS()
        {

        }
    }


    public static void main(String[] args)
    {
        Graph graph = new Graph(7);

        graph.addEdge(1,2);
        graph.addEdge(1, 6);
        graph.addEdge(1, 7);
        graph.addEdge(2, 3);
        graph.addEdge(2, 5);
        graph.addEdge(6,5);
        graph.addEdge(5,4);
        //graph.BFS(1);
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        hmap.put(0,10);
        hmap.put(0, 11);
        Integer val = hmap.get(1);
        if(hmap.containsValue(12))
        {
            System.out.println("True");
        }

        int[] in;
        in = new int[]{0, 1};
    }
}
