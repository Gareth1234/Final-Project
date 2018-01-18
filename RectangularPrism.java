public class RectangularPrism extends ShoppingCart {
  //Instance variables, assigned in Zero Argument Constructor
  private int numberOrdered;

  //https://www.programmableweb.com/api/pi
  //Dealing with Pi: nonterminating, nonrepeating (not a ratio)
  //"How smart is your calculator?"
  private double boxWidth;
  private double boxLength;
  private double boxHeight;
  private double singleRectangularPrismVolume;
  private int rectangularPrismsPerRow; //Items per row
  private int rectangularPrismsPerFlat; //Spheres per flat
  private int rectangularPrismsPerBox; //Spheres per flat
  //Use isometric paper to visualize these calculations

  //Variables for how Spheres are beign packaged
  private int numBoxes; //Adding Number of full boxes needed for shipping
  private int numFlats; //Adding Number of full "flats" needed for shipping
  private int numRows; //Adding Number of full "rows" needed for shipping

  //Variables for boxing Spheres
  private int rectangularPrismNumberCalculated; //Needed for cascading problem solution
  private int rectangularPrismLeftover; //Needed for cascading problem

  //Zero Argument Constructor

  //Getters and Setters Methods
    //Getters: instance Variable cannot be changed by outside class or program
  //public double getTotalCost () {return totalcost;}

  //Processor Methods

  //Multi-argument Constructor
  public RectangularPrism (int userEntered, double boxWidth1, double boxLength1, double boxHeight1) {
     //Changing Variables to mimic packing an object
     //Caution: every time an order is called, the order object must deliever the
         //diameter, from appples or oranges
     //Note: perspective is from an object, action is one item at a time which might be confusing
     super();
     //Assigning Instance Variables
     this.numberOrdered = this.rectangularPrismNumberCalculated = userEntered;
     this.boxWidth = boxWidth1;
     this.boxLength = boxLength1;
     this.boxHeight = boxHeight1;
     this.singleRectangularPrismVolume = this.boxWidth * this.boxLength * this.boxHeight;
     this.rectangularPrismsPerRow = (int) Information.box1Width / (int) this.boxWidth * (int) this.boxLength * (int) this.boxHeight; //Items per row
     this.rectangularPrismsPerFlat = (int) Information.box1Length / (int) this.boxWidth * (int) this.boxLength * (int) this.boxHeight * this.rectangularPrismsPerRow; //Spheres per flat
     this.rectangularPrismsPerBox = (int) Information.box1Height / (int) this.boxWidth * (int) this.boxLength * (int) this.boxHeight * this.rectangularPrismsPerFlat; //Spheres per flat
     this.numBoxes = 0;
     this.numFlats = 0;
     this.numRows = 0;
     //Using the Instance Variables
     while (this.rectangularPrismNumberCalculated >= this.rectangularPrismsPerBox) { //Check if we need 1 box or more
       this.numBoxes += 1; //Same as numBoxes = numBoxes +1
       this.rectangularPrismNumberCalculated -= this.rectangularPrismsPerBox; //Same as sphereNumberCalculated = sphereNumberCalculated - spheresPerBox
     } //End of WHILE for Full boxes
     while (this.rectangularPrismNumberCalculated >= this.rectangularPrismsPerFlat) { //Check if we need 1 flat or more
       this.numFlats += 1;
       this.rectangularPrismNumberCalculated -= this.rectangularPrismsPerFlat;
     } //End of WHILE for Full flats
     while (this.rectangularPrismNumberCalculated >= this.rectangularPrismsPerRow) { //Check if we need 1 row or more
       this.numRows += 1;
       this.rectangularPrismNumberCalculated -= this.rectangularPrismsPerRow;
     } //End of WHILE for Full boxes
     this.rectangularPrismLeftover = this.rectangularPrismNumberCalculated; //Number of spheres left in less than a row
  } //End of Multi-argument Constructor

//toString() for Printing Results of Class to Console
public String toString() {
  return "Boxing Guide: \nNumber Ordered: " + this.numberOrdered + "\n" +
         "Number of Boxes Needed: " + (numBoxes + 1) + "\n" +
         "\tNumber of Full Boxes: " + numBoxes + "\n" +
         "\tGuide for last partial box: " + numFlats + " full flats, " + numRows +
         " full row(s) on last flat, " + this.rectangularPrismLeftover + " Chocolate in last row.";
}

} //End of Rectangular Prism Class
