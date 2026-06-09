import java.util.Scanner;

class BloodDonationManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aPositive = 5;
        int bPositive = 3;
        int oPositive = 4;
        int abPositive = 2;

        int choice;

        System.out.println("===== BLOOD DONATION MANAGEMENT SYSTEM =====");

        do {

            System.out.println("\n1. Donate Blood");
            System.out.println("2. Check Blood Availability");
            System.out.println("3. Show Blood Stock");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Blood Group (A+/B+/O+/AB+): ");
                    String donateGroup = sc.nextLine();

                    if (donateGroup.equalsIgnoreCase("A+")) {
                        aPositive++;
                    } else if (donateGroup.equalsIgnoreCase("B+")) {
                        bPositive++;
                    } else if (donateGroup.equalsIgnoreCase("O+")) {
                        oPositive++;
                    } else if (donateGroup.equalsIgnoreCase("AB+")) {
                        abPositive++;
                    } else {
                        System.out.println("Invalid Blood Group!");
                        break;
                    }

                    System.out.println("Blood Donated Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Blood Group to Check: ");
                    String checkGroup = sc.nextLine();

                    if (checkGroup.equalsIgnoreCase("A+")) {
                        System.out.println("Available Units: " + aPositive);
                    } else if (checkGroup.equalsIgnoreCase("B+")) {
                        System.out.println("Available Units: " + bPositive);
                    } else if (checkGroup.equalsIgnoreCase("O+")) {
                        System.out.println("Available Units: " + oPositive);
                    } else if (checkGroup.equalsIgnoreCase("AB+")) {
                        System.out.println("Available Units: " + abPositive);
                    } else {
                        System.out.println("Invalid Blood Group!");
                    }
                    break;

                case 3:
                    System.out.println("\n===== BLOOD STOCK =====");
                    System.out.println("A+ : " + aPositive);
                    System.out.println("B+ : " + bPositive);
                    System.out.println("O+ : " + oPositive);
                    System.out.println("AB+ : " + abPositive);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}