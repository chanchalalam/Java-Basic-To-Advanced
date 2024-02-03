import java.util.*;
public class Graph {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        } }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(6, 5, 1));
    }

    // BFS
    public static void bfs(ArrayList<Edge> graph[], int V) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0); //Source = 0
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!visited[curr]) {
                System.out.print(curr+" ");
                visited[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                } }
        }
        System.out.println();
    }


    //DFS
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        if(visited[curr]) {
            return; }
        System.out.print(curr+" ");
        visited[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            dfs(graph, e.dest, visited);
        }
    }


    //Print All Paths
    public static void printAllPaths(ArrayList<Edge> graph[], int src, int tar, String
            path, boolean vis[]) {
        if(src == tar) {
            System.out.println(path);
            return;
        }
        for(int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!vis[e.dest]) {
                vis[e.dest] = true;
                printAllPaths(graph, e.dest, tar, path+"->"+e.dest, vis);
                vis[e.dest] = false;
            }
        }
    }

    //Cycle Detection (Directed Graph)
    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, int curr, boolean
            vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(stack[e.dest]) { //cycle exists
                return true;
            } else if(!vis[e.dest] && isCyclicUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static boolean isCyclic(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(vis[i] == false) {
                boolean cycle = isCyclicUtil(graph, i, vis, new boolean[vis.length]);
                if(cycle) {
                    return true;
                }
            }
        }
        return false;
    }


    //Cycle Detection (UnDirected Graph)
    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, boolean vis[], int
            curr, int par) {
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            //case1
            if(vis[e.dest] && e.dest != par) {

                boolean isCycle = isCyclicUtil(graph, vis, e.dest, curr);
                if(isCycle)
                    return true;
            } else if(e.dest == par) {
//case 2
                continue;
            } else {
//case 3
                return true;
            }
        }
        return false;
    }
    //O(V+E)
    public static boolean isCyclic(ArrayList<Edge>[] graph, boolean vis[]) {
        for(int i=0; i<graph.length; i++) {
            if(isCyclicUtil(graph, vis, i, -1)) {
                return true;
            } }
        return false;
    }

    //Topological Sorting

    public static void topoSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[],
                                    Stack<Integer> s) {
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topoSortUtil(graph, e.dest, vis, s);

            } }
        s.push(curr);
    }
    //O(V+E)
    public static void topoSort(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                topoSortUtil(graph, i, vis, s);
            }
        }
        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        } }



    public static void main(String args[]) {
        /*
            1 --- 3
            / |\
            0 | 5 -- 6


            \ |/ 2 ---- 4
          */
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        //print  neighbour
        for (int i =0;i<graph[1].size();i++){
            Edge e = graph[0].get(i);
            System.out.println("Neighbors of 0 "+e.dest );
            System.out.println("Weights of 0 "+e.wt);
       }
        for (int i =0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println("Neighbors of 1 "+e.dest);
            System.out.println("Weights of 1 "+e.wt);
        }
        for (int i =0;i<graph[1].size();i++){
            Edge e = graph[2].get(i);
            System.out.println("Neighbors of 2 "+e.dest);
            System.out.println("Weights of 2 "+e.wt);
        }
        for (int i =0;i<graph[1].size();i++){
            Edge e = graph[3].get(i);
            System.out.println("Neighbors of 3 "+e.dest);
            System.out.println("Weights of 3 "+e.wt);
        }
        for (int i =0;i<graph[1].size();i++){
            Edge e = graph[4].get(i);
            System.out.println("Neighbors of 4 "+e.dest);
            System.out.println("Weights of 4 "+e.wt);
        }
        for (int i =0;i<graph[1].size();i++){
            Edge e = graph[5].get(i);
            System.out.println("Neighbors of 5 "+e.dest);
            System.out.println("Weights of 5 "+e.wt);
        }

        // BFS
        System.out.println("Print BFS");
        bfs(graph, V);

        //DFS
        System.out.println("Print DFS");
        dfs(graph, 0, new boolean[V]);

        // All Paths
        int src = 0;
        int tar = 5;
        boolean vis[] = new boolean[V];
        vis[src] = true;
        System.out.println();
        System.out.println("Print Path");
        printAllPaths(graph, src, tar, ""+src, vis);

        //Cycle Detection (Directed Graph)
        System.out.println("Cycle Detection (Directed Graph)");
        System.out.println(isCyclic(graph));

        //Cycle Detection (Undirected Graph)
        System.out.println("Cycle Detection (UnDirected Graph)");
        System.out.println(isCyclic(graph, new boolean[V]));

        //Topological Sorting
        System.out.println("Topological Sorting");
        topoSort(graph);
    }
}

