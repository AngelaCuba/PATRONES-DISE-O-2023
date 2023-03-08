package primerParcialFilaB.ejercicio4Builder;

public abstract class ContratoBuilder {

    protected Contrato contrato;

	public void generateBase() {
		contrato = new Contrato();
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public abstract void setCosto();

	public abstract void setEmpresa();

	public abstract void setCanales();
}
