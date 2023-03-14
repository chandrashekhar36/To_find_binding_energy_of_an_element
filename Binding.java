package binding;
import java.util.*;
public class bind {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double av=15.8, as=18.33, ac=0.714, aa=23.2;
		double p=0.666666666, p1=0.3333333333;
		System.out.println("enter mass number");
		double a=in.nextDouble();
		System.out.println("enter atomic number");
		double z=in.nextDouble();
		if(a%2==0&&z%2==0)
		{
			double bi=11.2;
			double volume=av*a;
			double surface=as*Math.pow(a,p);
			double coulomb=ac*Math.pow(z,2)/Math.pow(a,p1);
			double asymmetric=aa*(Math.pow(a-2*z,2))/a;
			double bind=volume-surface-coulomb-asymmetric+bi;
			double bind1=bind/a;
			if(bind1<0);
			{
			System.out.println("volume energy ="+volume);
			System.out.println("Surface energy = "+surface);
			System.out.println("Coulomb energy = "+coulomb);
			System.out.println("Asymmetric energy = "+asymmetric);
			System.out.println("Binding energy = "+bind);
			System.out.println("binding energy = "+bind1);
			}
			 if(bind1<0);
			{
				System.out.println("enter incorrect data");
			}
		}
		else if(a%2==0||z%2==0)
		{
			double bi=0;
			double volume=av*a;
			double surface=as*Math.pow(a,p);
			double coulomb=ac*Math.pow(z,2)/Math.pow(a,p1);
			double asymmetric=aa*(Math.pow(a-2*z,2))/a;
			double bind=volume-surface-coulomb-asymmetric+bi;
			double bind1=bind/a;
			System.out.println("volume energy ="+volume);
			System.out.println("Surface energy = "+surface);
			System.out.println("Coulomb energy = "+coulomb);
			System.out.println("Asymmetric energy = "+asymmetric);
			System.out.println("Binding energy = "+bind);
			System.out.println("binding energy = "+bind1);
		}
		else
		{
			double bi=11.2;
			double volume=av*a;
			double surface=as*Math.pow(a,p);
			double coulomb=ac*Math.pow(z,2)/Math.pow(a,p1);
			double asymmetric=aa*(Math.pow(a-2*z,2))/a;
			double bind=volume-surface-coulomb-asymmetric-bi;
			double bind1=bind/a;
			System.out.println("volume energy ="+volume);
			System.out.println("Surface energy = "+surface);
			System.out.println("Coulomb energy = "+coulomb);
			System.out.println("Asymmetric energy = "+asymmetric);
			System.out.println("Binding energy = "+bind);
			System.out.println("binding energy = "+bind1);
		}
	}

}
