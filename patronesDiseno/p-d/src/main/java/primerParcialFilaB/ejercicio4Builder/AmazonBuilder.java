package primerParcialFilaB.ejercicio4Builder;

import java.util.List;

public class AmazonBuilder extends ContratoBuilder{
    @Override
	public void setCosto() {
		contrato.setCosto(50);
	}

	@Override
	public void setEmpresa() {
		contrato.setEmpresa("Amazon");
	}

	@Override
	public void setCanales() {
		List<String> canales = List.of("Fleabag", "The Addams Family");
		contrato.setCanales(canales);
	}
}
