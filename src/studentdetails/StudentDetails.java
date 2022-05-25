
package studentdetails;


public class StudentDetails {
   //printing 3 student details, use aray of objects
   
    public static void main(String[] args) {
      
     Student[] studentlist = new Student[3]; //array of objects
     
     Student s1 = new Student();
     Student s2 = new Student();
     Student s3 = new Student();
     s1.setName("John");
     s1.setAge(20);
     s2.setName("John");
     s2.setAge(20);
     s3.setName("John");
     s3.setAge(20);     
     
     //stored objects in array
     studentlist[0] = s1;
     studentlist[1] = s2;
     studentlist[3] = s3;
     for(int i=0; i<=studentlist.length; i++)
     System.out.println(studentlist[i].getName() + "+studentlist[i].getAge()");
    }
    
}
