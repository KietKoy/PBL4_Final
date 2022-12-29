package PBL4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vertex implements Serializable,Comparable<Vertex> {
    private static final long serialVersionUID = 1L;
	private String name;
    private List<Edge> edges;
    private boolean visited;
    private Vertex previosVertex;
    private double minDistance = Double.MAX_VALUE;
    private Point point;

    public Vertex(String name, Point point) {
        this.name = name;
        this.edges = new ArrayList<>();
        this.point = point;
    }

    public void addNeighbour(Edge edge) {
        this.edges.add(edge);
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPreviosVertex() {
        return previosVertex;
    }

    public void setPreviosVertex(Vertex previosVertex) {
        this.previosVertex = previosVertex;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.minDistance, otherVertex.minDistance);
    }
    public Point getPoint()
    {
    	return this.point;
    }
    public void setPoint(Point point)
    {
    	this.point = point;
    }
}
