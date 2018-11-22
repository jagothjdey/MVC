
public class Controller {
	   private Model model;
	   private View view;

	   public Controller(Model model, View view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setStudentName(String name){
	      model.setName(name); 
	   }

	   public String getStudentName(){
	      return model.getName(); 
	   }

	   public void setStudentRollNo(String rollNo){
	      model.setRoolNo(rollNo); 
	   }

	   public String getStudentRollNo(){
	      return model.getRoolNo(); 
	   }

	   public void updateView(){ 
	      view.printStudentDetails(model.getName(), model.getRoolNo());
	   }
}
