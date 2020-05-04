public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
//        super.setX(x);
//        super.setY(y);
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] XYZ = new float[3];
        XYZ[0]=getX();
        XYZ[1]=getY();
        XYZ[2]=getZ();
        return XYZ;
    }

    @Override
    public String toString() {
        return "Point 3D is a subclass of " + super.toString() + " and Z = " + getZ();
    }
}
