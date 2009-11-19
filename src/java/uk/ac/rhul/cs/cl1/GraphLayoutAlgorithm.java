package uk.ac.rhul.cs.cl1;

/**
 * Abstract superclass for different kinds of graph layout algorithms.
 * 
 * @author ntamas
 */
public abstract class GraphLayoutAlgorithm extends GraphAlgorithm {
	public GraphLayoutAlgorithm() {
		super();
	}
	
	public GraphLayoutAlgorithm(Graph graph) {
		super(graph);
	}
}