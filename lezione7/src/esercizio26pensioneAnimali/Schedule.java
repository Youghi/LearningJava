package esercizio26pensioneAnimali;

public class Schedule {
	private String arrival;
	private String departure;

	public Schedule(String arrival, String departure) {

		this.arrival = arrival;
		this.departure = departure;
	}

	public void getSchedule() {
		System.out.println("arrivo registrato: " + arrival + "\n" + "partenza programmata: " + departure);
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

}
