
public class Party {

	private int guest;
	private String music;
	private String food;
	
	
	public int getGuest() {
		return guest;
	}
	
	public void setGuest(int guest) {
		this.guest = guest;
		
	}
	
	public String getMusic() {
		return music;
	}
	
	public void setMusic(String music) {
		this.music = music;
	}
	
	public String getFood() {
		return food;
				
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public Party() {
		System.out.println("Time to party!");
	}
	
	public Party(int guestOfGuest, String spicyFood ) {
		guest = guestOfGuest;
		food = spicyFood;
		
	}
	
	public Party(int totalGuest, String typeOfMusic, String typeOfFood) {
		guest = totalGuest;
		music = typeOfMusic;
		food = typeOfFood;
	}
	
	public boolean havingFun() {
		return true;
	}
	
	public String turnUp() {
		return "Its time to turn up!";
	}
	
	static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
