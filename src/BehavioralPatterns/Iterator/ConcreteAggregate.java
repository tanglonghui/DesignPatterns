package BehavioralPatterns.Iterator;

class ConcreteAggregate implements Aggregate{

	private Object[] obj= {"dog","pig","cat","monkey","pig"};
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteItertor();
	}
	private class ConcreteItertor implements Iterator{
		private int currentIndex=0;

		@Override
		public void first() {
			// TODO Auto-generated method stub
			currentIndex=0;
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(currentIndex<obj.length) {
				currentIndex++;
			}
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return !(currentIndex==obj.length);
		}

		@Override
		public Object currentItem() {
			// TODO Auto-generated method stub
			return obj[currentIndex];
		}

	}
}
