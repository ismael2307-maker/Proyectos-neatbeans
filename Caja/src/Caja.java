

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Caja {

    public static int cd, vu, op, operacion, ope, opera;
    public static int tf = 0;
    public static int td = 0;
    public static int cl = 2307;
    public static int in = 0;
    public static int cant;
    public static int tot; 

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();

        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        while (in == 0) {

            System.out.println("1.-Vender 2.-Ver total del dia y finalizar ");

            do {
                System.out.println("Seleccione su opcion");
                op = x.nextInt();
            } while (op <= 0 || op > 2);

            switch (op) {
                case 1 -> {
                    System.out.println("1.-Bebidas Refrescantes 2.-Granos Basicos 3.-Carnes");

                    do {
                        System.out.println("Seleccione su opcion");
                        operacion = x.nextInt();
                    } while (operacion <= 0 || operacion > 3);

                    switch (operacion) {
                        case 1 -> {
                            System.out.println("1.-CocaCola 2 litros 2.-Pepsi 2 litros 3.-KolaShaler 2 litros");
                            do {
                                System.out.println("Seleccione su opcion");
                                ope = x.nextInt();
                            } while (ope <= 0 || ope > 3);
                            switch (ope) {
                                case 1 -> {
                                    do {
                                        System.out.println("Digite la cantidad de CocaColas");
                                        cant = x.nextInt();
                                    } while (cant <= 0 || cant>25);
                                    tot = cant * 38;
                                    tf = tot;
                                    do {
                                        System.out.println("Digite la clave de la caja registradora");
                                        cl = x.nextInt();
                                    } while (cl <= 0);
                                    if (cl == 2307) {

                                        do {
                                            System.out.println("Ingrese la cantidad de dinero entregada por el cliente");
                                            cd = x.nextInt();
                                        } while (cd <= 0);
                                        if (cd <= tf) {
                                            System.out.println("No se pudo realizar la compra");
                                        } else {
                                            vu = cd - tf;

                                            System.out.println("Resumen de la compra");

                                            System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);

                                            System.out.println("Año Actual: " + año);

                                            System.out.println("El total de la compra fue " + tf + " Cordobas");
                                            System.out.println("El dinero entregado por el cliente : " + cd + " Cordobas");
                                            System.out.println("Vuelto del cliente : " + vu + " Cordobas");
                                            td = td + tf;
                                            tf = 0;
                                        }   
                                    } else {
                                        System.out.println("La clave ingresada es incorrecta");
                                    }

                                    break;
                                }
                                case 2 -> {
                                    do {
                                        System.out.println("Digite la cantidad de Pepsis");
                                        cant = x.nextInt();
                                    } while (cant <= 0 || cant>25);
                                    tot = cant * 36;
                                    tf = tot;

                                    do {
                                        System.out.println("Digite la clave de la caja registradora");
                                        cl = x.nextInt();
                                    } while (cl <= 0);
                                    if (cl == 2307) {

                                        do {
                                            System.out.println("Ingrese la cantidad de dinero entregada por el cliente");
                                            cd = x.nextInt();
                                        } while (cd <= 0);
                                        if (cd <= tf) {
                                            System.out.println("No se pudo realizar la compra");
                                        } else {
                                            vu = cd - tf;
                                            
                                            System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
                                            System.out.println("Año Actual: " + año);
                                            
                                            System.out.println("Resumen de la compra");
                                            System.out.println("El total de la compra fue " + tf + " Cordobas");
                                            System.out.println("El dinero entregado por el cliente : " + cd + " Cordobas");
                                            System.out.println("Vuelto del cliente : " + vu + " Cordobas");
                                            td = td + tf;
                                            tf = 0;
                                        }
                                    } else {
                                        System.out.println("La clave ingresada es incorrecta");
                                    }

                                    break;
                                }
                                case 3 -> {
                                    do {
                                        System.out.println("Digite la cantidad de KolaShaler");
                                        cant = x.nextInt();
                                    } while (cant <= 0 || cant>25);
                                    tot = cant * 35;
                                    tf = tot;
                                    do {
                                        System.out.println("Digite la clave de la caja registradora");
                                        cl = x.nextInt();
                                    } while (cl <= 0);

                                    if (cl == 2307) {

                                        do {
                                            System.out.println("Ingrese la cantidad de dinero entregada por el cliente");
                                            cd = x.nextInt();
                                        } while (cd <= 0);
                                        if (cd <= tf) {
                                            System.out.println("No se pudo realizar la compra");
                                        } else {
                                            vu = cd - tf;
                                            
                                            System.out.println("Resumen de la compra");
                                            System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
                                            
                                            System.out.println("El total de la compra fue " + tf + " Cordobas");
                                            System.out.println("El dinero entregado por el cliente : " + cd + " Cordobas");
                                            System.out.println("Vuelto del cliente : " + vu + " Cordobas");
                                            td = td + tf;
                                            tf = 0;
                                        }
                                    } else {
                                        System.out.println("La clave ingresada es incorrecta");
                                    }

                                    break;
                                }
                            }
                            break;
                        }
                        case 2 -> {
                            System.out.println("1.-Arroz 2.-Frijoles 3.-Azucar");
                            do {
                                System.out.println("Seleccione su opcion");
                                ope = x.nextInt();
                            } while (ope <= 0 || ope > 3);

                            switch (ope) {
                                case 1 -> {
                                    do {
                                        System.out.println("Digite la cantidad de libras de arroz");
                                        cant = x.nextInt();
                                    } while (cant <= 0 || cant>35);
                                    tot = cant * 21;
                                    tf = tot;
                                    do {
                                        System.out.println("Digite la clave de la caja registradora");
                                        cl = x.nextInt();
                                    } while (cl <= 0);
                                    if (cl == 2307) {

                                        do {
                                            System.out.println("Ingrese la cantidad de dinero entregada por el cliente");
                                            cd = x.nextInt();
                                        } while (cd <= 0);
                                        if (cd <= tf) {
                                            System.out.println("No se pudo realizar la compra");
                                        } else {
                                            vu = cd - tf;
                                            
                                            System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
                                            System.out.println("Año Actual: " + año);
                                            
                                            System.out.println("Resumen de la compra");
                                            System.out.println("El total de la compra fue " + tf + " Cordobas");
                                            System.out.println("El dinero entregado por el cliente : " + cd + " Cordobas");
                                            System.out.println("Vuelto del cliente : " + vu + " Cordobas");
                                            td = td + tf;
                                            tf = 0;
                                        }
                                    } else {
                                        System.out.println("La clave ingresada es incorrecta");
                                    }

                                    break;
                                }
                                case 2 -> {
                                    do {
                                        System.out.println("Digite la cantidad de Frijoles");
                                        cant = x.nextInt();
                                    } while (cant <= 0 || cant>35 );
                                    tot = cant * 32;
                                    tf = tot;

                                    do {
                                        System.out.println("Digite la clave de la caja registradora");
                                        cl = x.nextInt();
                                    } while (cl <= 0);
                                    if (cl == 2307) {

                                        do {
                                            System.out.println("Ingrese la cantidad de dinero entregada por el cliente");
                                            cd = x.nextInt();
                                        } while (cd <= 0);
                                        if (cd <= tf) {
                                            System.out.println("No se pudo realizar la compra");
                                        } else {
                                            vu = cd - tf;
                                            
                                            System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
                                            System.out.println("Año Actual: " + año);
                                            
                                            System.out.println("Resumen de la compra");
                                            System.out.println("El total de la compra fue " + tf + " Cordobas");
                                            System.out.println("El dinero entregado por el cliente : " + cd + " Cordobas");
                                            System.out.println("Vuelto del cliente : " + vu + " Cordobas");
                                            td = td + tf;
                                            tf = 0;
                                        }
                                    } else {
                                        System.out.println("La clave ingresada es incorrecta");
                                    }

                                    break;
                                }
                                case 3 -> {
                                    do {
                                        System.out.println("Digite la cantidad de Azucar");
                                        cant = x.nextInt();
                                    } while (cant <= 0 || cant>35);
                                    tot = cant * 18;
                                    tf = tot;

                                    do {
                                        System.out.println("Digite la clave de la caja registradora");
                                        cl = x.nextInt();
                                    } while (cl <= 0);
                                    if (cl == 2307) {

                                        do {
                                            System.out.println("Ingrese la cantidad de dinero entregada por el cliente");
                                            cd = x.nextInt();
                                        } while (cd <= 0 );
                                        if (cd <= tf) {
                                            System.out.println("No se pudo realizar la compra");
                                        } else {
                                            vu = cd - tf;
                                            
                                            System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
                                            System.out.println("Año Actual: " + año);
                                            
                                            System.out.println("Resumen de la compra");
                                            System.out.println("El total de la compra fue " + tf + " Cordobas");
                                            System.out.println("El dinero entregado por el cliente : " + cd + " Cordobas");
                                            System.out.println("Vuelto del cliente : " + vu);
                                            td = td + tf;
                                            tf = 0;
                                        }
                                    } else {
                                        System.out.println("La clave ingresada es incorrecta");
                                    }

                                    break;
                                }
                            }
                            break;
                        }
                        case 3 -> {
                            System.out.println("1.-Carne de cerdo 2.-Carne Posta de res 3.-Pechiga");
                            do {
                                System.out.println("Seleccione su opcion");
                                ope = x.nextInt();
                            } while (ope <= 0 || ope > 3);
                            switch (ope) {
                                case 1 -> {
                                    do {
                                        System.out.println("Digite la cantidad de Carne de Cerdo");
                                        cant = x.nextInt();
                                    } while (cant <= 0 || cant>20);
                                    tot = cant * 90;
                                    tf = tot;

                                    do {
                                        System.out.println("Digite la clave de la caja registradora");
                                        cl = x.nextInt();
                                    } while (cl <= 0);
                                    if (cl == 2307) {

                                        do {
                                            System.out.println("Ingrese la cantidad de dinero entregada por el cliente");
                                            cd = x.nextInt();
                                        } while (cd <= 0);
                                        if (cd <= tf) {
                                            System.out.println("No se pudo realizar la compra");
                                        } else {
                                            vu = cd - tf;
                                            System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
                                            System.out.println("Año Actual: " + año);
                                            
                                            System.out.println("Resumen de la compra");
                                            System.out.println("El total de la compra fue " + tf + " Cordobas");
                                            System.out.println("El dinero entregado por el cliente : " + cd + " Cordobas");
                                            System.out.println("Vuelto del cliente : " + vu + " Cordobas");
                                            td = td + tf;
                                            tf = 0;
                                        }
                                    } else {
                                        System.out.println("La clave ingresada es incorrecta");
                                    }

                                    break;
                                }
                                case 2 -> {
                                    do {
                                        System.out.println("Digite la cantidad de Carne posta de res");
                                        cant = x.nextInt();
                                    } while (cant <= 0 || cant>20);
                                    tot = cant * 120;
                                    tf = tot;

                                    do {
                                        System.out.println("Digite la clave de la caja registradora");
                                        cl = x.nextInt();
                                    } while (cl <= 0);
                                    if (cl == 2307) {

                                        do {
                                            System.out.println("Ingrese la cantidad de dinero entregada por el cliente");
                                            cd = x.nextInt();
                                        } while (cd <= 0);
                                        if (cd <= tf) {
                                            System.out.println("No se pudo realizar la compra");
                                        } else {
                                            vu = cd - tf;
                                            System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
                                            System.out.println("Año Actual: " + año);
                                            
                                            System.out.println("Resumen de la compra");
                                            System.out.println("El total de la compra fue " + tf + " Cordobas");
                                            System.out.println("El dinero entregado por el cliente : " + cd + " Cordobas");
                                            System.out.println("Vuelto del cliente : " + vu + " Cordobas");
                                            td = td + tf;
                                            tf = 0;
                                        }
                                    } else {
                                        System.out.println("La clave ingresada es incorrecta");
                                    }

                                    break;
                                }
                                case 3 -> {
                                    do {
                                        System.out.println("Digite la cantidad de pechuga");
                                        cant = x.nextInt();
                                    } while (cant <= 0 || cant>25);
                                    tot = cant * 40;
                                    tf = tot;

                                    do {
                                        System.out.println("Digite la clave de la caja registradora");
                                        cl = x.nextInt();
                                    } while (cl <= 0);
                                    if (cl == 2307) {

                                        do {
                                            System.out.println("Ingrese la cantidad de dinero entregada por el cliente");
                                            cd = x.nextInt();
                                        } while (cd <= 0);
                                        if (cd <= tf) {
                                            System.out.println("No se pudo realizar la compra");
                                        } else {
                                            vu = cd - tf;
                                            
                                            System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
                                            System.out.println("Año Actual: " + año);
                                            
                                            System.out.println("Resumen de la compra");
                                            System.out.println("El total de la compra fue " + tf + " Cordobas");
                                            System.out.println("El dinero entregado por el cliente : " + cd + " Cordobas");
                                            System.out.println("Vuelto del cliente : " + vu + " Cordobas");
                                            td = td + tf;
                                            tf = 0;
                                        }
                                    } else {
                                        System.out.println("La clave ingresada es incorrecta");
                                    }

                                    break;
                                }
                            }

                            break;
                        }
                    }
                    break;
                }
                case 2 -> {
                    in = 1;
                     System.out.println("Fecha Actual: " + dia + "/" + (mes + 1) + "/" + año);
                     System.out.println("Año Actual: " + año);
                    System.out.println("El total en ventas del dia fue de : " + td + " Cordobas");

                    break;
                }

            }
        }
    }
}
