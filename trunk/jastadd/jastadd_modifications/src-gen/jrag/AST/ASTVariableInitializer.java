/* Generated By:JJTree: Do not edit this line. ASTVariableInitializer.java */

package jrag.AST;

public class ASTVariableInitializer extends SimpleNode {
  public ASTVariableInitializer(int id) {
    super(id);
  }

  public ASTVariableInitializer(JragParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JragParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
