package org.tnsindia.di1;
//Class 2
public class StudentK {
	//2.DI in the forms of objects
	MathCheat math;
		
	//MathCheat m=new MathCheat();
	public void cheating()
	{
		math.mathCheat();
	}
	//DI using setters
	public void setMath(MathCheat math) {
		this.math = math;
	}

}
