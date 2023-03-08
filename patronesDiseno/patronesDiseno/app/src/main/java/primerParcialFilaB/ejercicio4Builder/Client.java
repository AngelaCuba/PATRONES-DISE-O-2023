package primerParcialFilaB.ejercicio4Builder;

public class Client {
    public static void main(String[] args) {

		Suscriptor sus = new Suscriptor();


		sus.setBuilderContrato(new NetflixBuilder());
		sus.generate();
		Contrato a = sus.getContrato();
		a.showInfo();

		sus.setBuilderContrato(new HBOBuilder());
		sus.generate();
		Contrato h = sus.getContrato();
		h.showInfo();

		sus.setBuilderContrato(new AmazonBuilder());
		sus.generate();
		Contrato n = sus.getContrato();
		n.showInfo();
	}
}
