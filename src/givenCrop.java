public class givenCrop {
        private int myVariable;
        /*
        //different factors that influence crops:
        -seed cost
        -number of crops
        -grow time
        -number of seasons
        -number of days until harvest
        -repeated harvests?
        -produce sell price

        */
        public givenCrop(int variableValue) {
            myVariable = variableValue;

        }

        public int getMyVariable() {
            return myVariable;
        }

        public void setMyVariable(int newVariableValue) {
            myVariable = newVariableValue;
        }
}
