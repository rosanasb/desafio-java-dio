package one.digitalinnovation.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.zip.ZipApi;

public class Facade {
 public void migrateClient(String name, String zip) {
	 String city = ZipApi.getInstancia().retrieveCity(zip);
	 String state = ZipApi.getInstancia().retrieveState(zip);
	 
	 CrmService.saveClient(name, zip, city, state);
 }
}
