public class RollerCoaster {
	
	private static RollerCoaster instance = null;
	
	private RollerCoaster() {
		
	}
	
	public RollerCoaster getInstance() {
		return instance;
	}
	
	public void initialize() {
		if (instance == null) {
			//instance = new RollerCoaster();
		} else {
			System.out.println("RollerCoaster has already been initialized!");
		}
	}
}