package subsystem2.zip;

public class ZipApi {
	private static ZipApi instancia = new ZipApi();
	
	private ZipApi() {
		super();
	}
	public static ZipApi getInstancia() {
		return instancia;
	}
	public String retrieveCity(String zip) {
		return "Palmas";
	}
	public String retrieveState(String zip) {
		return "Parana";
	}
}
