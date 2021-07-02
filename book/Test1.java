public class Test1 {
  public static void main(String[] args) throws Exception {
    WeightedGraph<Character> graph = new WeightedGraph<>();
    graph.addVertex('U');
    graph.addVertex('V');
    int indexForU = graph.getIndex('U');
    int indexForV = graph.getIndex('V');
    System.out.println("indexForU is " + indexForU); 
    System.out.println("indexForV is " + indexForV); 
    graph.addEdge(indexForU, indexForV, 2.5);
    System.out.println("Degree of U is " + 
      graph.getDegree(indexForU));
    System.out.println("Degree of V is " + 
      graph.getDegree(indexForV));
    System.out.println("Weight of UV is " + 
      graph.getWeight(indexForU, indexForV));
  }
}
