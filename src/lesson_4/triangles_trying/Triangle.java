package lesson_4.triangles_trying;

public class Triangle {
    private double sideA = 0, sideB = 0, sideC = 0, perimeter = 0, square = 0;
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }
    public double getSideC(){
        return sideC;
    }
    public void setSideA(double sideA){
        if (sideA < 0){
            System.out.println("Введено некорректное значение!");
        }else{
            this.sideA = sideA;
        }
    }
    public void setSideB(double sideB){
        if (sideB < 0){
            System.out.println("Введено некорректное значение!");
        }else{
            this.sideB = sideB;
        }
    }
    public void setSideC(double angleAB){
        if (sideC < 0){
            System.out.println("Введено некорректное значение!");
        }else{
            this.sideC = angleAB;
        }
    }
    public double getPerimeter(){
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }
    public double getSquare(){
        square = sideA * sideB * sideC;
        return square;
    }
}
