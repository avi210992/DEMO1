package Package2;

public class Test15<T, U, R> {

	void m1(String st) {
		System.out.println(st);
	}

	@SuppressWarnings("unchecked")
	<T extends Number, U extends String , R extends Object> R m2(T t, U u) {

		return (R) u.concat(String.valueOf(t));

	}

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		System.out.println(new Test15().m2(10, "Avinash"));
		;

	}

}

interface Inter1<T, U, R> {

}