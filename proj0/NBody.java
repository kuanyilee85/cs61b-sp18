public class NBody {
    public static double readRadius(String s) {
        In in = new In(s);
        int countPlanets = in.readInt();
        double radiusUniversal = in.readDouble();

        return radiusUniversal;
    }

    public static Planet[] readPlanets(String s) {
        In in = new In(s);
        int count = in.readInt();
        Planet[] p = new Planet[count];
        double countPlanets = in.readDouble();
        for (int i = 0; i < count; i++) {
            double xP = in.readDouble();
            double yP = in.readDouble();
            double xV = in.readDouble();
            double yV = in.readDouble();
            double m = in.readDouble();
            String img = in.readString();
            p[i] = new Planet(xP, yP, xV, yV, m, img);
            System.out.println("Planet: " + img + ", @ coordinate: (" + xP + ", " + yP + "); initial velocity: (" + xV
                    + ", " + yV + ")");
        }
        return p;
    }

    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        double radius = readRadius(filename);
        Planet[] p = readPlanets(filename);

        System.out.println(radius);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p);
        }
    }
}