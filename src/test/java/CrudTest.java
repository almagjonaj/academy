import com.akademia.dao.UserDao;
import com.akademia.entities.UserEntity;

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
			
			UserEntity u =user.getUserById(1);
			System.out.println(u.getFirstName()+""+u.getUsername());
			
			
			//user.deleteUser(9);
			/*RoleEntity r = new RoleEntity();
			r.setId(4);
			List<RoleEntity> role = new ArrayList<RoleEntity>();
			role.add(r);*/

			/*UserEntity usr = new UserEntity();
			usr.setId(9);
			usr.setPassword("erjola12345");
			usr.setLastName("Rama");
			usr.setFirstName("erjola");
			usr.setUsername("eri");
			user.update(usr);*/

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
