package test;

public class reverse {

	public static void main(String[] args) {
		System.out.println(reverses(123));
		System.out.println(reverses(123));
	}

	public static int reverses(int x) {
		String p = String.valueOf(x);
		String q = "";
		if (x > 0) {
			for (int i = p.length(); i > 0; i--) {
				q += p.charAt(i - 1);
			}
		} else {
			p = p.substring(1);
			q = "-";
			for (int i = p.length(); i > 0; i--) {
				q += p.charAt(i - 1);
			}
		}
		return Integer.parseInt(q);
	}
}
