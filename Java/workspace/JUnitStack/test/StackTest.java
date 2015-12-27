import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	@Test
	public void testPopEmptyStack() throws Exception {
		
		Assert.assertNull(new Stack().pop());
	}

	@Test
	public void testPeekEmptyStack() throws Exception {
		Assert.assertNull(new Stack().peek());
	}

	@Test
	public void testPushAndPeek() throws Exception {
		Object inObj = new Object();
		Stack stack = new Stack();
		stack.push(inObj);

		Assert.assertSame(inObj, stack.peek());
	}

	@Test
	public void testPushAndPopBack() throws Exception {
		Object inObj = new Object();
		Stack stack = new Stack();
		stack.push(inObj);

		Assert.assertSame(inObj, stack.pop());
	}

	@Test
	public void testPushAndPopSequence() throws Exception {
		String v1 = "a", v2 = "b";
		Stack stack = new Stack();
		stack.push(v1);
		stack.push(v2);

		Assert.assertEquals(v2, stack.pop());
		Assert.assertEquals(v1, stack.pop());
	}

}
