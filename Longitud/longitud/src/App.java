import java.util.Scanner;

public class App {
    //metodo crearLongitud para iniciar longitudes con sus unidades correspondientes
    private static Longitud crearLongitud(Scanner in) {
        System.out.print("Introduce la distancia: ");
        double cantidad = in.nextDouble();
        System.out.println("Elige la unidad");
        System.out.println("1. Metro (m)");
        System.out.println("2. Pulgada (in)");
        System.out.println("3. Pie (ft)");
        System.out.println("4. Yarda (yd)");
        int unidadOpcion = in.nextInt();

        UnidadLongitud unidad = null; //inicia una variable vacia
        switch (unidadOpcion) {
            case 1:
                unidad = UnidadLongitud.metros;
                break;
            case 2:
                unidad = UnidadLongitud.pulgadas;
                break;
            case 3:
                unidad = UnidadLongitud.pies;
                break;
            case 4:
                unidad = UnidadLongitud.yardas;
                break;
            default: //si se introduce un numero que no esta entre el 1 y el 4, se pondrá metros por defecto
                System.out.println("Unidad no valida. Se implementarán metros por defecto");
                unidad = UnidadLongitud.metros;
                break;
        }
        return new Longitud(cantidad, unidad);
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

    while (true) {
        System.out.println("Menu:");
            
            System.out.println("\n1. Crear Longitud");
            System.out.println("2. Sumar Longitudes");
            System.out.println("3. Restar Longitudes");
            System.out.println("4. Multiplicar Longitud");
            System.out.println("5. Dividir Longitud");
            System.out.println("6. Comparar Longitudes");
            System.out.println("7. Mostrar Longitud en Metros");
            System.out.println("8. Salir");
            System.out.print("\nElige una opción: ");
            int option = in.nextInt();
            
            if (option == 8) {
                break;
            }

        Longitud l1 = null;
        Longitud l2 = null;

        switch (option) {
            case 1:
                l1 = crearLongitud(in);
                System.out.println("Longitud creada: " + l1);
                break;
            case 2:
                l1 = crearLongitud(in);
                l2 = crearLongitud(in);
                System.out.println(l1.add(l2));
            case 3:
                l1 = crearLongitud(in);
                l2 = crearLongitud(in);
                System.out.println(l1.substract(l2));
                break;
            case 4:
                l1 = crearLongitud(in);
                l2 = crearLongitud(in);
                System.out.println(l1.multiply(l2));
                break;
            case 5:
                l1 = crearLongitud(in);
                l2 = crearLongitud(in);
                System.out.println(l1.divide(l2));
                break;
            case 6:
                l1 = crearLongitud(in);
                l2 = crearLongitud(in);
                    if (l1.compareTo(l2) == 0) {
                        System.out.println(l1 + " es igual que " + l2);
                    }else if (l1.compareTo(l2) == 1) {
                        System.out.println(l1 + " es mayor que " + l2);
                    }else {
                        System.out.println(l1 + " es menor que " + l2);
                    } 
                break;
            case 7:
                l1 = crearLongitud(in);
                System.out.println(l1.valorEnMetros());
                break;
            default:
                break;
            }
        }in.close();
    }
}
