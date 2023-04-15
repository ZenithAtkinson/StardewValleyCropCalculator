import java.util.Scanner;
public class CropCalculator {

    public static double calculateRevenue(givenCrop crop) { //calculates revenue based on user input.
        int numberOfHarvests;
        // add bool conditions for different parts of the function. Make them parameters for the function itself ^
        int seasonLength = 28;  // in days
        int TotalSeasonLength = seasonLength * crop.getSeasonNumber(); // multiply season length by the number of seasons the crop grows (given it will be consecutively grown)

        if (crop.getRepeatedHarvests()) { //IF there are repeated harvests...
            int AdjustedSeasonLength = TotalSeasonLength - crop.getGrowthTime();
            numberOfHarvests = AdjustedSeasonLength / (crop.getRepeatedGrowthTime() * crop.getNumberofCrops()) + 1;
        } else {
            numberOfHarvests = TotalSeasonLength / (crop.getGrowthTime() * crop.getNumberofCrops()); // how many times the number of planted crops can be harvested in a season, given they are planted the day they are harvested.
        }

        double totalCost = numberOfHarvests * crop.getCost(); //total cost of all the seeds planted
        double totalRevenue = numberOfHarvests * crop.getSellPrice(); //total sell price of all harvested crops during given total season length


        return totalRevenue - totalCost;

    }
    public static int getInputInt(String message, Scanner scanner) {
        int inputInt;
        while (true) {
            System.out.println(message);
            try {
                inputInt = scanner.nextInt();
                if (inputInt > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer greater than 0.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a digit.");
                scanner.nextLine();
            }
        }
        return inputInt;
    }

    public static boolean getInputBoolean(String message, Scanner scanner) { //checks if something is valid "yes" or "no" statement. If not, repeats statement
        Boolean inputBoolean = null;
        while (inputBoolean == null) {
            System.out.println(message);
            String input = scanner.next().toLowerCase();
            switch (input) {
                case "yes", "y" -> inputBoolean = true;
                case "no", "n" -> inputBoolean = false;
                default -> System.out.println("Invalid input. Please try again.");
            }
        }
        return inputBoolean;
    }


}
