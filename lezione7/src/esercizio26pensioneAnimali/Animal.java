package esercizio26pensioneAnimali;

public class Animal {
	private String type;
	private String name;
	private double height;
	private double weight;
	private String favFood;

	public Animal(String type, String name, double height, double weight, String favFood) {
		this.type = type;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.favFood = favFood;
	}

	public void getAnimal() {
		System.out.println("tipo animale: " + type);
		System.out.println("nome animale :" + name);
		System.out.println("altezza " + name + ":  " + height);
		System.out.println("peso " + name + ":  " + weight);
		System.out.println("cibo preferito " + name + ":  " + favFood);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

}


