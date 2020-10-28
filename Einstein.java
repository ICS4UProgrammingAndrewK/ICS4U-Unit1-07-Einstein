import java.util.Scanner;
 /**
*
* class Einstein
*
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-18-09
*/
public class Einstein {
	public static void main(String[] args) {
    
    Scanner userInput = new Scanner(System.in);
    
    //diclare the varible
    double mass;
    double speedOfLight = 2.998 * Math.pow(10, 8);
    double energy;
    
    //this ask the user to insert the mass(Kg)
    System.out.println(" Enter the mass of object in Kilograms:");
    	
    //This qual the mass to the user input
    mass = userInput.nextDouble();
    	
    //Calculate the mass in to energy
    mass = (mass * 2.998 * Math.pow(10, 8));
    	
    // Display the total energy
    System.out.println(" The Total energy is : " + mass);
    	
	}
}
