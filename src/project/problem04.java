package project;

public class problem04 {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		problem04 pizza;
		pizza = new problem04();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		problem04 donut = new problem04();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은" + area);
	}

}
