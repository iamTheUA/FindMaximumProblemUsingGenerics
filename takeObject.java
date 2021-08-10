package Day13;

class takeObject implements Comparable<takeObject> {
	Double value = null;
	String st;

	public takeObject(String s) {
		this.st =  s;
		this.value = (double) s.length();
	}

	public takeObject(Double s) {
		this.value = s;
	}

	@Override
	public int compareTo(takeObject o) {
			if (this.value > o.value) {
				return 1;
			} else if (this.value < o.value) {
				return -1;
			} else
				return 0;
	}

	public static void testMax(takeObject ...e) {
		takeObject temp;
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
//		if (e1.compareTo(e2) == 1 && e1.compareTo(e3) == 1) {
//			System.out.println("e1 is Greatest");
//		} else if (e2.compareTo(e1) == 1 && e2.compareTo(e3) == 1) {
//			System.out.println("e2 is Greatest");
//		} else {
//			System.out.println("e3 is Greatest");
//		}
	}
}
