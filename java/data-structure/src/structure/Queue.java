package structure;

public interface Queue {
	void offer(int item);

	int poll();

	boolean isEmpty();

}
