package ex01_abstract;

abstract class Shape{
	//field
	private String name; //원, 삼각형, 사각형 등.. 이름
	//constructor

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() { //name 읽어오는 getter
		return name;
	}

	public void setName(String name) { //name 입력받는 setter
		this.name = name;
	}
	public abstract double getArea();
}


//서브클래스: 원
class Circle extends Shape{
	//field
	private double r;
	//constructor
	public Circle(String name, double r) {
		super(name);
		this.r = r;
	}
	//method
	@Override
	public double getArea() { 
		return Math.PI * Math.pow(r, 2); //위에서 0으로 뒀던 값 리메이크하기
	}
	
}

//서브클래스: 사각형
class Rect extends Shape{
	//field
	private int width; //가로
	private int height; //세로
	//constructor
	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	//method
	@Override
	public double getArea() {
		return width * height;
	}
	
}
public class Ex02_Shape {

	public static void main(String[] args) {
		
		//abstract는 문법의 보완
//		new Shape("사각형"); //기존의 10_Ex02_Shape에서 가능했는데 이는 말도 안되는 형태로
							//객체생성을 하면 안되는 애들의 객체 생성을 막기위해 abstract를 붙인다.
		
		
	//circle, rect를 한 곳에 모아두자
			Shape[] shapeList = new Shape[5]; //5개의 도형을 저장할 수 있음
			shapeList[0] = new Circle("구슬" , 0.5);
			shapeList[1] = new Rect("색종이", 12, 12 );
			shapeList[2] = new Circle("피자", 100);
			shapeList[3] = new Circle("도넛", 10.5);
			shapeList[4] = new Rect("스케치북", 100, 150);
			
			for (Shape shape: shapeList) {
				System.out.println(shape.getName() + "의 면적: " + shape.getArea());
			
			}
	}

}
