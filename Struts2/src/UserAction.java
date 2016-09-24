import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<Testt> {
	private Testt testt = new Testt();

	public String add() throws Exception {
		if (null == testt.getName() || !"admin".equals(testt.getName())) {

			System.out.println("name = " + testt.getName());
			System.out.println("password = " + testt.getPassword());
			this.addFieldError("name", "name is null or not admin");
			this.addFieldError("name", "name is too short");
			return ERROR;
		}
		return "success";
	}

	public String test2() throws Exception {
		return "success";
	}

	public Testt getModel() {
		return testt;
	}
}
