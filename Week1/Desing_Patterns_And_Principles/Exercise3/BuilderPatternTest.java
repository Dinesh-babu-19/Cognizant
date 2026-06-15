public class BuilderPatternTest {

    public static void main(String[] args) {

        // Gaming Computer
        Computer gamingComputer = new Computer.Builder(
                "Intel Core i9",
                "32 GB")
                .setStorage("1 TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        // Office Computer
        Computer officeComputer = new Computer.Builder(
                "Intel Core i5",
                "16 GB")
                .setStorage("512 GB SSD")
                .setOperatingSystem("Windows 10")
                .build();

        // Basic Computer
        Computer basicComputer = new Computer.Builder(
                "AMD Ryzen 5",
                "8 GB")
                .build();

        gamingComputer.displayConfiguration();
        officeComputer.displayConfiguration();
        basicComputer.displayConfiguration();
    }
}