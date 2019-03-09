package corejava.basic;

import java.util.Scanner;

class Student
{
	int physics;
	int chemistry;
	int maths;
	public int getPhysics()
	{
		return physics;
	}
	public void setPhysics(int physics)
	{
		this.physics = physics;
	}
	public int getChemistry()
	{
		return chemistry;
	}
	public void setChemistry(int chemistry)
	{
		this.chemistry = chemistry;
	}
	public int getMaths()
	{
		return maths;
	}
	public void setMaths(int maths)
	{
		this.maths = maths;
	}
}

public class StudentMarksCalculator extends Student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		Student kapil = new Student();
		System.out.println("please enter kapil physics marks");
		kapil.setPhysics(sc.nextInt());
		System.out.println("please enter kapil chemistry marks");
		kapil.setChemistry(sc.nextInt());
		System.out.println("please enter kapil maths marks");
		kapil.setMaths(sc.nextInt());
		
		Student divya = new Student();
		System.out.println("please enter divya physics marks");
		divya.setPhysics(sc.nextInt());
		System.out.println("please enter divya chemistry marks");
		divya.setChemistry(sc.nextInt());
		System.out.println("please enter divya maths marks");
		divya.setMaths(sc.nextInt());
		
		Student pratiksha = new Student();
		System.out.println("please enter pratiksha physics marks");
		pratiksha.setPhysics(sc.nextInt());
		System.out.println("please enter pratiksha chemistry marks");
		pratiksha.setChemistry(sc.nextInt());
		System.out.println("please enter pratiksha maths marks");
		pratiksha.setMaths(sc.nextInt());
		sc.close();
		
		System.out.println("total marks obtained by kapil " + (kapil.getPhysics()+kapil.getChemistry()+kapil.getMaths()));
		System.out.println("average marks obt. by kapil " + (kapil.getPhysics() + kapil.getChemistry() + kapil.getMaths())/3);
		System.out.println();
		
		System.out.println("total marks obtained by divya " + (divya.getPhysics()+divya.getChemistry()+divya.getMaths()));
		System.out.println("average marks obt. by divya " + (divya.getPhysics() + divya.getChemistry() + divya.getMaths())/3);
		System.out.println();
		
		System.out.println("total marks obtained by pratiksha " + (pratiksha.getPhysics()+pratiksha.getChemistry()+pratiksha.getMaths()));
		System.out.println("average marks obt. by pratiksha " + (pratiksha.getPhysics() + pratiksha.getChemistry() + pratiksha.getMaths())/3);
		System.out.println();
	}
}
