
public class Square extends Rectangle {
	private Double height;
	private Double width;
	private Double area;

	public Square(Double widthSize, Double heightSize) {
		super(widthSize, heightSize);
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
		return area;
	}



	
		
	}


