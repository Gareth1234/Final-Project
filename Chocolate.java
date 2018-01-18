public class Chocolate extends RectangularPrism {
  //Instance variables
  private int numberOrdered; //Needed for cascading problem solution
  private double totalChocolateCost;

  //Zero Argument Constructor

  //Getters and Setters Methods
  //Getters: instance Variable cannot be changed by outside class or program

  public double getTotalCost () { //returning appleCost from Zero Argument Constructor
    return this.totalChocolateCost = Information.chocolateBoxCost * this.numberOrdered; //
  } //End of getTotalCost

  //Processor Methods

  //Multi-argument Constructor
  public Chocolate (int userEntered, double boxWidth, double boxLength, double boxHeight) {
    super( userEntered, boxWidth, boxLength, boxHeight);
    this.numberOrdered = userEntered;
  } //End of ApplesOrdered multi-argument constructor

  //toString() for Printing Results of Class to Console
  public String toString() { //For JOptionPane and Println
    return super.toString() + "\n";
  }
} //End of Chocolate Class
