package plants;

import java.util.Scanner;

public class Buyer {
	private String name = "unknown";
	private int age = 0;
	Scanner userIn = new Scanner(System.in);

	public Buyer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getBuyer() {
		System.out.println("nome acquirente: " + name + "\n" + "eta acquirente: " + age);
	}

	public void getData() {
		System.out.println("\n" + "inserire nome acquirente: ");
		this.name = userIn.next();
		System.out.println("\n" + "inserire eta acquirente: ");
		this.age = userIn.nextInt();
	}

}
