package homework13;

public class Test_P2d_P3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point3d p3d = new Point3d(2.3f, 3.4f, 4.5f);
		System.out.println(p3d);
		System.out.println("________________________________________________"); 
		
		p3d.setX(1.0f);
		p3d.setY(2.0f);
		p3d.setZ(3.1f);
		System.out.println(p3d);
		 
		System.out.println("________________________________________________"); 
		
		p3d.setXYZ(2f, 3.5f, 4.9f);
		System.out.println(p3d);
	}

}
