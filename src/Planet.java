import java.util.ArrayList;
import java.util.List;

public enum Planet {

	MERCURY(100000), SATURN(30088), URANUS(10000);

	List<Integer> sizes = new ArrayList<>();
	Integer radius;

	Planet(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public List<Integer> lista() {
		return sizes;
	}

	public static void main(String[] args) {

		Planet planeta = Planet.MERCURY;
		System.out.println(planeta.getRadius());
		Planet ura = Planet.URANUS;
		System.out.println(ura.getRadius());
	}

}




