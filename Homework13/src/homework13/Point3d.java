package homework13;

public class Point3d extends Point2d {

	private float z = 0.0f;

	Point3d(float x, float y, float z) {

		super(x, y);
		this.z = z;
	}

	Point3d() {
		super();
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public void setXYZ(float x, float y, float z) {

		super.setX(x);
		super.setY(y);
		this.z = z;

	}

	public float[] getXYZ() {

		float[] array = new float[3];
		array[0] = this.getX();
		array[1] = this.getY();
		array[2] = this.getZ();
		return array;

	}

	@Override
	public String toString() {
		return "Point3d ["+ super.toString() + "Z=" + z + "]";
	}

}
