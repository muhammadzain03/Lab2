public class Pet {
    private int petID;
    private String name;
    private String species;
    private String breed;
    private int age;
    private CareProfile careProfile;

    // Constructor
    public Pet(int petID, String name, String species, String breed, int age) {
        this.petID = petID;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.careProfile = new CareProfile(petID);  // Create a CareProfile for each pet
    }

    // Getters and Setters
    public int getPetID() {
        return petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CareProfile getCareProfile() {
        return careProfile;
    }
}
