
public class problem23 {
	private static float minimum3(float x, float y, float z) {
		float minimum = Math.min((Math.min(x, y)), z);
		
		return minimum;
	}
}
