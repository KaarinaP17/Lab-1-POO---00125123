import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvendios a la calculadora");

        Scanner sc = new Scanner(System.in);
        int option;

         do {

             System.out.printf("Usuario, eligue una de las siguientes opciones: 1.Sumar %n2.Restar %n3.Multiplicacion %n4.Division %n5.Salir %n");
             option = sc.nextInt();

             switch (option){
                 case 1:
                     //sumar
                     System.out.println("Escogiste la opción de sumar:)");
                     int a = sc.nextInt();
                     int b = sc.nextInt();
                     System.out.println(sumar(a, b));
                     break;
                 case 2:
                     //restar
                     System.out.println("Escogiste la opción de restar:)");
                     int c = sc.nextInt();
                     int d = sc.nextInt();
                     System.out.println(restar(c, d));
                     break;
                 case 3:
                     //multiplicación
                     System.out.println("Escogiste la opción de multiplicación:)");
                     int e = sc.nextInt();
                     int f = sc.nextInt();
                     System.out.println(multiplicar(e, f));
                     break;
                 case 4:
                     //división
                     System.out.println("Escogiste la opción de división:)");
                     float g = sc.nextInt();
                     float h = sc.nextInt();
                     System.out.println(division(g, h));
                     break;
                 case 5:
                     System.out.println("Usuario has salido del programa, gracias por utilizar el programa");
                     break;
                 default:
                     System.out.println("La opción que elegiste no existe.");

             }
         } while (option != 5);
    }
    public static int sumar(int a, int b){
        return a + b;
    }

    public static int restar(int c, int d){
        return c - d;
    }

    public static int multiplicar(int e, int f){
        return e * f;
    }

    public static float division(float g, float h){
        if (h == 0){
            System.out.println("La division no se puede realizar, ya que la division entre 0 no existe");
        }
        return g / h;
    }
}

