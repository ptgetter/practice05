package prob5;

public class MyStack  {
	private int size;
	private String[] buffer;

	public MyStack(int count) {
		this.buffer = new String[count];
		this.size = 0;
	}

	public void push(String val)  {
		if(isFull()) {
			String[] newBuffer = new String[buffer.length * 2];
			System.arraycopy(buffer, 0, newBuffer, 0, buffer.length);
			buffer = newBuffer;
		}
		this.buffer[size] = val;
		this.size++;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public boolean isFull() {
		return this.size >= this.buffer.length;
	}

	public String pop() throws MyStackException {
		if(isEmpty()) {
			throw new MyStackException("Stack is Empty");
		}
		size--;
		String val = this.buffer[size];		
		return val;
	}

}
