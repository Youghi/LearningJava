package esercizio26pensioneAnimali;

public class Owner {

	private String name;
	private boolean sex;
	private String dateOfBirth;
	private String profession;

	public Owner(String name, String sex, String dateOfBirth, String profession) {
		this.name = name;
		if (sex.endsWith("M"))
			this.sex = true;
		else
			this.sex = false;
		this.dateOfBirth = dateOfBirth;
		this.profession = profession;
	}

	public void getOwner() {
		System.out.println("\nnome: " + this.name);
		System.out.println("sesso: " + getSexChecked());
		System.out.println("data di nascita: " + this.dateOfBirth);
		System.out.println("professione: " + this.profession);
	}

	public String getSexChecked() {
		if (sex == false)
			return "donna";
		else
			return "uomo";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

}
