// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
/*
            TODO
    -Finalize givenCrop.java
    -Get math set up
    -finish input lines and questions
    -Create list with data on each crop type

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        givenCrop userCrop = new givenCrop(10, 20, 100, 20, 1, false, 0);
        boolean keepCalculating = true;
        while(keepCalculating) {
            //asking user for the data on a given crop.
            userCrop.setCost(CropCalculator.getInputInt("How much does the crop seed cost in gp?", scanner));
            userCrop.setSellPrice(CropCalculator.getInputInt("How much does the crop sell for in gp?", scanner));
            userCrop.setNumberofCrops(CropCalculator.getInputInt("How many crops do you plan to plant?", scanner));
            userCrop.setGrowthTime(CropCalculator.getInputInt("How long does it take for the plant to be harvested?", scanner));

            userCrop.setRepeatedHarvest(CropCalculator.getInputBoolean("Does the crop have repeated harvests?", scanner));
            if (userCrop.getRepeatedHarvests()) {
                userCrop.setRepeatedGrowthTime(CropCalculator.getInputInt("How long does it take for the plant to regrow produce?", scanner));
            }

            double profit = CropCalculator.calculateRevenue(userCrop);
            System.out.println("The profit for the given crop is: " + profit);
            keepCalculating = CropCalculator.getInputBoolean("Do you want to calculate another crop?", scanner);
        }
        scanner.close();
    }
}
