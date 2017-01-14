public class Planet{
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	public Planet(double xP, double yP, double xV,
					double yV, double m, String img)
	{
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass = m;
		imgFileName = img;
	}

	public Planet(Planet P)
	{
		xxPos = P.xxPos;
		yyPos = P.yyPos;
		xxVel = P.xxVel;
		yyVel = P.yyVel;
		mass = P.mass;
		imgFileName = P.imgFileName;
	}

	public double calcForceExertedByX(Planet P)
	{
			//G = 6.67  * 10^-11
			//F = G*m1*m2/r^2
			//r = dx^2 + dy^2
			//Fx = F * dx/r 
		double dx = P.xxPos - xxPos;
		double r = calcDistance(P);
		if(r==0)
		{
			return 0;
		}
		double F = calcForceExertedBy(P);
		return (F * dx / r);
	}

	public double calcForceExertedByY(Planet P)
	{

			//Fy = F * dy/r 

		double dy = P.yyPos - yyPos;
		double r = calcDistance(P);
		if(r==0)
		{
			return 0;
		}
		double F = calcForceExertedBy(P);
		return (F * dy / r);
	}

	public double calcDistance(Planet P)
	{
		double dx = 0.0;
		double dy = 0.0;
		double r = 0.0;
		dx = P.xxPos - xxPos;
		dy = P.yyPos - yyPos;
		r = Math.sqrt(dx * dx + dy * dy);
		return r;
	}

	public double calcForceExertedBy(Planet P)
	{
			//G = 6.67  * 10^-11
			//F = G*m1*m2/r^2
			//r = dx^2 + dy^2
			//Fy = F * dy/r 
		double F = 0.0;
		double G = 6.67e-11;
		double r = 0.0;
		r = calcDistance(P);
		if(r==0)
		{
			return 0;
		}
		F = G * mass * P.mass / (r * r);
		return F;
	}

	public double calcNetForceExertedByX(Planet [] Planets)
	{

		double netForce = 0.0;
		for(Planet P : Planets)
		{
			netForce += calcForceExertedByX(P);
		}
		return netForce;
	}

	public double calcNetForceExertedByY(Planet [] Planets)
	{

		double netForce = 0.0;
		for(Planet P : Planets)
		{
			netForce += calcForceExertedByY(P);
		}
		return netForce;
	}

	public void update(double dt, double Fx, double Fy)
	{
		double accelerationX = 0.0;
		double accelerationY = 0.0;
		accelerationX = Fx / mass;
		accelerationY = Fy / mass;
		xxVel = xxVel + dt * accelerationX;
		yyVel = yyVel + dt * accelerationY;

		xxPos = xxPos + xxVel * dt;
		yyPos = yyPos + yyVel * dt;
	}

	public void draw()
	{
		StdDraw.picture(xxPos, yyPos, imgFileName);
		StdDraw.show(10);
	}
}