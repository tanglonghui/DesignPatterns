package BehavioralPatterns.Iterator;

interface Iterator{
	void first();
	void next();
	boolean hasNext();
	Object currentItem();
}
