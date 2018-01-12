import com.akademia.dao.UserDao;

public class CrudTest {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			UserDao user = new UserDao();
			if (user.validateUser("root", "admin1234")) {
				System.out.println("Je ok");
			} else {
				System.out.println("sje");
			} 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
