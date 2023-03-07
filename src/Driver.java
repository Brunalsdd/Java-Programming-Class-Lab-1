import java.util.Calendar;
import java.util.Date;

// @author BrunaDonatoni
// **Create the driver class**

public class Driver {

	public static void main(String[] args) {
		
		Singers singer1 = new Singers();
		
// **Display the default values of the instance variables of this object singer1**
		System.out.println("Exercise 1 - first part ");
		System.out.println("singer1 default values:");
		System.out.println(singer1.toString());

// **Changing all and displaying the sets values of this object singer1**
		singer1.setAllVariables(1, "Caetano Veloso", "Brazil", "1942/08/07" , 35);
		
		System.out.println(" ");
		System.out.println("Exercise 1 - second part ");
		System.out.println("singer1 sets values:");
		System.out.println(singer1.toString());

// **Changing one per time and displaying the sets values of this object singer1**
		singer1.setId(2);
		singer1.setName("Renato Russo");
		singer1.setAddress("Brazil");
		singer1.setDateOfBirth("1960/03/27");
		singer1.setAlbumsPublish(14);
		
		System.out.println(" ");
		System.out.println("Exercise 1 - third part ");
		System.out.println("singer1 sets one per one values:");
		System.out.println(singer1.toString());
		
		
	}

}
