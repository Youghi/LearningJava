package TV;

import java.time.LocalDate;

public class Persona {

	
	/*
		 	definire una classe Persona: attributi età, nome, sesso, professione. 
		 	Realizzare getter e setter per ogni attributo
			
			● un costruttore che permetta di istanziare oggetti di tipo Persona definendo i
			valori specifici per i vari attributi;
			● il metodo chiSei che restituisce una stringa del tipo “Sono
			una persona di nome: nome, sesso: sesso, età: età, professione: professione
			● il metodo main che preveda la creazione di un oggetto di tipo Persona e
			l’invocazione del metodo chiSei per visualizzarne il risultato restituito.
	 */
	
	private String name;
	private boolean sex;
	private String dateOfBirth;
	private String profession;
	
	public Persona(String name, String sex, String dateOfBirth, String profession) {
		this.name = name;
		if (sex.endsWith("M"))
			this.sex = true;
		else
			this.sex = false;
		this.dateOfBirth = dateOfBirth;
		this.profession = profession;
	}
	
	public void chiSei () {
		System.out.println("\nnome: " + this.name);
		System.out.println("sesso: " + getSexChecked());
		System.out.println("data di nascita: " + this.dateOfBirth);
		System.out.println("professione: " + this.profession);
	}

	public String getName() {
		return name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getProfession() {
		return profession;
	}
	
	public String getSexChecked() {
		if (sex==false)
			return "donna";
		else 
			return "uomo";
	}
	
	public boolean isAdult () {
		
		LocalDate locDate = LocalDate.now();
		int locYear = locDate.getYear();
		int locMonth = locDate.getMonthValue();
		int locDay = locDate.getDayOfMonth();
		String splittedDBirth[] = this.dateOfBirth.split("/");
		int personDay = Integer.parseInt(splittedDBirth[0]);
		int personMonth = Integer.parseInt(splittedDBirth[1]);
		int personYear = Integer.parseInt(splittedDBirth[2]);
		if (locYear-personYear>18) 
			return true;
		else if (locYear-personYear == 18 && locMonth > personMonth) 
			return true;
		else if (locYear-personYear == 18 && locMonth == personMonth && locDay >= personDay) 
			return true;
		else if (locYear-personYear == 18 && locMonth == personMonth && locDay < personDay) 
			return false;
		else if (locYear-personYear == 18 && locMonth < personMonth)
			return false;
		else
			return false;
		 
	}
	
	

	
		
}
