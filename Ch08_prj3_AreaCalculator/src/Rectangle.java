
public class Rectangle extends Shape {

	private Double height;
	private Double width;
	private Double area;
	public Rectangle(Double widthSize, Double heightSize) {
		width = widthSize;
		height = heightSize;
		area = width * height;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	
	public Double getArea() {
		
		return  area;
	}
	
	 

}
