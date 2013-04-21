package ru.shadrin.lab5;
import ru.shadrin.lab5.interfaces.Symmetry;
import ru.shadrin.lab5.interfaces.Translation;
public abstract class EquationOfHyperplane implements Symmetry, Translation{
      public abstract int dimension();
      private int id;
      private String name;
      private double a;
      private double b;
      static int nextId=1;
    { id = nextId++; }
    
          
         
      public double getA(){
          return a;
      }
      public void setA(double a){
	  this.a=a;
      }
	   
      public void setB(double b){
          this.b=b;
      }
	   
      public double getB(){
          return b;
      }
      
      public String getName(){
          return name;
      }
    
      public void setName(String name){
          this.name=name;
      }
      
      public int getId(){
          return id;
      }
     
}
