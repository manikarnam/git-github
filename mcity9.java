class StudentDetails{

int sid;
 
String name;
int rollno;

StudentDetails(int i,String r,int n){

sid=i;
name=r;
rollno=n;
}
void display(){

System.out.println(sid +" "+name+" "+rollno);

}

public static void main(String [] rags){

StudentDetails sd=new StudentDetails(101,"manibabu",1246255);
sd.display();

}



}