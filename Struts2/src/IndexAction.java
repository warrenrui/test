import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class IndexAction extends ActionSupport implements ModelDriven<Testt> {
	private Testt testt = new Testt();

	public String test() throws Exception {
		System.out.println("name = " + testt.getName());
		System.out.println("password = " + testt.getPassword());
		return "success";
	}

	public String test2() throws Exception {
		return "success";
	}

	public Testt getModel() {
		return testt;
	}
}
