package exampleprogs;

import statemachine.ast.Opt;
import statemachine.impl.ActionExpressionImpl;
import statemachine.impl.ActionImpl;
import statemachine.impl.GuardExpressionImpl;
import statemachine.impl.StateImpl;
import statemachine.impl.StateMachineImpl;
import statemachine.impl.TransitionImpl;

public class MainProgram {

	public static void main(String[] args) {
		// Construct the AST
		StateMachineImpl m = new StateMachineImpl();
		m.adddeclarations(new StateImpl("S1", new Opt<ActionImpl>(null)));
		m.adddeclarations(new StateImpl("S2", new Opt<ActionImpl>(null)));
		m.adddeclarations(new StateImpl("S3", new Opt<ActionImpl>(null)));
		m.adddeclarations(new TransitionImpl("a", "S1", "S2", "", ""));
		m.adddeclarations(new TransitionImpl("b", "S2", "S1", "", ""));
		m.adddeclarations(new TransitionImpl("a", "S2", "S3", "", ""));

		// Print reachable information for all states
		m.printReachable();

	}

}
