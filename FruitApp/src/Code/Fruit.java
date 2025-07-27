/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author user
 */
public class Fruit {
    private String name;
    private String type;
    private String color;
    private String imagePath;
    
    
    //constructor 01
   public Fruit(String name,String type,String color){
    this.name = name;
    this.type = type;
    this.color = color;
    
}

    //constructor 02
    public Fruit(String name,String type,String color, String imagePath){
    this.name = name;
    this.type = type;
    this.color = color;
    this.imagePath = imagePath;
  
}
   
    //getters 
  public String getName(){
      return name;
  } 
  public String getType(){
      return type;
  } 
  public String getColor(){
      return color;
  } 
  public String getPath(){
      return imagePath;
  } 
   
   
   
    
}
