package Day1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float PI=3.14f;
		System.out.println("1:Area of circle"+"\n"+"2:Area of square"+"\n"+"3:Area of right angled triangle"+
		"\n"+"4:Area of rectangle"+"\n"+"5:Circumference of circle"+"\n"+"6:Perimeter of square");
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("Enter radius :");
		int r=sc.nextInt();
		int area=(int) (PI*r*r);
		System.out.println("Area of circle is:"+area);
		break;
		case 2:System.out.println("Enter side of square:");
		int s=sc.nextInt();
		int area1=s*s;
		System.out.println("Area of square is:"+area1);
		break;
		case 3:System.out.println("Enter length and bridth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int area2=1/2*l*b;
		System.out.println("Area of right angled triangle is:"+area2);
		break;
		case 4:System.out.println("Enter length and bridth:");
		int ll=sc.nextInt();
		int bb=sc.nextInt();
		int area3=ll*bb;
		System.out.println("Area of rectangle is:"+area3);
		break;
		case 5:System.out.println("Enter radius:");
		int rad=sc.nextInt();
		float cir=2*PI*rad;
		System.out.println("Circumference of circle is:"+cir);
		break;
		case 6:System.out.println("Enter side of square:");
		int sid=sc.nextInt();
		int peri=4*sid;
		System.out.println("Perimeter of square is:"+peri);
		break;
		default:System.out.println("Enter valid input");
		
		
		}
	}

}
