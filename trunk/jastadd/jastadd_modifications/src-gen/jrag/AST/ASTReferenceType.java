/* Generated By:JJTree: Do not edit this line. ASTReferenceType.java */

package jrag.AST;

public class ASTReferenceType extends SimpleNode {
  public ASTReferenceType(int id) {
    super(id);
  }

  public ASTReferenceType(JragParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JragParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
