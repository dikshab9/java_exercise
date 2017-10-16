import com.phone.Android;
import com.phone.OS;
import com.phone.OSFactory;
import com.phone.IOS;

public class FactoryMain {
	public static void main(String args[]) {
		OSFactory osf=new OSFactory();
		OS obj=osf.getInstance("Open");
		obj.spec();
//		OS obj=new Android();
//		obj.spec();
	}

}
