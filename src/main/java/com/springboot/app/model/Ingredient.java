package com.springboot.app.model;

public class Ingredient {
	private int Id_ingredient;
	private String nom;
	private String type;
	public Ingredient() {
		super();
	}
	public int getId_ingredient() {
		return Id_ingredient;
	}
	public void setId_ingredient(int id_ingredient) {
		Id_ingredient = id_ingredient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Ingredient [nom=" + nom + ", type=" + type + "]";
	}
}

