package main.java.com.zss;

import java.util.concurrent.atomic.AtomicReference;

public class CLHLock {
	
	private static class CLHNode{
		volatile boolean isLocked = true;
	}
	private final ThreadLocal<CLHNode> currentNode;
	
	private final ThreadLocal<CLHNode> predecessorNode;
	
	private final AtomicReference<CLHNode> tail;
	
	public CLHLock() {
		this.currentNode = ThreadLocal.withInitial(CLHNode::new);
		this.predecessorNode = new ThreadLocal<>();
		this.tail = new AtomicReference<>(new CLHNode());
	}
	
	public void lock() {
		CLHNode node = currentNode.get();
		CLHNode pred = tail.getAndSet(node);
		predecessorNode.set(pred);
		while (pred.isLocked) {
		}
	}
	
	public void unlock() {
		CLHNode node = currentNode.get();
		node.isLocked = false;
		currentNode.set(predecessorNode.get());
	}
}
