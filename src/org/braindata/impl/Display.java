package org.braindata.impl;

import org.braindata.model.Student;

public class Display extends Student{

	public void Studentfirst()
{
	Display d=new Display();
	//set data and get data of Student
	d.rollno=12;
	d.name="Samir";
	d.mobileno=9876543210l;
	d.fees=23500;
	d.address="RuikarcolonyKolhapur";
	d.clgname="NewCollege";

	System.out.println();
	System.out.println(" ~~~~~FIRST STUDENT DETAILS~~~~");
	System.out.println(" ______________ ___________________");
	System.out.println("  Roll no      = "+d.rollno);
	System.out.println("  Student Name = "+d.name);
	System.out.println("  Contact no   = "+d.mobileno);
	System.out.println("  Fees         = "+d.fees);
	System.out.println("  Address      = "+d.address);
	System.out.println("  College Name = "+d.clgname);
	
}
	public void StudentSecond()
{
	Display d=new Display();
	//set data and get data of Student
	d.rollno=37;
	d.name="Manasvi";
	d.mobileno=987653470l;
	d.fees=35500;
	d.address="SAmruddhiNagarSatara";
	d.clgname="DKCollege";
	System.out.println();
	System.out.println(" ~~~~~SECOND STUDENT DETAILS~~~~");
	System.out.println(" ______________ ___________________");
	System.out.println("  Roll no      = "+d.rollno);
	System.out.println("  Student Name = "+d.name);
	System.out.println("  Contact no   = "+d.mobileno);
	System.out.println("  Fees         = "+d.fees);
	System.out.println("  Address      = "+d.address);
	System.out.println("  College Name = "+d.clgname);
}
}

