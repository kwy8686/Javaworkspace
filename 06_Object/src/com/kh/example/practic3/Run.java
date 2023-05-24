package com.kh.example.practic3;

import com.kh.example.practic3.model.Circle;

public class Run {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.incrementRadius();
		c.incrementRadius();
		
		// 원의 둘레 = 2 x 반지름 x PI
		System.out.println(2 * c.radius * Circle.PI);
		// 원의 넓이 = 반지름 X 반지름 X PI
		System.out.println(c.radius * c.radius * Circle.PI);

	}

}
