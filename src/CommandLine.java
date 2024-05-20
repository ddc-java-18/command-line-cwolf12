public class CommandLine 
{
	public static void main(String[] args)
		{
			for (String arg:args)
			{
				double F = Double.parseDouble(arg);
				double C = convertF2C(F);
				System.out.printf("F = %.2f; C = %.2f%n", F, C);
			}
		}
		
	private static double convertF2C(double fahrenheit)
	{
		return 5/9d * (fahrenheit - 32);
	}
		
}
