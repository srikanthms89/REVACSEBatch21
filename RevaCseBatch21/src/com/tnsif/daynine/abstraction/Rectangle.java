package com.tnsif.daynine.abstraction;

public class Rectangle extends Shape{
     float width ,height;
     
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}


	public Rectangle() {
		super();
	}



	@Override
	void calArea()
	{
		area = width * height;
	}
}
