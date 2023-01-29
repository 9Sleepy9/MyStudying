package MyOwnQuests;

class Vector {

    private final double x, y, z;

    public Vector (double x1, double y1, double z1) {

        x = x1;
        y = y1;
        z = z1;

    }

    double VectorLength () {
        return ( Math.sqrt(x*x + y*y + z*z) );
    }

    double VectorDot (Vector obj) {
        return ( x*obj.x + y*obj.y + z*obj.z );
    }

    Vector VectorCross (Vector obj) {

        double NewX = y*obj.z - z*obj.y;
        double NewY = z*obj.x - x*obj.z;
        double NewZ = x*obj.y - y*obj.x;

        return new Vector(NewX, NewY, NewZ);
    }

    double VectorAngle (Vector obj) {

        double v1 = VectorLength();
        double v2 = obj.VectorLength();

        double vd = VectorDot(obj);

        return ( vd / (v1 * v2) );
    }

    Vector VectorSum (Vector obj) {

        double NewX = x + obj.x;
        double NewY = y + obj.y;
        double NewZ = z + obj.z;

        return new Vector(NewX, NewY, NewZ);

    }

    Vector VectorDifference (Vector obj) {

        double NewX = x - obj.x;
        double NewY = y - obj.y;
        double NewZ = z - obj.z;

        return new Vector(NewX, NewY, NewZ);

    }

    public static Vector[] NewVectors (int n) {

        Vector[] NewV = new Vector[n];

        for (int i = 0; i < n; i++) {
            NewV[i] = new Vector(Math.random()*10, Math.random()*10, Math.random()*10);
        }

        return NewV;
    }

    public String toString() {

        return ( "Vector { " + "x = " + x + ", y = " + y + ", z = " + z + " }");

    }

    public static void main(String[] args) {

    }

}
