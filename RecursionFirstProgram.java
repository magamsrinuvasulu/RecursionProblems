public class RecursionFirstProgram {
	public static int fact5(int num) {
		return num*fact4(num-1);
	}
	public static int fact4(int num) {
		return num*fact3(num-1);
	}
	public static int fact3(int num) {
		return num*fact2(num-1);
	}
	public static int fact2(int num) {
		return num*fact1(num-1);
	}
	public static int fact1(int num) {
		return num;
	}
	public static void main(String[] args) {
		System.out.println(fact1(1));
		System.out.println(fact2(2));
		System.out.println(fact3(3));
		System.out.println(fact4(4));
		System.out.println(fact5(5));
	}

}
