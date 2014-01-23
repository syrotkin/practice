package graphiceditor;

class GraphicEditor {
	 
 	public void drawShape(Shape s) {
 		if (s.m_type==1)
 			drawRectangle((Rectangle)s);
 		else if (s.m_type==2)
 			drawCircle((Circle)s);
 	}
 	public void drawCircle(Circle r) {
 		System.out.println("Drawing circle");
 	}
 	public void drawRectangle(Rectangle r) {
 		System.out.println("Drawing rectangle");
 	}
 }
 
 class Shape {
 	int m_type;
 }
 
 class Rectangle extends Shape {
 	Rectangle() {
 		m_type=1;
 	}
 }
 
 class Circle extends Shape {
 	Circle() {
 		m_type=2;
 	}
 } 