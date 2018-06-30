package Prototype;

import java.util.ArrayList;

public class ClassOfSchool implements Cloneable{

	private String nameOfClass;
	private ArrayList<Student> listStudent;
	
	public ClassOfSchool(String nameOfClass){
		this.nameOfClass=nameOfClass;
		this.listStudent=new ArrayList<>();
	}
	public String getNameOfClass() {
		return nameOfClass;
	}
	public void setNameOfClass(String nameOfClass) {
		this.nameOfClass = nameOfClass;
	}
	public ArrayList<Student> getListStudent() {
		return listStudent;
	}
	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	
	public void delete(int pos){
		this.listStudent.remove(pos);
	}
	public void add(Student student){
		this.listStudent.add(student);
	}
//	public void printInfomationOfClass(){
//		System.out.println(this.nameOfClass);
//		for(int i=0;i<this.listStudent.size();i++){
//			System.out.println(this.listStudent.get(i).toString());
//		}
//	}
	
	public ClassOfSchool cloneDeepCopy() {
		ClassOfSchool temp=new ClassOfSchool(this.nameOfClass);
		for(Student i:this.listStudent){
			temp.add(i);
		}
		return temp;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "ClassOfSchool [nameOfClass=" + nameOfClass + ", listStudent=" + listStudent + "]";
	}
	
	
}
