import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class details
{
	public String name;
	public int age,salary,id;
	
	public details(String name,int age,int salary,int id)  //constructor
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.id=id;
	}
}

class assignBudget
{
	public int id;
	public int trans,food,medical,other,total;
	public int assign(int id)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\n******************Enter Your Expenditure*****************");
		System.out.print("Spended in Transportation:");
		trans=sc.nextInt();
		
		System.out.print("Spended in Food:");
		food=sc.nextInt();
		
		System.out.print("Spended in Medical:");
		medical=sc.nextInt();
		
		System.out.print("Other Expenditure:");
		other=sc.nextInt();
		
		total=trans+food+medical+other;
		return total;
		
		// input id from userid
		// check id's positon in array for ex. if id's position is 2 then we will get the salary of  2nd index from array and show the salary to user
		//  input all expenses from user, add it and show it to the user.
	}
}





class TotalBudget
{
	
	public static void main(String args[]) throws IOException 
	{
	
		String name;
		int age,salary,id;
		int tot=0;
	
		details ds[]=new details[2];
		
		Scanner sc=new Scanner(System.in);
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("********************************************************");
		System.out.print("\nEnter UserID:");
		
		String userid=sc.nextLine();
		
		System.out.print("Enter Password:");
		
		String password=sc.nextLine();
		
		
		if(userid.equals("peakperformers") && password.equals("2013909"))
		{
			System.out.print("\n\n***************Successfully LoggedIn***************");
			
			
			/////////////////creating object of details class//////////////////
			
			System.out.print("\n**************Enter Employee Details****************\n");
			
			
			
			// DECLARATION**********************
			
				
		
				//Scanner sc=new Scanner(System.in);
				for(int i=0;i<=1;i++)
				{
					System.out.print("Enter Employee Name:");
					name=reader.readLine();
					
					System.out.print("Enter Employee Age:");
					age=sc.nextInt();
					
					System.out.print("Enter Employee Salary:");
					salary=sc.nextInt();
					
					System.out.print("Enter Employee Id:");
					id=sc.nextInt();
					
					System.out.print("******************************");
					
					ds[i]=new details(name,age,salary,id);
				}
				
				//System.out.print(ds[0].id);    this will print id in zero's position
				
				System.out.print("******************************");
				System.out.print("\n1. Add More Employee Expenditure");
				System.out.print("\n2. Display All Details");
				System.out.print("\n3. Exit");
				while(true)
				{
					System.out.print("Enter Your Choice:");
					int ch=sc.nextInt();
					switch(ch)
					{
						case 1:
								System.out.print("Enter Employee Id:");
								int newId=sc.nextInt();
								for(int i=0;i<=1;i++)
								{
									if(ds[i].id==newId)
									{
										System.out.print("Employee Name:"+ds[i].name);
										System.out.print("\nEmployee Salary:"+ds[i].salary);
										assignBudget as=new assignBudget();
										
										tot=tot+as.assign(ds[i].id);  //  this is the total budget
										//System.out.print(tot);
										
										continue;
									}
								}
								
								break;
						case 2:
								display(tot,ds);
								break;
						case 3:
							    System.exit(0);
					}
				}
				
				
				
			
			
		}
		else
		{
			System.out.print("\n*********Incorrect UserId or Password*********");
		}
		
		//display total budget
		
			
		
		
	}
		
	
	
	public static void display(int tot,details ds[])
	{
		int total=tot;
		System.out.print("Name\t\tAge\t\tSalary\t\tId");
		for(int i=0;i<=(ds.length)-1;i++)
		{
			
			System.out.println("\n"+ds[i].name+"\t\t"+ds[i].age+"\t\t"+ds[i].salary+"\t\t"+ds[i].id);
		}
		System.out.print("\n\nTotal Budget is:"+total);
		//System.out.print("total:"+total+"name:"+n+"age:"+age+"salary:"+sal+"id:"+id);
	}
	
}
