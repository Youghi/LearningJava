package plants;

import java.util.ArrayList;

public class Managment {
	private ArrayList<Plant> plants = new ArrayList<Plant>();
	private ArrayList<Sales> sales = new ArrayList<Sales>();
	
	
	
	public ArrayList<Plant> getPlants() {
		return plants;
	}

	public void setPlants(ArrayList<Plant> plants) {
		this.plants = plants;
	}

	public ArrayList<Sales> getSales() {
		return sales;
	}

	public void setSales(ArrayList<Sales> sales) {
		this.sales = sales;
	}

	public void addPlant() {
		Plant plant = new Plant();
		plant.getData();
		plants.add(plant);
	}
	
	public void viewExhibition () {
		System.out.println("La mostra e` cpmposta da seguenti esemplari");
		for (Plant plant : plants) {
			plant.getPlant();
		}
	}
	
	
	

	
	
	
	
}
