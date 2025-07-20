class WeightsOnPlanets
{
	public static void main(String [] args)
	{
		java.util.Scanner inp = new java.util.Scanner(System.in);
		System.out.print("Enter the weight of object on Earth :");
		double we = inp.nextDouble();
		double wm,wj,ws,wv;
		wm = we*0.4;
		wv = we*0.9;
		wj = we*2.5;
		ws = we*1.1;
		System.out.println("Weight on Mercury :"+wm);
		System.out.println("Weight on Venus   :"+wv);
		System.out.println("Weight on Jupiter :"+wj);
		System.out.println("Weight on Saturn  :"+ws);
	}
}