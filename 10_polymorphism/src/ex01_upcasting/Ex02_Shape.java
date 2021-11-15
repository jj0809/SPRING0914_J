package ex01_upcasting;

///수퍼클래스: 도형
class Shape{
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
	public double getArea() {
		return 0; //당장 도형이 형성되지 않아서 일단 0로 설정
	}
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
public class Ex02_Shape { //Shape: 도형

	public static void main(String[] args) {
		
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
