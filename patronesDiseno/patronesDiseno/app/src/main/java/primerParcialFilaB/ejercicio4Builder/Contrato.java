package primerParcialFilaB.ejercicio4Builder;

import java.util.List;

public class Contrato {
    private double costo;
	private String empresa;
	private List<String> canales;

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public List<String> getCanales() {
		return canales;
	}

	public void setCanales(List<String> canales) {
		this.canales = canales;
	}

	public void showInfo() {
		System.out.println("------------CONTRATO---------------");
		System.out.println("COSTO: " + costo);
		System.out.println("EMPRESA: " + empresa);
		System.out.println("-----------PELICULAS---------------");
		for (String pelicula : canales) {
			System.out.println("Titulo: " + pelicula);
		}
	}
}
