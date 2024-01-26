import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /**
     * @param args the command line arguments
     */
    //carry out calculations or circular items
    //such as a circle, a sphere, a cone, a column
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates round item numbers such as \n" +
                "1 - Area of a circle (pi r^2)\n" +
                "2 - Volume of a sphere (4/3 pi r^3)\n" +
                "3 - Volume of a cone (pi r^2 h/3)\n" +
                "4 - Volume of a column (pi r^2 h)");
        System.out.println("Type the number for which one you want to calculate");
        int i = s.nextInt();
        //renamed each of the methods names to match the number picked by the user to make it easier to understand code
        if (i == 1){
            Calc1();
        }else if (i == 2){
            Calc2();
        }else if(i == 3){
            cCalc3();
        }else if(i == 4){
            cCalc4();
        }
    }

    public static void cCalc4(){
        // have to add scanners to be able to get value from user
        Scanner s = new Scanner(System.in);
        //originally asked for height and radius of cone, but this method is used for finding the volume of a column
        //separated the statements asking for height and radius
        System.out.println("enter the radius of your column: ");
        //make each variable a double instead of an int
        double r = s.nextDouble();
        System.out.println("then enter the height of your column: ");
        // added double h variable
        double h = s.nextDouble();
        // cant use math.pow, instead multiply r*r
        double result = Math.PI * (r*r) * h;
        System.out.println(result);
    }

    public static void cCalc3(){
        // have to add scanners to be able to get value from user
        Scanner s = new Scanner(System.in);
        //separated the statements asking for height and radius
        System.out.println("enter the radius of your cone: ");
        //make each variable a double instead of an int
        double r = s.nextDouble();
        System.out.println("enter the height of your cone: ");
        double h = s.nextDouble();
        //must multiply variables individually instead of using math.pow
        double result = (22*r*r*h)/(3*7);
        // originally had r being printed out, but r is not the name of the double variable that outputs the radius of the circle, changed to result
        System.out.println(result);
    }

    public static void Calc1(){
        // have to add scanners to be able to get value from user
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of your circle");
        //make variable a double instead of an int
        double r = s.nextDouble();
        //must multiply variables individually instead of using math.pow
        double result = Math.PI * (r*r);
        System.out.println(result);
    }

    public static void Calc2(){
        // have to add scanners to be able to get value from user
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of your sphere: ");
        //make variable a double instead of an int
        double r = s.nextDouble();
        double result = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        // originally had r being printed out, but r is not the name of the double variable that outputs the radius of the circle, changed to result
        System.out.println(result);
    }
}
