import java.util.*;

class vehicle
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		car car[] = new car[20];
		van van[] = new van[20];
		wheel wheel[] = new wheel[20];
		
		
		int count1=-1,count2=-1,count3=-1;
		int x=2;



		while(x!=1)
		{

			System.out.println("\n                                         Car park management system \n");
			System.out.println("                                                      MENU\n");
			System.out.println(" 						1.Enqueue vehicle");
			System.out.println("						2.view Details");
			System.out.println("						3.Dequeue vehicle");
			System.out.println("						4.Exit");

			System.out.printf("Enter your selection : ");
			String select = scan.nextLine();
			switch(select)
			{

				case "1":
				{
					while(x!=1)
					{
						int count=0;
						System.out.printf("Enter vehicle model : ");
						String option = scan.nextLine();

						switch(option)
						{
						 	case "car":
						 	{
						 		count++;
						 		count1++;
						 		System.out.printf("Number plate : ");
						 		String numplate = scan.nextLine();
						 		System.out.printf("car model : ");
						 		String model = scan.nextLine();
						 		System.out.printf("car color : ");
						 		String color = scan.nextLine();

						 		car[count1] = new car();
						 		car[count1].set_numplatecar(numplate);
						 		car[count1].set_modelcar(model);
						 		car[count1].set_colorcar(color);
						 		System.out.println("Enqueue successfully!");

						 		
						 	}
						 	break;

						 	case "van":
						 	{
						 		count++;
						 		count2++;
						 		System.out.printf("Number plate : ");
						 		String numplate = scan.nextLine();
						 		System.out.printf("van model : ");
						 		String model = scan.nextLine();
						 		System.out.printf("color : ");
						 		String color = scan.nextLine();
						 		
						 		van[count2] = new van();
						 		van[count2].set_numplatevan(numplate);
						 		van[count2].set_modelvan(model);
						 		van[count2].set_colorvan(color);
						 		System.out.println("Enqueue successfully!");

						 		

						 	}

						 	case "wheel":
						 	{
						 		count++;
						 		count3++;
						 		System.out.printf("Number plate : ");
						 		String numplate = scan.nextLine();
						 		System.out.printf("wheel model : ");
						 		String model = scan.nextLine();
						 		System.out.printf("color : ");
						 		String color = scan.nextLine();

						 		wheel[count3] = new wheel();
						 		wheel[count3].set_numplatewheel(numplate);
						 		wheel[count3].set_modelwheel(model);
						 		wheel[count3].set_colorwheel(color);

						 		System.out.println("Enqueue successfully!");

						 		
						 	}
						 	break;

						 	default:
						 	{
						 		System.out.println("Wrong input!");
						 		
						 	}
						}
						if(count>0)
						{
							break;
						}
					}
				}
				break;

				case "2":
				{
					if(count1>=0)
					{
						for(int i=0;i<=count1;i++)
						{
							
							System.out.println("numberplate : " + car[i].get_numplatecar());
							System.out.println("car model : " + car[i].get_modelcar());
							System.out.println("color : " + car[i].get_colorcar());

						}
					}

					if(count2>=0)
					{
						for(int j=0;j<=count2;j++)
						{
							System.out.println("numberplate : " + van[j].get_numplatevan());
							System.out.println("van model : " + van[j].get_modelvan());
							System.out.println("color : " + van[j].get_colorvan());
							

						}
					}

					if(count3>=0)
					{
						for(int k=0;k<=count3;k++)
						{
							System.out.println("numberplate : " + wheel[k].get_numplatewheel());
							System.out.println("wheel model : " + wheel[k].get_modelwheel());
							System.out.println("color : " + wheel[k].get_colorwheel());

						}
					}
					int m=count1+count2+count3+3;
					System.out.printf("Number of occupied slots : %d\n",m);
					System.out.printf("Number of free slots : %d",20-m);


				}
				break;

				case "3":
				{
					int n;
					String p;
					int t;
					System.out.printf("Enter Vehicle licen number : ");
					String dt = scan.nextLine();

					if(count1>=0)
					{
						
						for(n=0;n<=count1;n++)
						{
							p = car[n].get_numplatecar();
							if(dt.equals(p))
							{
								
								for(t=n;t<19;t++)
								{
									car[t]=car[t+1];
								}

								count1--;
								System.out.println("Dequeue successfully!");
							}

						}
					}

					if(count2>=0)
					{
						
						for(n=0;n<=count2;n++)
						{
							p = van[n].get_numplatevan();
							if(dt.equals(p))
							{
							
								for(t=n;t<19;t++)
								{
									van[t]=van[t+1];
								}

								count2--;
								System.out.println("Dequeue successfully!");
							}

						}
					}

					if(count3>=0)
					{
						
						for(n=0;n<=count3;n++)
						{
							p = wheel[n].get_numplatewheel();
							if(dt.equals(p))
							{
							
								for(t=n;t<19;t++)
								{
									wheel[t]=wheel[t+1];
								}

								count3--;
								System.out.println("Dequeue successfully!");
							}

						}
					}

				}
				default:
			 	{
			 		System.out.println("Wrong input!");
			 		break;
			 	}

			}

		}
		 
	}
}