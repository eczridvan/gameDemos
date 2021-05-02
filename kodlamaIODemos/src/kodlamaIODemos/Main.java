package kodlamaIODemos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager[] userManagers = new UserManager[] {new InstructorManager(), new StudentManager()};
		
		for (UserManager userManager: userManagers) {
			
			userManager.update("JAVA KURSU");
		}
	}

}
