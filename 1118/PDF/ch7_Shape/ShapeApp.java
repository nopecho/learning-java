package ch7_Shape;

class ShapeApp {
	static double sumArea(Shape[] arr) {
		double result=0;
		for(int i=0;i<arr.length;i++) {
			result+=arr[i].calcArea();
		}return result;
	}
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0),new Rect(3,4), new Circle(1)};
		System.out.println("면적의 합 : "+sumArea(arr));
	}
}
