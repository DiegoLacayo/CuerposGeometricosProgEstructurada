import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

            System.out.println("---Menu de opciones Geometricas---");
            System.out.println("1) Prisma");
            System.out.println("2) Cilindro");
            System.out.println("3) Piramide");
            System.out.println("4) Cono");
            System.out.println("5) Esfera");
            System.out.println("6) Zona Esférica");
            System.out.println("7) Casquete Esférico");
            System.out.println("8) Huso Esférico y Cuña Esférica");
            System.out.println("9) Ortoedro");
            System.out.println("10) Tetraedro");
            System.out.println("11) Hexaedro");
            System.out.println("12) Octaedro");
            System.out.println("13) Dodecaedro");
            System.out.println("14) Icosaedro");
            System.out.println("15) Tronco de Cono");
            System.out.println("16) Tronco de Piramide");
            System.out.println("17) Salir del menu");
            System.out.println("Ingrese un numero para acceder a la accion del menu: ");
            byte menu = lector.nextByte();
            
            int veces = 0, veces1 =0, veces2 = 0, veces3 = 0;
            int Nlados, Angulo;
            double Haltura, Llados, Alateral, Exponente, Apotema, Abase, Atotal, Volumen, Perimetro;
            double Radio, Base, Mbase, Pbase, Generatriz, Area, radio1, radio2, radio, perimetro;
            double Largo, Ancho, Diagonal, Arista, Diametro, Raiz, Apentagonal, Abase1, Abase2;

        switch (menu) {
            case 1 :

                    System.out.println("----Calculo de los datos de un Prisma----");
            // -------------------------------------------------------------------------------------- //
                do{
                    System.out.println("Inserte la Cantidad de Lados del Prisma: ");
                    Nlados = lector.nextInt();
                    if (Nlados > 0){
                    veces = 3;

                do{
                    System.out.println("Inserte la Longitud de los Lados del Prisma: ");
                    Llados = lector.nextDouble();
                    if (Llados > 0){
                    veces1 = 3;

                do{
                    System.out.println("Inserte la Altura del Prisma: ");
                    Haltura = lector.nextDouble();
                    if (Haltura > 0){
                    
                    Pbase = Llados * Nlados;
                    Alateral = Pbase * Haltura;
                    Exponente = (Math.PI/180) * (360/Nlados);
                    Apotema = Llados / (2 * Math.tan((Exponente/2)));
                    Abase = (Pbase * Apotema)/2;
                    Atotal = Alateral + 2 * Abase;
                    Volumen = Haltura * Abase;
            
                    System.out.println("--Calculo del Aria Lateral, Area Total y Volumen del Prisma--");
                    System.out.println("El Area Lateral del Prisma es de " + Alateral + " unidades cuadradas. ");
                    System.out.println("El Area Total del Prisma es de " + Atotal + " unidades cuadradas. ");
                    System.out.println("El Volumen del Prisma es de " + Volumen + " unidades cubicas. ");
                    veces2 = 3;
                    } else {
                        veces2++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces2) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces2 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while ( veces2 < 3);

                        } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces1 < 3);

                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces < 3);

            break;

            case 2 :

                    System.out.println("----Calculo de los datos de un Cilindro----");
            // -------------------------------------------------------------------------------------- //
                do{ 
                    System.out.println("Inserte el Radio del Cilindro: ");
                    Radio = lector.nextDouble();
                    if (Radio > 0){
                        veces = 3;
                do{
                    System.out.println("Inserte la Altura del Cillindro: ");
                    Haltura = lector.nextDouble();
                    if (Haltura > 0){
                            
                    Pbase = 2 * Math.PI * Radio;
                    Alateral = Pbase * Haltura;
                    Atotal =  Alateral + (2 * (Math.PI * Math.pow(Radio, 2)));
                    Volumen = Math.PI * Math.pow(Radio,2) * Haltura;
            
                    System.out.println("--Calculo del Area Lateral, Area Total y Volumen del Cilindro--");
                    System.out.println("El Area Lateral del Cilindro es de " + Alateral + " unidades cuadradas. ");
                    System.out.println("El Area Total del Cilindro es de " + Atotal + " unidades cuadradas. ");
                    System.out.println("El Volumen del Cilindro es de " + Volumen + " unidades cubicas. ");
                    veces1 = 3;
                    } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces1 < 3);

                        } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces < 3);

            break;

            case 3 :

                    System.out.println("----Calculo de los datos de una Piramide----");
            // -------------------------------------------------------------------------------------- //
                do{
                    System.out.println("Inserte la Altura de la Piramide:  ");
                    Haltura  = lector.nextDouble();
                    if (Haltura > 0){
                        veces = 3;
                do{
                    System.out.println("Inserte la medida de la Base de la Piramide: ");
                    Base = lector.nextDouble();
                    if (Base > 0){

                    Mbase = Base / 2;
                    Pbase = Base * 4;
                    Exponente = Math.pow(Haltura,2) + Math.pow(Mbase,2);
                    Apotema = Math.sqrt(Exponente);
                    Alateral = Pbase *  Apotema / 2;  
                    Atotal = Alateral + Math.pow(Base, 2);
                    Volumen = (Math.pow(Base, 2) * Haltura) / 3;

                    System.out.println("--Calculo del Areal Lateral, Area Total y el Volumen de la Piramide--");
                    System.out.println("El Area Lateral de la Piramide es de " + Alateral + " unidades cuadradas. ");
                    System.out.println("El Area Total de la Piramide es de " + Atotal + " unidades cuadradas. ");
                    System.out.println("El Volumen de la Piramide es de " + Volumen + " unidades cubicas. ");
                    veces1 = 3;
                    } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces1 < 3);

                        } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces < 3);

            break;

            case 4 :

                    System.out.println("----Calculo de los datos de un Cono----");
            // -------------------------------------------------------------------------------------- //
                do{
                    System.out.println("Inserte el Radio del Cono: ");
                    Radio = lector.nextDouble();
                    if (Radio > 0){
                        veces = 3;
                do{
                    System.out.println("Inserte la Altura del Cono: ");
                    Haltura = lector.nextDouble();
                    if (Haltura > 0){
                
                    Exponente = Math.pow(Haltura,2) + Math.pow(Radio,2);
                    Generatriz = Math.sqrt(Exponente);
                    Alateral = Math.PI * Radio * Generatriz;
                    Atotal = Math.PI * Radio * (Generatriz + Radio);
                    Volumen = Math.PI * Math.pow(Radio,2) * Haltura / 3;

                    System.out.println("--Calculo de Aria Lateral, Area Total y Volumen del Cono--");
                    System.out.println("El Area Lateral del Cono es de " + Alateral + " unidades cuadradas. ");
                    System.out.println("El Area Total del Cono es de " + Atotal + " unidades cuadradas. ");
                    System.out.println("El Volumen del Cono es de " + Volumen + " unidades cubicas. ");
                    veces1 = 3;
                    }else{
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces1 < 3);

                        } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces < 3);

            break;

            case 5 :

                    System.out.println("----Calculo de los datos de una Esfera----");
            // -------------------------------------------------------------------------------------- //
                do{    
                    System.out.println("Inserte el Radio de la esfera: ");
                    Radio = lector.nextDouble();
                    if (Radio > 0){
    
                    Area = 4 * (Math.PI * Math.pow(Radio,2));
                    Volumen = 4/3 * (Math.PI * Math.pow(Radio,3));

                    System.out.println("--Calculo del Aria y Volumen de la esfera--");
                    System.out.println("El Area Total de la esfera es de " + Area + " unidades cuadradas. ");
                    System.out.println("El Volumen de la esfera es de " + Volumen + " unidades cubicas. ");
                    veces = 3;
                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces < 3);

            break;

            case 6 :

                    System.out.println("----Calculo de los datos de una Zona Esferica----");
            // -------------------------------------------------------------------------------------- //
                do{    
                    System.out.println("Inserte el Radio de la Esfera: ");
                    Radio = lector.nextDouble();
                    if (Radio > 0){
                    veces = 3;
                do{
                    System.out.println("Inserte el Radio Mayor, inferior de la Zona Esferica: ");
                    radio1 = lector.nextDouble();
                    if (radio1 > 0){
                    veces1 = 3;
                do{
                    System.out.println("Inserte el Radio Menor, superior de la Zona Esferica: ");
                    radio2 = lector.nextDouble();
                    if (radio2 > 0){
                    veces2 = 3;
                do{
                    System.out.println("Inserte la Altura de la Zona Esferica: ");
                    Haltura = lector.nextDouble();
                    if (Haltura > 0){

                    Area = 2 * Math.PI * Radio * Haltura;
                    Volumen = Math.PI * Haltura * (Math.pow(Haltura, 2) + (3 * Math.pow(radio1, 2)) + (3 * Math.pow(radio2, 2))) / 6;

                    System.out.println("--Calculo del Aria y Volumen de la Zona Esferica--");
                    System.out.println("El Area Total de la Zona Esferica es de " + Area + " unidades cuadradas. ");
                    System.out.println("El Volumen de la Zona Esferica es de " + Volumen + " unidades cubicas. ");
                    veces3 = 3;
                    } else {
                        veces3++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces3) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces3 == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces3 < 3);

                    } else {
                        veces2++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces2) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces2 == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces2 < 3);

                    } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces1 < 3);

                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces < 3);
                
            break;

            case 7 :

                    System.out.println("----Calculo de los datos del Casquete Esferico----");
            // -------------------------------------------------------------------------------------- //
                do{
                    System.out.println("Inserte el Radio del Casquete Esferico: ");
                    Radio = lector.nextDouble();
                    if (Radio > 0){
                    veces = 3;
                do{
                    System.out.println("Inserte la Altura del Casquete Esferico: ");
                    Haltura = lector.nextDouble();
                    if (Haltura > 0){

                    Area = 2 * Math.PI * Radio * Haltura;
                    Volumen = Math.PI * Math.pow(Haltura, 2) * ((3 * Radio) - Haltura) / 3;

                    System.out.println("--Calculo del Aria y Volumen del Casquete Esferico--");
                    System.out.println("El Area Total del Casquete Esferico es de " + Area + " unidades cuadradas. ");
                    System.out.println("El Volumen del Casquete Esferico es de " + Volumen + " unidades cubicas. ");
                    veces1 = 3;
                    } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces1 < 3);

                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces < 3);

            break;

            case 8 :

                    System.out.println("----Calculo de los datos del Huso Esferico y Cuña Esferica----");
            // -------------------------------------------------------------------------------------- //
                do{
                    System.out.println("Inserte el Radio del huso esferico = cuña esferica: ");
                    Radio = lector.nextDouble();
                    if (Radio > 0){
                    veces = 3;
                do{
                    System.out.println("Inserte el Angulo del huso esferico = cuña esferica: ");
                    Angulo = lector.nextInt();
                    if (Angulo > 0){

                    Area = (4 * Math.PI * Math.pow(Radio,2) * Angulo) / 360;
                    Volumen = ((Math.PI * Math.pow(Radio, 3)) * Angulo) / 270;

                    System.out.println("--Calculo del Area y Volumen del Huso Esferico y Cuña Esferica--");
                    System.out.println("El Area Total del huso esferico es de " + Area + " unidad cuadrada. ");
                    System.out.println("El Volumen de la cuña esferica es de " + Volumen + " unidad cubica. ");
                    veces1 = 3;
                    } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces1 < 3);

                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces < 3);

            break;

            case 9 :

                    System.out.println("----Calculo de los datos de un Ortoedro----");
            // --------------------------------------------------------------------------- //
                do{
                    System.out.println("Ingrese el Largo del Ortoedro: ");
                    Largo = lector.nextDouble();
                    if (Largo > 0){
                    veces = 3;
                do{
                    System.out.println("Ingrese el Ancho del Ortoedro: ");
                    Ancho = lector.nextDouble();
                    if (Ancho > 0){
                    veces1 = 3;
                do{
                    System.out.println("Ingrese el Altura del Ortoedroo: ");
                    Haltura = lector.nextDouble();
                    if (Haltura > 0){

                    Area = 2 * ((Largo * Ancho) + (Largo * Haltura) + (Ancho * Haltura));
                    Volumen = Largo * Ancho * Haltura;
                    Exponente = Math.pow(Ancho, 2) + Math.pow(Largo, 2) + Math.pow(Haltura, 2);
                    Diagonal = Math.sqrt(Exponente);

                    System.out.println("--Calculo del Area, Volumen y Diagonal del Ortoedro--");
                    System.out.println("El Area del Ortoedro es de: " + Area + " unidad cuadrada. ");
                    System.out.println("El Volumen del Ortoedro es de: " + Volumen + " unidad cubica. ");
                    System.out.println("La Diagonal del Ortoedro es de: " + Diagonal + " unidad normal. ");
                    veces2 = 3;
                    } else {
                        veces2++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces2) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces2 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while ( veces2 < 3);

                        } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces1 < 3);

                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces < 3);

            break;

            case 10 :

                    System.out.println("----Calculo de los datos de un Tetaedro----");
            // --------------------------------------------------------------------------- //
                do{
                    System.out.println("Ingrese el Largo de las Aristas Tetaedro: ");
                    Arista = lector.nextDouble();
                    if (Arista > 0){

                    Atotal = Math.pow(Arista, 2)* Math.sqrt(3);
                    Alateral = (Atotal/4);
                    Volumen = (Math.sqrt(2)/12) * Math.pow(Arista, 3);
                    Haltura= (Arista) * (Math.sqrt(6)/3);

                    System.out.println("--Calculo del Area Lateral, Area Total, Volumen y Altura del Tetaedro--");
                    System.out.println("El Area Lateral del Tetaedro es de: " + Alateral + " unidad cuadrada. ");
                    System.out.println("El Area Total del Tetaedro es de: " + Atotal + " unidad cuadrada. ");       
                    System.out.println("El Volumen del Tetaedro es de: " + Volumen + " unidad cubica. ");
                    System.out.println("La Altura del Tetaedro es de: " + Haltura + " unidad normal. ");
                    veces = 3;
                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces < 3);

            break;

            case 11 :

                    System.out.println("----Calculo de los datos de un Hexaedro----");
            // --------------------------------------------------------------------------- //
                do{
                    System.out.println("Ingrese el Largo de las Aristas del Hexaedro: ");
                    Arista = lector.nextDouble();
                    if (Arista > 0){

                    Alateral = Math.pow(Arista, 2);
                    Atotal = 6 * Math.pow(Arista, 2);
                    Volumen = Math.pow(Arista, 3);
                    Diametro = Arista * Math.sqrt(3);

                    System.out.println("--Calculo del AreaTotal, AreaLateral, Volumen y Diametro del Hexaedro--");
                    System.out.println("El AreaLateral del Hexaedro es de: " + Alateral + " unidad cuadrada. ");
                    System.out.println("El AreaTotal del Hexaedro es de: " + Atotal + " unidad cuadrada. ");       
                    System.out.println("El Volumen del Hexaedro es de: " + Volumen + " unidad cubica. ");
                    System.out.println("El Diametro del Hexaedro es de : " + Diametro + " unidad normal. ");
                    veces = 3;
                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces < 3);

            break;

            case 12 :

                    System.out.println("----Calculo de los datos de un Octaedro----");
            // --------------------------------------------------------------------------- //
                do{
                    System.out.println("Ingrese el Largo de las Aristas del Octaedro: ");
                    Arista = lector.nextDouble();
                    if (Arista > 0){

                    Atotal = 2 * Math.pow(Arista, 2) * Math.sqrt(3);
                    Alateral = Atotal / 8;
                    Volumen = (Math.sqrt(2) / 3) * Math.pow(Arista, 3);

                    System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Octaedro--");
                    System.out.println("El AreaLateral del Octaedro es de: " + Alateral + " unidades cuadradas. ");
                    System.out.println("El AreaTotal del Octaedro es de: " + Atotal + " unidades cuadradas. ");       
                    System.out.println("El Volumen del Octaedro es de: " + Volumen + " unidades cubicas. ");
                    veces = 3;
                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces < 3);

            break;

            case 13 :

                    System.out.println("----Calculo de los datos de un Dodecaedro----");
            // --------------------------------------------------------------------------- //
                do{
                    System.out.println("Ingrese el Largo de las Aristas del Dodecaedro: ");
                    Arista = lector.nextDouble();
                    if (Arista > 0){
                    veces = 3;
                do{
                    System.out.println("Ingrese el Largo del Apotema del Dodecaedro: ");
                    Apotema = lector.nextDouble();
                    if (Apotema > 0){

                    Raiz = 25 + (10 * Math.sqrt(5));
                    Area = 3 * Math.pow(Arista, 2) * (Math.sqrt(Raiz));
                    Apentagonal = 5/2 * Arista * Apotema;
                    Volumen = 1/4 + (15 + (7 * Math.sqrt(5))) * Math.pow(Arista, 3);

                    System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Dodecaedro--");
                    System.out.println("El Area Pentagonal del Dodecaedro es de: " + Apentagonal + " unidades cuadradas. ");
                    System.out.println("El Area del Dodecaedro es de: " + Area + " unidades cuadradas. ");       
                    System.out.println("El Volumen del dodecaedro es de: " + Volumen + " unidades cubicas. ");
                    veces1 = 3;
                    } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces1 < 3);

                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces < 3);

            break;

            case 14 :

                    System.out.println("----Calculo de los datos de un Icosaedro----");
            // --------------------------------------------------------------------------- //
                do{
                    System.out.println("Ingrese el Largo de las Aristas del Icosaedro: ");
                    Arista = lector.nextDouble();
                    if (Arista > 0){

                    Atotal = 5 * Math.pow(Arista, 2) * (Math.sqrt(3));
                    Alateral = Atotal / 20;
                    Volumen = 5 * (3 + Math.sqrt(5)) * Math.pow(Arista, 3) / 12;

                    System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Icosaedro--");
                    System.out.println("El Area Lateral del Icosaedro es de: " + Alateral + " unidades cuadradas. ");
                    System.out.println("El Area Total del Icosaedro es de: " + Atotal + " unidades cuadradas. ");      
                    System.out.println("El Volumen del Icosaedro es de: " + Volumen + " unidades cubicas. ");
                    veces = 3;
                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while(veces < 3);

            break;

            case 15 :

                    System.out.println("----Calculo de los datos de un Tronco de Cono----");
            // --------------------------------------------------------------------------- //
                do{
                    System.out.println("Ingrese la Altura del Tronco de Cono: ");
                    Haltura = lector.nextDouble();
                    if (Haltura > 0){
                    veces = 3;
                do{
                    System.out.println("Ingrese el Radio Mayor, Inferior del Tronco de Cono: ");
                    Radio = lector.nextDouble();
                    if (Radio > 3){
                    veces1 = 3;
                do{
                    System.out.println("Ingrese el Radio Menor, Superior del Tronco de Cono: ");
                    radio = lector.nextDouble();
                    if (radio > 0){
            
                    Exponente = Math.pow(Haltura,2) + Math.pow(Radio,2);
                    Generatriz = Math.sqrt(Exponente);
                    Abase1 = Math.PI * Math.pow(Radio, 2);
                    Abase2 = Math.PI * Math.pow(radio, 2);
                    Alateral = Math.PI * Generatriz * (Radio + radio);
                    Atotal = Alateral + Abase1 + Abase2;
                    Volumen = 1 * (Haltura * Math.PI) * (Abase1 + Abase2 + (Math.sqrt(Abase1 * Abase2))) / 3;

                    System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Tronco de Cono--");
                    System.out.println("El Area Lateral del Tronco de Cono es de: " + Alateral + " unidad cuadrada. ");
                    System.out.println("El Area Total del Tronco de Cono es de: " + Atotal + " unidad cuadrada. ");      
                    System.out.println("El Volumen del Tronco de Cono es de: " + Volumen + " unidad cubica. ");
                    veces2 = 3;
                    } else {
                        veces2++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces2) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces2 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while ( veces2 < 3);

                        } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces1 < 3);

                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces < 3);

            break;

            case 16 :

                    System.out.println("----Calculo de los datos de un Tronco Piramide----");
            // --------------------------------------------------------------------------- //
                do{
                    System.out.println("Ingrese la Altura del tronco cono: ");
                    Haltura = lector.nextDouble();
                    if (Haltura > 0){
                    veces = 3;
                do{
                    System.out.println("Ingrese el Perimetro Inferior Mayor del Tronco Piramide: ");
                    Perimetro = lector.nextDouble();
                    if (Perimetro > 0){
                    veces1 = 3;
                do{
                    System.out.println("Ingrese el Perimetro Superior Menor del Tronco Piramide: ");
                    perimetro = lector.nextDouble();
                    if (perimetro > 0){
            
                    Exponente = Math.pow(Haltura,2) + Math.pow(Perimetro, 2);
                    Apotema = Math.sqrt(Exponente);
                    Abase1 = Math.pow(Perimetro, 2);
                    Abase2 = Math.pow(perimetro, 2);
                    Alateral = ((Perimetro + perimetro ) / 2) * Apotema;
                    Atotal = Alateral + Abase1 + Abase2;
                    Volumen = Haltura * (Abase1 + Abase2 + (Math.sqrt(Abase1 * Abase2))) / 3;

                    System.out.println("--Calculando AreaTotal, AreaLateral y Volumen del Tronco Piramidee--");
                    System.out.println("El Area Lateral del Tronco Piramide es de: " + Alateral + " unidad cuadrada. ");
                    System.out.println("El Area Total del Tronco Piramide es de: " + Atotal + " unidad cuadrada. ");      
                    System.out.println("El Volumen del Tronco Piramide es de: " + Volumen + " unidad cuadrada. ");
                    veces2 = 3;
                    } else {
                        veces2++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces2) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces2 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while ( veces2 < 3);

                        } else {
                        veces1++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces1) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces1 == 3){
                            System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                            System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces1 < 3);

                    } else {
                        veces++;
                        System.out.println("Es incorecto el numero de intentos restantes es de " + (3 - veces) + "/3 , porfavor intente un numero mayor a 0.");
                        if (veces == 3){
                        System.out.println("Usted a usado sus 3 intentos de forma erronea, porfavor reinicie el programa y intente otravez si gusta.");
                        System.out.println("-- Sistema Finalizado Correctamente --");
                        }
                    }
                }while( veces < 3);

            break;

            case 17 :
                System.out.println("-- Usted a salido con exito del Menu --");
                System.out.println("-- Sistema Finalizado Correctamente --");
            break;

            default:
                System.out.println(" El digito ingresado no conuerda con los del menu, porfavor ingrese un digito correcto la proxima vez.");
                System.out.println("-- Sistema Finalizado Correctamente --");
                break;
        }  
        lector.close();
    }
}
