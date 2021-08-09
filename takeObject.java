package Day13;

class takeObject implements Comparable<takeObject> {

	String st = null;
	Double i = null;

	public takeObject(String s) {
		this.st = s;
	}

	public takeObject(Double s) {
		this.i = s;
	}

	@Override
	public int compareTo(takeObject o) {

		if (this.st == null) {
			if (this.i > o.i) {
				return 1;
			} else if (this.i < o.i) {
				return -1;
			} else
				return 0;
		} else {
			if (this.st.length() > o.st.length()) {
				return 1;
			} else if (this.st.length() < o.st.length()) {
				return -1;
			} else
				return 0;
		}

	}

	public static void testMax(takeObject e1, takeObject e2, takeObject e3) {
		if (e1.compareTo(e2) == 1 && e1.compareTo(e3) == 1) {
			System.out.println("e1 is Greatest");
		} else if (e2.compareTo(e1) == 1 && e2.compareTo(e3) == 1) {
			System.out.println("e2 is Greatest");
		} else {
			System.out.println("e3 is Greatest");
		}
	}
}