import java.util.ArrayList;
import java.util.List;

public class Application {
    private static List<Client> clients = new ArrayList<>();
    private static List<Pet> pets = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();
    private static List<Staff> staffMembers = new ArrayList<>();

    public static void main(String[] args) {
        // Example CLI menu implementation
        boolean running = true;
        while (running) {
            System.out.println("YYC Pet Resort Management System");
            System.out.println("1. Add Client");
            System.out.println("2. Add Pet");
            System.out.println("3. Create Booking");
            System.out.println("4. View Clients");
            System.out.println("5. View Pets");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            
            int choice = new java.util.Scanner(System.in).nextInt();
            
            switch (choice) {
                case 1:
                    // Add client
                    addClient();
                    break;
                case 2:
                    // Add pet
                    addPet();
                    break;
                case 3:
                    // Create booking
                    createBooking();
                    break;
                case 4:
                    // View clients
                    viewClients();
                    break;
                case 5:
                    // View pets
                    viewPets();
                    break;
                case 6:
                    // Exit
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Sample methods for adding/viewing clients and pets
    private static void addClient() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter client ID: ");
        int clientID = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        System.out.print("Enter client phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter client address: ");
        String address = scanner.nextLine();
        
        Client client = new Client(clientID, name, phoneNumber, address);
        clients.add(client);
        System.out.println("Client added successfully!");
    }

    private static void addPet() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter pet ID: ");
        int petID = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        System.out.print("Enter pet species: ");
        String species = scanner.nextLine();
        System.out.print("Enter pet breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        
        Pet pet = new Pet(petID, name, species, breed, age);
        pets.add(pet);
        System.out.println("Pet added successfully!");
    }

    private static void createBooking() {
        // Implementation for creating a booking
        System.out.println("Booking created successfully!");
    }

    private static void viewClients() {
        for (Client client : clients) {
            System.out.println("Client ID: " + client.getClientID());
            System.out.println("Name: " + client.getName());
            System.out.println("Phone Number: " + client.getPhoneNumber());
            System.out.println("Address: " + client.getAddress());
            System.out.println("------------------------------");
        }
    }

    private static void viewPets() {
        for (Pet pet : pets) {
            System.out.println("Pet ID: " + pet.getPetID());
            System.out.println("Name: " + pet.getName());
            System.out.println("Species: " + pet.getSpecies());
            System.out.println("Breed: " + pet.getBreed());
            System.out.println("Age: " + pet.getAge());
            System.out.println("------------------------------");
        }
    }
}
