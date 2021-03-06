package testing1;

import  java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Controller implements ActionListener {

	Model model;
	View1 view;

	Controller() {	
		System.out.println ("Controller()");
	} //Controller()

	public void actionPerformed(ActionEvent e){
		
		System.out.println("Controller: acting on Model");
		this.view.updateConsole("Controller: acting on Model");
		model.incrementValue();
		//this.view.update(model, model.getValue());
		
	} //actionPerformed()

	
	public void addModel(Model m){
		System.out.println("Controller: adding model");
		this.model = m;
	} //addModel()

	public void addView(View1 v){
		System.out.println("Controller: adding view");
		this.view = v;
	} //addView()

	public void initModel(int x){
		model.setValue(x);
	} //initModel()

} //Controller
