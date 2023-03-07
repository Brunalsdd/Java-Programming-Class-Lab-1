import java.util.Date;
import java.util.Calendar;


// @author BrunaDonatoni

// ** Singers Class**
public class Singers {

	private int id;
	private String name;
	private String address;
	private String dateOfBirth;
	private int albumsPublish;
	
//	**Singers constructors no argument**
	public Singers(){
		
	}
	
//	**Singers constructors 5 arguments**
	public Singers(int id, String name, String address, String dateOfBirth, int albumsPublish) {
		this.setAllVariables(id, name, address, dateOfBirth, albumsPublish);

	}
	
// **Getters and setters**
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAlbumsPublish() {
		return albumsPublish;
	}

	public void setAlbumsPublish(int albumsPublish) {
		this.albumsPublish = albumsPublish;
	}

// **Set all the values of the instance variables at once**
	public void setAllVariables(int id, String name, String address, String dateOfBirth, int albumsPublish) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.albumsPublish = albumsPublish;
	}

//	**To string to display the values**
	@Override
	public String toString() {
		return "Singers [id=" + id + ", name=" + name + ", address=" + address + ", dateOfBirth=" + dateOfBirth
				+ ", albumsPublish=" + albumsPublish + "]";
	}
	
	
}

