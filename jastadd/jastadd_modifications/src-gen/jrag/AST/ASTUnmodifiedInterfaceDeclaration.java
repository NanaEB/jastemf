/* Generated By:JJTree: Do not edit this line. ASTUnmodifiedInterfaceDeclaration.java */

package jrag.AST;

public class ASTUnmodifiedInterfaceDeclaration extends SimpleNode {
  public ASTUnmodifiedInterfaceDeclaration(int id) {
    super(id);
  }

  public ASTUnmodifiedInterfaceDeclaration(JragParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JragParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
