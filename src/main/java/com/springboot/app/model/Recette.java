package com.springboot.app.model;

public class Recette {
	private int id_recette;//Gerer ID
	private String nom;
	private Ingredient[] ingredient;
	private String instructions;
	private int tempsPreparation;
	private int tempsCuisson;
	private String image;
	
	public Recette(String nom,Ingredient[] ingredient, String instructions, int tempsPreparation, int tempsCuisson) {
		this.nom = nom;
		this.ingredient = ingredient;
		this.instructions = instructions;
		this.tempsPreparation = tempsPreparation;
		this.tempsCuisson = tempsCuisson;
	}

	public int getId_recette() {
		return id_recette;
	}
	public void setId_recette(int id_recette) {
		this.id_recette = id_recette;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Ingredient[] getIngredient() {
		return ingredient;
	}
	public void setId_ingredient(Ingredient[] ingredient) {
		this.ingredient = ingredient;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public int getTempsPreparation() {
		return tempsPreparation;
	}
	public void setTempsPreparation(int tempsPreparation) {
		this.tempsPreparation = tempsPreparation;
	}
	public int getTempsCuisson() {
		return tempsCuisson;
	}
	public void setTempsCuisson(int tempsCuisson) {
		this.tempsCuisson = tempsCuisson;
	}
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		String ingr="";
		System.out.println(this.ingredient.length);
		for (Ingredient i : ingredient) {
			ingr+=i.toString();
		}
		return "Recette [nom=" + nom +", instructions=" + instructions + " "+ingr+", tempsPreparation=" + tempsPreparation
				+ ", tempsCuisson=" + tempsCuisson + "]";
	}
}

