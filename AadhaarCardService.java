import java.util.*;

class AadhaarCardService {
    private Map<String, AadhaarCardDetails> database = new HashMap<>();

    // Add Aadhaar to the database
    public void addAadhaar(AadhaarCardDetails aadhaar) {
        if (database.containsKey(aadhaar.getCardNumber())) {
            System.out.println("Aadhaar Number already exists!");
        } else {
            database.put(aadhaar.getCardNumber(), aadhaar);
            System.out.println("Aadhaar Card added Successfully!");
        }
    }

    // View Aadhaar from the database
    public void viewAadhaar(String cardNumber) {
        AadhaarCardDetails aadhaar = database.get(cardNumber);
        if (aadhaar != null) {
            aadhaar.Display();
        } else {
            System.out.println("No such record found!");
        }
    }

    // Update Aadhaar in the database
    public void updateAadhaar(String cardNumber, Scanner sc) {
        AadhaarCardDetails aadhaar = database.get(cardNumber);
        if (aadhaar != null) {
            System.out.print("Name of the applicant: ");
            aadhaar.setname(sc.nextLine());
            System.out.print("Date of Birth: ");
            aadhaar.setDOB(sc.nextLine());
            System.out.print("Gender: ");
            aadhaar.setGender(sc.nextLine());
            System.out.print("Address: ");
            aadhaar.setAddress(sc.nextLine());
        } else {
            System.out.println("No such record found!");
        }
    }

    // Delete Aadhaar from the database
    public void deleteAadhaar(String cardNumber) {
        if (database.remove(cardNumber) != null) {
            System.out.println("Aadhaar Record Deleted");
        } else {
            System.out.println("No such record found");
        }
    }

    // List all Aadhaar records
    public void listAll() {
        if (database.isEmpty()) {
            System.out.println("Records Unavailable");
        } else {
            for (AadhaarCardDetails a : database.values()) {
                a.Display();
            }
        }
    }
}
