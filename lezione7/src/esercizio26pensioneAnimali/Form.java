package esercizio26pensioneAnimali;

public class Form {
	private int code;
	private Animal animal;
	private Owner owner;
	private Schedule schedule;
	
	public Form(int code, Animal animal, Owner owner, Schedule schedule) {
		this.code = code;
		this.animal = animal;
		this.owner = owner;
		this.schedule = schedule;
	}
	
	public void getForm() {
		System.out.println("dati registrazione:" + "\n");
		this.schedule.getSchedule();
		System.out.println("\n" + "dati proprietario: " + "\n");
		this.owner.getOwner();
		System.out.println("\n" + "dati animale:" + "\n");
		this.animal.getAnimal();
	}

	public int getCode() {
		return code;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Owner getOwner() {
		return owner;
	}
	
	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}



	
}
