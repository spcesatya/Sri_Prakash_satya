class Person
 {

  String name,address;
    
   Person(String name,String address)
     { 
       this.name=name;
       this.address=address;
     }

   String getName()
     {
       return name;
     }

    String getAddress()
     {
       return address;
     }
 
    void setAddress(String address)
     {
       this.address=address;
     }

    public String toString()
     {
       return name+address;
     }
 }

class Student extends Person
   {
      String program;
      int year; 
      double fee;

      Student(String name,String address,String program,int year,double fee)
        {
          super(name,address);
          this.program=program;
          this.year=year;
          this.fee=fee; 
        }

      String getProgram()
       {
         return program;
       }

      void setProgram(String program)
       {
         this.program=program;
       }

      int getYear()
       {
         return year;
       }

      void setYear(int year)
       { 
         this.year=year;
       }

      double getFee()
       {
         return fee;
       }

      void setFee(double fee)
       { 
         this.fee=fee;
       }

      public String toString()
       { 
         return name+address+program+year+fee;
       }
   }

class Staff extends Person
  {
    String school;
    double pay;
    
     Staff(String name,String address,String school,double pay)
      {
          super(name,address);
        this.name=name;
        this.address=address;
        this.school=school;
        this.pay=pay;
      }

     String  getSchool()
      {
       return school;
      }

     void setSchool(String school)
      {
        this.school=school;
      }
     
     double getPay()
      {
        return pay;
      }
   
     void setPay(double pay)
      {
         this.pay=pay;
      }   
     
     public String toString()
      {
       return name+address+school+pay;
      }

  }
 
class TaskOne
   {
     public static void main(String args[])
      {
        Student stu=new Student("lucky","tuni","java-language",2015,4500);
                System.out.println("The student details :"+stu.toString());
        
        Staff stf=new Staff("Srinivas","Hyd","sriprakash",15000);
               System.out.println("The staff details :"+stf.toString());
        
      }
}