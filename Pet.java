
public class Pet {
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public String getType() {
		return type;
	}
	
	public void setLocation (String location) {
		this.location = location;
	}
	
	public Pet() {
		System.out.println("Lets talk about your pet.");
	}
	
	
	public Pet(String petName, int petAge, String habitatLocation, String typeOfPet) {
		name = petName;
		age = petAge;
		location = habitatLocation;
		type = typeOfPet;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
