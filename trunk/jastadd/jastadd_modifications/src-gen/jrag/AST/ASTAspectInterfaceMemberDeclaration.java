/* Generated By:JJTree: Do not edit this line. ASTAspectInterfaceMemberDeclaration.java */

package jrag.AST;

public class ASTAspectInterfaceMemberDeclaration extends SimpleNode {
  public ASTAspectInterfaceMemberDeclaration(int id) {
    super(id);
  }

  public ASTAspectInterfaceMemberDeclaration(JragParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JragParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
