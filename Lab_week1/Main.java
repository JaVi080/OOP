public class Main{
public static void main(String arg[]){

Rectangle a=new Rectangle();
Circle c=new Circle();

int area=a.calArea();
int parameter=a.calParameter();

double circumference=c.circum();
double area_cir=c.area();

System.out.printf("Area of Rectangle : %d and Parameter : %d\n",area,parameter);
System.out.printf("Area of Circle : %.2f and Circumference : %.2f",area_cir,circumference);

}
}