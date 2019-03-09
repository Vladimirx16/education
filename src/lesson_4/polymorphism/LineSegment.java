package lesson_4.polymorphism;

public class LineSegment extends Point { // Класс линии
    private double segmentLength = 10;
    public double getSegmentLength(){
        return segmentLength;
    }
    public void setSegmentLength(double segmentLength){
        if (segmentLength < 0){
            System.out.println("Задано некорректное значение.");
        }else{
            this.segmentLength = segmentLength;
        }
    }
    public double getSquare(){
        return 0;
    }
    public double getPerimeter(){
        return segmentLength;
    }
    public String getDescription(){
        return("Отрезок длиной " + segmentLength + " сантиметров.");
    }
}
