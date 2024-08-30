package collection_Hospital_program;

import java.util.List;
import java.util.Map;

public class HospitalFinder {
public static void main(String[] args) {
	HospitalService hospitalService = new HospitalService();

    int code1 = hospitalService.addHospital( "YASHODA", List.of("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro"),
            "MATHEWS", "9848222222", "Sec");
    int code2 = hospitalService.addHospital("APOLLO", List.of("Ortho", "Pediatric", "Gastro"),
            "JOHN", "9888777777", "Main St");
    int code3 = hospitalService.addHospital("FORTIS", List.of("Cardiac", "ENT", "Ortho"),
            "MARY", "9999999999", "Central Ave");

    System.out.println("Hospital Codes and Names:");
    Map<Integer, String> hospitals = hospitalService.getHospitals();
    hospitals.forEach((code, name) -> System.out.println(code + " : " + name));

    int hospitalCodeToSearch = code1;
    Hospital foundHospital = hospitalService.getHospitalDetails(hospitalCodeToSearch);
    System.out.println("\nHospital Details for Hospital Code " + hospitalCodeToSearch + ":");
    if (foundHospital != null) {
        System.out.println(foundHospital.toString());
    } else {
        System.out.println("Hospital with code " + hospitalCodeToSearch + " not found.");
    }
}
}


