package com.company.day13;

class TakeObject implements Comparable<takeObject> {
	Double value = null;
	String st;

	public TakeObject(String s) {
		this.st =  s;
		this.value = (double) s.length();
	}

	public TakeObject(Double s) {
		this.value = s;
	}

	@Override
	public int compareTo(TakeObject o) {
			if (this.value > o.value) {
				return 1;
			} else if (this.value < o.value) {
				return -1;
			} else
				return 0;
	}

	public static void testMax(TakeObject ...e) {
		TakeObject temp;
		for(int i=0;i<e.length;i++) {
			for (int j = i ; j<e.length; j++) {
				if(e[i].compareTo(e[j]) == -1 ) {
					temp = e[i];
					e[i]=e[j];
					e[j]=temp;
				}
			}
		}
		
		if(e[0].st==null) {
			System.out.println("Greatest is" + e[0].value);
		}
		else
			System.out.println("Greatest is" + e[0].st);
	}
}
