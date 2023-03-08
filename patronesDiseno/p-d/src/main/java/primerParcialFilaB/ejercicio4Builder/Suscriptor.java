package primerParcialFilaB.ejercicio4Builder;

public class Suscriptor {
    private ContratoBuilder builder;

	public Contrato getContrato() {
		return builder.getContrato();
	}

	public void setBuilderContrato(ContratoBuilder builder) {
		this.builder = builder;
	}

	public void generate() {
		builder.generateBase();
		builder.setCosto();
		builder.setEmpresa();
		builder.setCanales();
	}
}
