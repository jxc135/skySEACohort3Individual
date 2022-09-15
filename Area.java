import java.util.Scanner;

public class Area {
    private int length;
    private int breadth;

    public Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public Area(){
    }
    public int returnArea(){
        return this.length*this.breadth;
    }
    public void setLength(int length){
        this.length=length;
    }

    public int getLength(){
        return this.length;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }

    public int getBreadth(){
        return this.breadth;
    }

    public static void main(String[] args) {
        Area rectangle = new Area();

        System.out.println("Length:");

        Scanner scanner = new Scanner(System.in);

        int inputtedLength = scanner.nextInt();

        rectangle.setLength(inputtedLength);

        System.out.println("Breadth:");

        int inputtedBreadth = scanner.nextInt();

        rectangle.setBreadth(inputtedBreadth);

        System.out.println("Area:" + rectangle.returnArea());

    }
}
