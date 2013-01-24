package redis.key.demo;

import java.util.LinkedList;

import org.junit.Test;

public class Stack<T> {

	private LinkedList<T> list;
	private int index;

	public Stack() {
		this.list = new LinkedList<T>();
		this.index = 0;
	}

	public T pop() {
		index -= 1;
		T t = list.get(index);
		list.remove(index);
		return t;
	}

	public String toString() {
		StringBuffer str = new StringBuffer();
		for (T t : this.list) {
			str.append(t.toString());
		}
		return str.toString();
	}
	
	public void push(T t) {
		list.add(t);
		index = list.size();
	}

	public void flush() {
		this.list.removeAll(this.list);
		this.index = 0;
	}
	
	public boolean isEmpty() {
		return this.list.isEmpty();
	}
	
	@Test
	public void test() {
		Stack<String> s = new Stack<String>();
		for (int i = 0; i < 10; i++) {
			s.push("" + i);
		}
		while(!s.isEmpty())
			System.out.println(s.pop());
		
	}

}
