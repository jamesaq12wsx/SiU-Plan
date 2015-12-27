import java.util.Vector;

public class Stack {

	Vector<Object> storage = new Vector<Object>();

	public void push(Object o) {
		storage.add(o);
	}

	public Object pop() {
		if(storage.isEmpty())
			return null;
		else
			return storage.remove(storage.size() - 1);
	}

	public Object peek() {
		if(storage.isEmpty())
			return null;
		else
			return storage.get(storage.size() - 1);
	}

}
