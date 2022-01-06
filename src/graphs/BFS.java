package graphs;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class BFS {

    static class Graph{
        int value;
        LinkedList<Integer>[] adjList;

        Graph(int vertex)
        {
            this.value   = vertex;
            adjList = new LinkedList[vertex];
        }
        public void addEdge(int vertex, Integer connection)
        {
            LinkedList<Integer> list = adjList[vertex];
            if(list == null)
                list = new LinkedList<Integer>();
            adjList[vertex] = list;
            list.add(connection);
        }
        void printGraphUsingBFS(){
            boolean[] isVisited = new boolean[value];
            Deque<Integer> queue = new ArrayDeque<>();

            queue.offer(1);

            while(!queue.isEmpty())
            {
                Integer v = queue.poll();
                System.out.print(v + " ");

                LinkedList<Integer> list  = adjList[v];//get neighbors of v all vertices connected to v
                if(list != null)
                {
                    for(Integer c: list)
                    {
                        if(c != null)
                            if(!isVisited[c]) {
                                queue.offer(c);
                                isVisited[c] = true;
                            }
                    }
                }
            }
        }


    }

    public static void main(String[] args)
    {
        Graph graph = new Graph(6);

//        graph.addEdge(1, 2);
//        graph.addEdge(1, 5);
//
//        graph.addEdge(2, 3);
//        graph.addEdge(2, 5);
//
//        graph.addEdge(3, 4);

        graph.addEdge(1,2);
        graph.addEdge(1, 6);
        graph.addEdge(1, 7);
        graph.addEdge(2, 3);
        graph.addEdge(2, 5);
        graph.addEdge(6,5);
        graph.addEdge(5,4);

        /*graph.addEdge(0,1);
        graph.addEdge(0,4);

        graph.addEdge(1,2);
        graph.addEdge(1,3);

        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(2,0);

        graph.addEdge(3,null);
        graph.addEdge(4,null);*/

        //graph.addEdge(5,2);

        graph.printGraphUsingBFS();
        /*for (var node : graph.adjList){
            System.out.println(node);
        }
        System.out.println("Hello World!!");*/
    }
}
