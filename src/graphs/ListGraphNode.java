package graphs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.ArrayDeque;

public class ListGraphNode {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            // Write your code here.
            if(children == null) return array;
            Integer ct = 0;
            boolean[] isVisited = new boolean[256];
            Deque<Node> queue = new ArrayDeque<>();

            Node node = new Node("A");
            node.children = children;
            queue.offer(node);
            array.add(name);

            while(!queue.isEmpty())
            {
                Node vertex = queue.poll();
                //array.add(vertex.name);

                List<Node> neighbors = vertex.children;

                if(neighbors != null)
                {
                    for(Node n:neighbors)
                    {
                        if(n != null)
                        {
                            if(!isVisited[ct])
                            {
                                queue.offer(n);
                                array.add(n.name);
                                isVisited[ct] = true;
                                ct++;
                            }
                        }
                    }
                }
            }
            return array;
        }
    }

    public static void main(String[] args) {
        Node graph = new Node("A");
        graph.addChild("B").addChild("C").addChild("D");
        graph.children.get(0).addChild("E").addChild("F");
        graph.children.get(2).addChild("G").addChild("H");
        graph.children.get(0).children.get(1).addChild("I").addChild("J");
        graph.children.get(2).children.get(0).addChild("K");
        List<String> array = new ArrayList<>();
        graph.breadthFirstSearch(array);

    }

}
