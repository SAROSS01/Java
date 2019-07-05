import java.lang.Math;
public class Circle extends Shape {
	private Double radius;
	private Double area;
	
	public Circle (Double radiusSize) {
		 radius = radiusSize;
		 area = (radiusSize * radiusSize) * Math.PI;
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double getArea() {
	return area;
	}
	
	
	

	

}
