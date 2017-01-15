package homework13;



public class Point2d {
	private float x = 0.0f;
	private float y = 0.0f;

	public Point2d() {

	}

	public Point2d(float x, float y) {

		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setXY(float x, float y) {

		this.x = x;
		this.y = y;

	}
	
	public float[] getXY(){
		
		float[] array = new float[2];
		array[0] = this.getX();
		array[1] = this.getY();
		return array;
		
	}

	@Override
	public String toString() {
		return "Point2d [x=" + x + ", y=" + y + "]";
	}

}
