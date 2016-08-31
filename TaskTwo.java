abstract class Shape
   {
     double PI=3.1415;
     String color;
     boolean filled;
  
     Shape()
      {
        System.out.println("this is the Shape class");
      }
  
     Shape(String color,boolean filled)
     {
       this();
       this.color=color;
       this.filled=filled;
     }
   
    String getColor()
     {
       return color;
     }
  
    void setColor(String color)
     {
       this.color=color;
     }
    
     boolean isFilled()
     {
       return filled;
     }
    
    void setFilled(boolean filled)
     {
      this.filled=filled; 
     }
  
    abstract double getArea();
    abstract double getPerimeter();

    public String toString()
      {
        return color+filled;
      }
  }

class Circle extends Shape
    {
      double radius;
      
      Circle()
        {
          System.out.println("This is the circle class");
        }
         
      // Circle(double radius)
        //{
         // this();
         // this.radius=radius;
      //  }
 
        Circle(double radius,String color,boolean filled)
         {
           super(color,filled);
           //this(radius);
           this.radius=radius;
           this.color=color;
           this.filled=filled;
         }
 
        double getRadius()
         {
            return radius;
         }
 
         void setRadius(double radius)
          {
             this.radius=radius;
          }

         double getArea()
          {
            return PI*radius*radius;
          }
          
          double getPerimeter()
          {
            return 2*PI*radius;
          }
          
          public String toString()
           {
             return "Color:\t"+color+"\tFilled:\t"+filled+"\tRadius:\t"+radius;
           }
  }

class Rectangle extends Shape
  {
    double width;
    double length;

    Rectangle()
     {
       System.out.println("The class is Rectangle "); 
     }
     
    Rectangle(double width,double length)
     {
      this.width=width;
      this.length=length;
     }
    
    Rectangle(double width,double length,String color,boolean filled)
     {
       super(color,filled);
       this.width=width;
       this.length=length;
       this.color=color;
       this.filled=filled;
     }
    
    double getWidth()
      {
        return width;
      }
      
    void setWidth(double width)
     {
       this.width=width;
     }
   
    double getLength()
      {
        return length;
      }
      
    void setLength(double length)
     {
       this.length=length;
     }

    double getArea()
     {
       return length*width;
     }
   
     double getPerimeter()
     {
      return 2*(length+width);
     }
    
     public String toString()
      {
        return "Area of Rect:\t"+getArea()+"Perimeter of Rect:\t"+getPerimeter();
      }

  }

class TaskTwo 
   {
      public static void main(String args[])
       {
         Circle ob=new Circle(6,"blue",true);

          System.out.println(ob.toString());

          System.out.println("The Area of Circle is:\t"+ob.getArea());
    
          System.out.println("The Perimeter of Circle is:\t"+ob.getPerimeter());
        
	Rectangle ob1=new Rectangle(4,6,"blue",true);

          System.out.println(ob.toString());
         
          System.out.println("====================================");

          System.out.println("The Area of Circle is:\t"+ob1.getArea());
    
          System.out.println("The Perimeter of Circle is:\t"+ob1.getPerimeter());
	}
   }

  
