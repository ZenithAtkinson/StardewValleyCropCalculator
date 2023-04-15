public class givenCrop {
        /*
        //different factors that influence crops:
        -one time harvest? Or TOTAL harvest (if continually planted and harvest for the length of time it can be)
        -seed cost
        -number of crops
        -grow time (in days)
        -number of seasons
        -repeated harvests?
            -if repeated harvests, time until next harvest
        -produce sell price
         */
        private boolean oneTimeHarvest; //if false, calculate based on 28 day season. If true, don't factor in seasonnumber or repeated harvests.
        private double cost;
        private double sellPrice;
        private int cropNumber;
        private int growthTime; //in days
        private int seasonNumber; //number of seasons the crop grows for consecutively
        private boolean repeatedHarvest; //if the plant will continue to grow produce once fully grown
            private int repeatedGrowthTime; //given repeatedHarvest == TRUE, how long it takes for new produce to grow.

    public givenCrop() {
        this(0, 0, 0, 0, 0, false, 0); // default values
    }


    public givenCrop(double cost, double sellPrice, int cropNumber, int growthTime, int seasonNumber, boolean repeatedHarvest, int repeatedGrowthTime) { //no initialization, in case a given value is not present in a crop
        this.cost = cost;
        this.sellPrice = sellPrice;
        this.cropNumber = cropNumber;
        this.growthTime = growthTime;
        this.seasonNumber = seasonNumber;
        this.repeatedHarvest = repeatedHarvest;
        this.repeatedGrowthTime = repeatedGrowthTime;
    }
        //getter and setters below
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSellPrice() {
        return sellPrice;
    }
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getNumberofCrops(){
        return cropNumber;
    }
    public void setNumberofCrops(int cropNumber) {
        this.cropNumber = cropNumber;
    }

    public int getGrowthTime(){
        return growthTime;
    }
    public void setGrowthTime(int growthTime) {
        this.growthTime = growthTime;
    }

    public int getSeasonNumber(){
        return seasonNumber;
    }
    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public boolean getRepeatedHarvests(){
        return repeatedHarvest;
    }
    public void setRepeatedHarvest(boolean repeatedHarvest) {
        this.repeatedHarvest = repeatedHarvest;
    }

    public int getRepeatedGrowthTime(){
        return repeatedGrowthTime;
    }
    public void setRepeatedGrowthTime(int repeatedGrowthTime) {
        this.repeatedGrowthTime = repeatedGrowthTime;
    }




}
