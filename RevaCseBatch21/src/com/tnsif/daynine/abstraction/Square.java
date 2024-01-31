package com.tnsif.daynine.abstraction;

public class Square extends Shape {
	
	 float side;
	 
	 
	public Square() {
		super();
	}

	public Square(float side) {
		super();
		this.side = side;
	}


	@Override
	void calArea()
	{
		area =  side * side;
	}

}
