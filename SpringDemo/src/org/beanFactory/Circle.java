package org.beanFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point centre;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle point is: ("+centre.getX()+","+centre.getY()+")");
		

	}
	public Point getCentre() {
		return centre;
	}
	@Autowired
	public void setCentre(Point centre) {
		this.centre = centre;
	}

}
