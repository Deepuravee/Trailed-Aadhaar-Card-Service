import java.util.Scanner;

public class MainAadhaar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadhaarCardService service = new AadhaarCardService();

        while (true) {
            System.out.println("\n--- Aadhaar Manager ---");
            System.out.println("1. Add Aadhaar");
            System.out.println("2. View Aadhaar");
            System.out.println("3. Update Aadhaar");
            System.out.println("4. Delete Aadhaar");
            System.out.println("5. View All");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline
            } else {
                System.out.println("Please enter a valid number.");
                sc.nextLine(); // consume invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Aadhaar Number: ");
                    String num = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("DOB: ");
                    String dob = sc.nextLine();
                    System.out.print("Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    AadhaarCardDetails aadhaar = new AadhaarCardDetails(num, name, dob, gender, address);
                    service.addAadhaar(aadhaar);
                    break;

                case 2:
                    System.out.print("Enter Aadhaar Number: ");
                    service.viewAadhaar(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter Aadhaar Number to Update: ");
                    service.updateAadhaar(sc.nextLine(), sc);
                    break;

                case 4:
                    System.out.print("Enter Aadhaar Number to Delete: ");
                    service.deleteAadhaar(sc.nextLine());
                    break;

                case 5:
                    service.listAll();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
