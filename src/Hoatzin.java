
public class Hoatzin extends Bird
	{
int num=11;
		public Hoatzin()
			{
				
			}
		
		public void stinkBird()
			{
			System.out.println("Stinkbird, also known as Hoatzin, are found throughout the Amazon in northern and central South America ");
			}

		public void birdsOfPrey()
			{
			System.out.println("the Hoatzin, is part of the species, birds of prey, also known as raptors");
			}
		
		public void printDisplayMessages()
			{
				birdsOfTheEverglades();
				super.birdsOfPrey();
				stinkBird();
			}
		public void printNumber_lifeSpan()
			{
			System.out.println("The lifespan of the Haotzin is " + num);
			}
	}

