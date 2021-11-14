package graphs;

import java.util.LinkedList;

public class DFS {

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
            {
                list = new LinkedList<>();
            }
            list.add(connection);
            adjList[vertex] = list;
        }
        public void printGraphUsingDFS() {

            boolean[] isVisited = new boolean[value];
            for(int i=0; i<adjList.length; i++) //for each node in the graph
            {
                if(!isVisited[i])
                {
                    dfs(i, isVisited);
                }
            }
        }

        void dfs(Integer v, boolean[] isVisted)
        {
            isVisted[v] = true;
            System.out.println(v);
            LinkedList<Integer> list = adjList[v];
            for (Integer c:list) {
                if(c!=null && !isVisted[c])
                    dfs(c, isVisted);
            }
        }
    }
    public static void main(String[] args)
    {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,4);

        graph.addEdge(1,2);
        graph.addEdge(1,3);

        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(2,0);

        graph.addEdge(3,null);
        graph.addEdge(4,null);

        //graph.addEdge(5,2);

        graph.printGraphUsingDFS();
    }
}
