package TV;

/*
 	prova
  	Realizza la classe Televisore che ha come attributi isSpento, volume, canale, luminosità ed i
	seguenti metodi:
	● accendi() : per accendere e spegnere il televisore
	● regolaVolume(): per abbassare o aumentare il volume in una scala da 0 a 10, il volume
	viene abbassato un’unità alla volta
	● cambiaCanale(): per cambiare il canale impostato
	Tipo di dato di ritorno e parametri dei metodi sono decisi da te.
	Si realizzi un programma che genera un oggetto televisore e chiede da tastiera se si vuole
	accendere il televisore. Se sì, chiede anche in quale canale settarlo ed il volume, se no il
	programma risponderà “il televisore rimane spento”.
	Il volume viene impostato casualmente quando il televisore viene generato per cui è necessario
	regolarlo all’atto dell’accensione. Prima di terminare il programma il televisore dovrà essere
	sempre spento.
	Il metodo main deve essere realizzato in una seconda classe Esercizio24Main
	
	
	All’interno dello stesso package si crei la classe Persona i cui attributi saranno nome, cognome,
	data di nascita. Dopodiché si aggiunga l’attributo proprietario di classe Persona alla classe
	Televisore e si aggiungano al programma le righe di codice per settare anche il proprietario
	dell’oggetto televisore generato. I dati del proprietario vengono chiesti da tastiera.
	
	A questo punto il programma chiederà se si vuole acquistare un nuovo televisore. Chiederà
	prima di tutto la data di nascita dell’acquirente perchè il televisore potrà essere venduto solo se
	l’acquirente è maggiorenne (si realizzi e utilizzi un metodo nella classe Persona per calcolare
	l’età a partire dalla data di nascita). L’atto di vendita consiste nel generare un oggetto televisore
	e assegnargli anche un proprietario.
 */
public class Tv {
	private boolean isON;
	private int volume;
	private String[] chanels = { " ", "Rai 1", "Rai 2", "Rai 3 FVG", "Rete4", "Canale5", "Italia 1", "LA7", "TV8",
			"NOVE", "Mediaset HD" };
	private int chanelNum;
	private int bightnes;
	private String settedChanel;
	private Persona owner;

	public Tv(int chanelNum) {
		this.isON = false;
		this.chanelNum = chanelNum;
		this.volume = (int) (Math.random() * 10);
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setChanel(int chanelNum) {
		this.chanelNum = chanelNum;
		this.settedChanel = chanels[chanelNum];
	}

	public boolean state() {
		return isON;
	}

	public int getVolume() {
		return volume;
	}

	public String[] getChanels() {
		return chanels;
	}

	public int getChanelNum() {
		return chanelNum;
	}

	public int getBightnes() {
		return bightnes;
	}

	public void turnON() {
		this.isON = true;
		System.out.println("Benvenuto");
	}

	public void turnOFF() {
		this.isON = false;
		System.out.println("Arrivederci");

	}

	public void volumeDown() {
		if (this.volume > 0) {
			this.volume--;
			for (int i = 0; i < this.volume; i++) {
				System.out.print("█");
			}
			System.out.print("♫" + this.volume + "\n");
		} else {
			System.out.println("min ♫");
		}
	}

	public void volumeUp() {
		if (this.volume < 10) {
			this.volume++;
			for (int i = 0; i < this.volume; i++) {
				System.out.print("█");
			}
			System.out.print("♫" + this.volume + "\n");
		} else {
			System.out.println("MAX ♫");
		}
	}

	public void brightnesDown() {
		if (this.bightnes > 0) {
			this.bightnes--;
			for (int i = 0; i < this.bightnes; i++) {
				System.out.print("█");
			}
			System.out.print("☼" + this.bightnes + "\n");
		} else {
			System.out.println("min ☼");
		}
	}

	public void brightnesUp() {
		if (this.bightnes < 10) {
			this.bightnes++;
			for (int i = 0; i < this.bightnes; i++) {
				System.out.print("█");
			}
			System.out.print("☼" + this.bightnes + "\n");
		} else {
			System.out.println("MAX ☼");
		}
	}

	public String getSettedChanel() {
		return settedChanel;
	}

	public Persona getOwner() {
		return owner;
	}

	public void setOwner(Persona owner) {
		this.owner = owner;
	}

	public void OnOff() {
		if (state() == true)
			turnOFF();
		else
			turnON();
	}

	public void remoteController(int action) {
		switch (action) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			setChanel(action);
			System.out.println(getSettedChanel());
			break;

		case 11:
			OnOff();
			break;

		case 12:
			volumeUp();
			break;

		case 13:
			volumeDown();
			break;

		case 14:
			brightnesUp();
			break;

		case 15:
			brightnesDown();
			break;

		default:
			break;
		}

	}

}
