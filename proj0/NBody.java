public class NBody{

	public static double readRadius(String inputFile)
	{
		double radius = 0.0;
		In in = new In(inputFile);
		in.readLine();
		radius = in.readDouble();
		return radius;
	}

	public static Planet [] readPlanets(String inputFile)
	{
		int numberOfPlanets = 0;

		In in = new In(inputFile);

		numberOfPlanets = in.readInt();
		in.readDouble();

		Planet [] Planets = new Planet[numberOfPlanets]; 

		for(int i=0 ; i<numberOfPlanets ; i++)
		{
			Planets[i] = new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
		}
		return Planets;
	}

	public static void main(String [] args)
	{
		double T = Double.parseDouble(args[0]);
		double dt = Double.parseDouble(args[1]);
		String filename = args[2];
		double radius = readRadius(filename);
		Planet [] Planets = readPlanets(filename);

		String backgroundImage = "./images/starfield.jpg";
		StdDraw.setScale(-radius, radius);
		StdAudio.play("./audio/2001.mid");

		for(double i = 0; i<T; i = i+dt)
		{
			double [] Fx = new double[Planets.length];
			double [] Fy = new double[Planets.length];
			int j=0;
			for(Planet P:Planets)
			{
				Fx[j] = P.calcNetForceExertedByX(Planets);
				Fy[j] = P.calcNetForceExertedByY(Planets);
				j++;
			}
			j=0;

			for(Planet P:Planets)
			{
				P.update(dt, Fx[j], Fy[j]);
				j++;
			}
		StdDraw.clear();
		StdDraw.picture(0, 0, backgroundImage);
		StdDraw.show();

		for(Planet P : Planets)
		{
			P.draw();
		}
		}
	}
}