
public class Main {

	public static void main(String[] args) {
		//fetch student record based on his roll no from the database
	      Model model  = retriveStudentFromDatabase();

	      //Create a view : to write student details on console
	      View view = new View();

	      Controller controller = new Controller(model, view);

	      controller.updateView();

	      //update model data
	      controller.setStudentName("John");

	      controller.updateView();
	}
	
	private static Model retriveStudentFromDatabase(){
	      Model student = new Model();
	      student.setName("Robert");
	      student.setRoolNo("10");
	      return student;
	   }

}
