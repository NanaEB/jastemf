/* Generated By:JJTree: Do not edit this line. ASTAllocationExpression.java */

package jrag.AST;

public class ASTAllocationExpression extends SimpleNode {
  public ASTAllocationExpression(int id) {
    super(id);
  }

  public ASTAllocationExpression(JragParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JragParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
