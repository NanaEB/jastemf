/* Generated By:JJTree: Do not edit this line. ASTCacheDeclarations.java */

package jrag.AST;

public class ASTCacheDeclarations extends SimpleNode {
  public ASTCacheDeclarations(int id) {
    super(id);
  }

  public ASTCacheDeclarations(JragParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JragParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
