import java.util.Scanner;
public class CropCalculator {

    public static double calculateRevenue(givenCrop crop) { //calculates revenue based on user input.
        int numberOfHarvests = 0;
        // add bool conditions for different parts of the function. Make them parameters for the function itself ^
        int seasonLength = 28;  // in days
        int TotalSeasonLength = seasonLength * crop.getSeasonNumber(); // multiply season length by the number of seasons the crop grows (given it will be consecutively grown)
        if (crop.getRepeatedHarvests()) {
            int AdjustedSeasonLength = TotalSeasonLength - (crop.getGrowthTime() * crop.getSeasonNumber());
            numberOfHarvests = AdjustedSeasonLength / (crop.getGrowthTime() * crop.getNumberofCrops());
        } else {
            numberOfHarvests = TotalSeasonLength / crop.getGrowthTime() * crop.getNumberofCrops(); // how many times the number of planted crops can be harvested in a season, given they are planted the day they are harvested.
        }

        double totalCost = numberOfHarvests * crop.getCost(); //total cost of all the seeds planted
        double totalRevenue = numberOfHarvests * crop.getSellPrice(); //total sell price of all harvested crops during given total season length




        return totalRevenue - totalCost;

    }
    public static int getInputInt(String message, Scanner scanner) { //checks if something is an Int. If not, repeats statement and input until an Int is received
        int inputInt;
        while (true) {
            System.out.println(message);
            try {
                inputInt = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a digit.");
                scanner.nextLine(); // clear the input buffer
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
                case "yes":
                case "y":
                    inputBoolean = true;
                    break;
                case "no":
                case "n":
                    inputBoolean = false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
        return inputBoolean;
    }


}
