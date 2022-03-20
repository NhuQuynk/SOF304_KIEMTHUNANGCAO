package SOF304.Lab3;

public class Person {
	private final String name;
	private final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		if (age < 18 || age >= 65) {
			throw new IllegalArgumentException("Tuổi không hợp lệ: " + age);
		}
	}

}
