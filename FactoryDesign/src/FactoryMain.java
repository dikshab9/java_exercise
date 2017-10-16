import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryMain {
	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj=osf.getInstance("Open");
		obj.spec();
//		OS obj=new Android();
//		obj.spec();
	}

}
