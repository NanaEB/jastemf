package calculator.semantics;

/**
 * @author C. Bürger
 */
public class FloatValue extends Value {
	public float value;
	public FloatValue(float v) {value = v;}
	public FloatValue asFloatValue() {return this;}
	public String toString() {return ""+ value;}
}
