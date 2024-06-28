package subsystem1.crm;

public class CrmService {
	private CrmService() {
		super();
	}
	public static void saveClient(String name, String zip, String city, String state) {
		System.out.println("Cliente salvo no sistema: " );
		System.out.println("\t - " + name);
		System.out.println("\t - " + zip);
		System.out.println("\t - " + city);
		System.out.println("\t - " + state);
	}
}
