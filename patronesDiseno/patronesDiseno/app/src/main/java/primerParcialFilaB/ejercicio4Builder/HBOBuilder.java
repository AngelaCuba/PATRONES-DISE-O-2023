package primerParcialFilaB.ejercicio4Builder;

import java.util.List;

public class HBOBuilder extends ContratoBuilder{
    @Override
	public void setCosto() {
		contrato.setCosto(100);
	}

	@Override
	public void setEmpresa() {
		contrato.setEmpresa("HBO");
	}

	@Override
	public void setCanales() {
		List<String> canales = List.of("Scooby Doo", "Looney Tunes");
		contrato.setCanales(canales);
	}
}
