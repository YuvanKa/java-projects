import java.util.Scanner;
class Hotel2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\n\t\t\tWelcome To Swiggy");
		System.out.println("-------------------------------------------------------------------------\n");
		System.out.println("\t\t      Choose the Hotel Name");
		System.out.println("1. Buhari\n2. A2B\n");
		System.out.print("Enter Your Choice :");
		int a=sc.nextInt();
		int Choice_of_food,Quantity_of_food,Total_amount,Mode_of_payment,Pin_number,Amount;
		switch (a)
		{
		case 1:{
			System.out.println("\t\t\tGreeting From Buhari");
			System.out.println("-------------------------------------------------------------------------\n");
			System.out.println("\tSelect the Menu\nItems\t\t\tPrice\n1. Mutton Biryani\t340\n2. Chicken Biryani\t140\n3. Prawn Biryani\t240");
			System.out.print("Enter the Food option :");
			Choice_of_food=sc.nextInt();
			System.out.println("Preparing.....\n");
			Thread.sleep(1000);
			switch (Choice_of_food)
			{
			case 1: 
				{
				System.out.print("Select the Quantity of Mutton Biryani :");
				Quantity_of_food=sc.nextInt();
				Total_amount=(Quantity_of_food*340);
				System.out.println("Total Amount :"+Total_amount);
				System.out.println("Select Payment mode:\n1. G-Pay\n2.PhonePe");
				Mode_of_payment=sc.nextInt();
				switch (Mode_of_payment)
				{
				case 1:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.print("Enter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
				case 2:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.print("Enter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
					default :{System.out.println("Invalid Input :"); break;}
				}
				break;}
			case 2: 
				{
				System.out.print("Select the Quantity of Chicken Biryani :");
				Quantity_of_food=sc.nextInt();
				Total_amount=(Quantity_of_food*140);
				System.out.println("Total Amount :"+Total_amount);
				System.out.println("Select Payment mode:\n1. G-Pay\n2.PhonePe");
				Mode_of_payment=sc.nextInt();
				switch (Mode_of_payment)
				{
				case 1:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------\n");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.print("\t\t\tEnter The OTP");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------\n");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
				case 2:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.print("Enter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
					default :{System.out.println("Invalid Input :"); break;}
				}
				break;}
			case 3: 
				{
				System.out.print("Select the Quantity of Prawn Biryani :");
				Quantity_of_food=sc.nextInt();
				Total_amount=(Quantity_of_food*240);
				System.out.println("Total Amount :"+Total_amount);
				System.out.println("Select Payment mode:\n1. G-Pay\n2.PhonePe");
				Mode_of_payment=sc.nextInt();
				switch (Mode_of_payment)
				{
				case 1:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.print("Enter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
				case 2:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.print("Enter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
					default :{System.out.println("Invalid Input :"); break;}
				}
				break;}
			default : System.out.println("Invalid Hotel menu"); break;
			}
			break;
		}
		case 2:{
			System.out.println("\t\t\tGreeting from A2B");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("\t\t\tSelect the Menu\n\t\t       S.No Items\tPrice\n\t\t       1.   Idli\t10\n\t\t       2.   Vada\t10\n\t\t       3.   Pongal\t25");
			System.out.print("Enter the Food option :");
			Choice_of_food=sc.nextInt();
			System.out.println("Preparing.....\n");
			Thread.sleep(1000);
			switch (Choice_of_food)
			{
			case 1: 
				{
				System.out.print("Select the Quantity of Idli :");
				Quantity_of_food=sc.nextInt();
				Total_amount=(Quantity_of_food*10);
				System.out.println("Total Amount :"+Total_amount);
				System.out.println("Select Payment mode:\n1. G-Pay\n2.PhonePe");
				Mode_of_payment=sc.nextInt();
				switch (Mode_of_payment)
				{
				case 1:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.print("\t\t\tEnter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
				case 2:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.println("\t\t\tEnter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
					default :{System.out.println("Invalid Input :"); break;}
				}
				break;}
			case 2: 
				{
				System.out.print("Select the Quantity of Vada :");
				Quantity_of_food=sc.nextInt();
				Total_amount=(Quantity_of_food*10);
				System.out.println("Total Amount :"+Total_amount);
				System.out.println("Select Payment mode:\n1. G-Pay\n2.PhonePe");
				Mode_of_payment=sc.nextInt();
				switch (Mode_of_payment)
				{
				case 1:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------\n");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.print("\t\t\tEnter The OTP");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------\n");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
				case 2:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("Enter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.println("Enter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
					default :{System.out.println("Invalid Input :"); break;}
				}
				break;}
			case 3: 
				{
				System.out.print("Select the Quantity of Pongal :");
				Quantity_of_food=sc.nextInt();
				Total_amount=(Quantity_of_food*25);
				System.out.println("Total Amount :"+Total_amount);
				System.out.println("Select Payment mode:\n1. G-Pay\n2.PhonePe");
				Mode_of_payment=sc.nextInt();
				switch (Mode_of_payment)
				{
				case 1:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.print("Enter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
				case 2:{
					System.out.println("Redirecting to payment page............");
					Thread.sleep(3000);
					System.out.print("Enter you Secret Number :");
					Pin_number=sc.nextInt();
					Thread.sleep(1000);
					switch (Pin_number)
					{
					case 1234:{
						System.out.println("\t\t\tThe PassWord is Correct");
						System.out.print("\t\t\tEnter The Amount:");
						Amount=sc.nextInt();
						System.out.println("-------------------------------------------------------------------------");
						if (Amount==Total_amount)
						{
							System.out.println("Generating OTP...........");
							Thread.sleep(3000);
							int otp=(int)(Math.random()*9999+9999);
							System.out.println("The OTP is :"+otp);
							System.out.println("Enter the OTP :");
							int user_otp=sc.nextInt();
							System.out.println("-------------------------------------------------------------------------");
							Thread.sleep(3000);
							if (user_otp==otp)
							{
								System.out.println("Your food is Booked Successfully..........");
								Thread.sleep(3000);
								System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>FOOD IS ON THE WAY<<<<<<<<<<<<<<<<<<<<<<<");
								System.out.println("---------------------------------------------------------------------");
							}
							else
							{
								System.out.println("Payment is Failed");
								break;
							}
							
						}
						else { System.out.println("Payment is Failed"); break; }
						
						break;
						}
						default :
						{ System.out.println("The Security Pin is Wrong"); break;}
					}
					break;
					}
					default :{System.out.println("Invalid Input :"); break;}
				}
				break;}
			default : System.out.println("Invalid Hotel menu"); break;
			}
			break;
		}
		default :{
			System.out.println("Invalid Hotel Selection"); 
			break;
		}	
		
		}
	}
}