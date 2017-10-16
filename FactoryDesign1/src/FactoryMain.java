import com.phone.Android;
import com.phone.OS;


public class FactoryMain {
	public static void main(String[] args) {
		OS obj1=(OS) new Android();
		obj1.spec();
	}

}
