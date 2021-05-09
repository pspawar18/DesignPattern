package com.adap;

public class School {

	public static void main(String[] args) {
		//PilotPen pp = new PilotPen();  Instade of passing PilotPen pass penAdapter obj
		Pen pa = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(pa);
		aw.writeAssignment("I am bit tired to write an Assignment");

	}

}
