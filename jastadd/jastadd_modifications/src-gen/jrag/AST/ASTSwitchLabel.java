/* Generated By:JJTree: Do not edit this line. ASTSwitchLabel.java */

package jrag.AST;

public class ASTSwitchLabel extends SimpleNode {
  public ASTSwitchLabel(int id) {
    super(id);
  }

  public ASTSwitchLabel(JragParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JragParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
