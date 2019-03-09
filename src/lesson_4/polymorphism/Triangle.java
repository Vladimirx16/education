package lesson_4.polymorphism;

public class Triangle extends Point { // Класс треугольник
    private double sideA = 3, sideB = 4, sideC = 5;
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return  sideB;
    }
    public double getSideC(){
        return sideC;
    }
    public void setSideA(double sideA){
        this.sideA = sideA;
    }
    public void setSideB(double sideB){
        this.sideB = sideB;
    }
    public void setSideC(double sideC){
        this.sideC = sideC;
    }
    public double getSquare(){
        return(sideA * sideB * sideC);
    }
    public double getPerimeter(){
        return(sideA + sideB + sideC);
    }
    public String getDescription(){
        return("Треугольник со сторонами " + sideA + ", " + sideB + ", " + sideC + ", ");
    }
}
