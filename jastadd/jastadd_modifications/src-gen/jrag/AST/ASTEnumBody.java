/* Generated By:JJTree: Do not edit this line. ASTEnumBody.java */

package jrag.AST;

public class ASTEnumBody extends SimpleNode {
  public ASTEnumBody(int id) {
    super(id);
  }

  public ASTEnumBody(JragParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JragParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
