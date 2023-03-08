package primerParcialFilaB.ejercicio4Builder;

import java.util.List;

public class NetflixBuilder extends ContratoBuilder{
    @Override
	public void setCosto() {
		contrato.setCosto(150);
	}

	@Override
	public void setEmpresa() {
		contrato.setEmpresa("Netflix");
	}

	@Override
	public void setCanales() {
		List<String> canales = List.of("Crazy Ex Girlfriend");
		contrato.setCanales(canales);
	}
}