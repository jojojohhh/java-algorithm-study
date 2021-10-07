package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DividePowerGrid {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {
            ArrayList<Node> nodes = new ArrayList<>();
            for (int j = 0; j <= n; j++)
                nodes.add(new Node(j));
            for (int j = 0; j < wires.length; j++) {
                if (i != j) {
                    nodes.get(wires[j][0]).addNode(nodes.get(wires[j][1]));
                    nodes.get(wires[j][1]).addNode(nodes.get(wires[j][0]));
                }
            }
            Queue<Node> q = new LinkedList<>();
            q.offer(nodes.get(1));
            boolean[] visited = new boolean[n + 1];
            visited[1] = true;
            int cnt = 1;
            while (!q.isEmpty()) {
                 Node node = q.poll();
                 for (int j = 0; j < node.adjNode.size(); j++) {
                     Node nextNode = node.adjNode.get(j);
                     if (!visited[nextNode.n]) {
                         q.offer(nextNode);
                         visited[nextNode.n] = true;
                         cnt++;
                     }
                 }
            }
            answer = Math.min(answer, Math.abs(n - 2 * cnt));
        }

        return answer;
    }
}

class Node {
    int n;
    LinkedList<Node> adjNode;

    public Node(int n) {
        this.n = n;
        adjNode = new LinkedList<>();
    }

    public void addNode(Node node) {
        adjNode.add(node);
    }
}
