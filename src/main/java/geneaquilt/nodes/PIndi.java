package geneaquilt.nodes;

import geneaquilt.data.Indi;
import geneaquilt.data.Vertex;

/**
 * <b>PIndi</b> is a Piccolo object for an individual node.
 * 
 * @author Jean-Daniel Fekete
 * @version $Revision$
 */
public class PIndi extends PSemanticText implements PVertex {
	
    Indi indi;
    /**
     * Creates a PIndi
     * @param indi the indi
     */
    public PIndi(Indi indi) {
        super(indi.getLabel());
        this.indi = indi;
        setTextPaint(GraphicsConstants.INDI_COLOR);
        setFont(GraphicsConstants.INDI_FONT);
    }
    
    /**
     * @return the indi
     */
    public Indi getIndi() {
        return indi;
    }
    
    /**
     * {@inheritDoc}
     */
    public Vertex getVertex() {
        return indi;
    }
  /*  public void setPaint(Paint p) {
    	if (p != null)
    		super.setPaint(p);
    }*/
}
