/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorMamifero;
import ec.edu.ups.modelo.Mamifero;
import java.util.Scanner;

/**
 * Clase Principal donde inicia la ejecucion del programa.
 *
 * @author Darwin Leon, Est.
 */
public class Principal {

    public static void main(String[] args) {

        int op;
        int opM;
        int opP;
        int opA;
        int opR;
        
        ControladorMamifero mamiferoC = new ControladorMamifero();
       
        do {

            System.out.println(" ►► Menu ◄◄");
            System.out.println("1. CRUD> Mamifero");
            System.out.println("2. CRUD> Pez");
            System.out.println("3. CRUD> Ave");
            System.out.println("4. CRUD> Reptil");

            Scanner leer = new Scanner(System.in);
            op = leer.nextInt();

            switch (op) {

                case 1:  //crud de mamifero
                    do {
                        System.out.println(" ►► Mamifero ◄◄");
                        System.out.println("1. CREATE ");
                        System.out.println("2. READ ");
                        System.out.println("3. UPDATE ");
                        System.out.println("4. DELETE ");
                        System.out.println("5. LIST ");
                        System.out.println("6. REGRESAR ");

                        opM = leer.nextInt();

                        switch (opM) {
                            //Creamos un objeto "mamifero".
                            case 1:
                                //Creo objeto de la clase ControladorMamifero para 
                                Mamifero mamifero = new Mamifero();
                                //Asignamos valores
                                System.out.println(" CREATE ");
                                System.out.println(" Ingresar nombre");
                                mamifero.setNombre(leer.nextLine());
                                mamifero.setNombre(leer.nextLine());
                                System.out.println(" Ingresar el tipo de animal");
                                mamifero.setTipoAnimal(leer.nextLine());
                                System.out.println(" Ingresar el sexo");
                                mamifero.setSexo(leer.nextLine());

                                System.out.println(" Ingresar cantidad de patas");
                                mamifero.setCantPatas(leer.nextInt());
                                System.out.println(" Ingresar cantidad de mamas");
                                mamifero.setCantMamas(leer.nextInt());
                                System.out.println(" Ingresar el tiempo de gestacion");
                                mamifero.setTiempoGest(leer.nextLine());
                                mamifero.setTiempoGest(leer.nextLine());
                                System.out.println(" Ingresar el peso en kilos");
                                mamifero.setPeso(leer.nextDouble());

                                //llamamos al metodo create en la clase Controlador.
                                mamiferoC.create(mamifero);
                                System.out.println(" Se ha creado un mamifero "+
                                        mamifero.getNombre()+" con el codigo: " + mamifero.getCodigo());
                                break;

                            //Leemos el objeto creado anteriormente "mamifero" mediante el nombre.
                            case 2:
                                //Read mamifero
                                System.out.println(" ");
                                System.out.println(" READ ");
                                System.out.println("Ingresar codigo del mamifero");
                                int cod2 = leer.nextInt();
                                
                                System.out.println(" ");
                                System.out.println(mamiferoC.read(cod2));

                                break;
                                
                            //Actualizamos el objeto pidiendo el nombre; el codigo se mantiene.                                
                            case 3:
                                //update mamifero
                                System.out.println(" UPDATE ");
                                Mamifero mamiferoU = new Mamifero();
                                System.out.println("Ingresar codigo del mamifero a modificar ");
                                mamiferoU.setCodigo(leer.nextInt()); 
                                mamiferoC.update(mamiferoU);

                                System.out.println("Ingresar nombre:");
                                mamiferoU.setNombre(leer.nextLine());
                                mamiferoU.setNombre(leer.nextLine());
                                System.out.println(" Ingresar el tipo de animal");
                                mamiferoU.setTipoAnimal(leer.nextLine());
                                System.out.println(" Ingresar el sexo");
                                mamiferoU.setSexo(leer.nextLine());

                                System.out.println(" Ingresar cantidad de patas");
                                mamiferoU.setCantPatas(leer.nextInt());
                                System.out.println(" Ingresar cantidad de mamas");
                                mamiferoU.setCantMamas(leer.nextInt());
                                System.out.println(" Ingresar el tiempo en meses de gestacion");
                                mamiferoU.setTiempoGest(leer.nextLine());
                                mamiferoU.setTiempoGest(leer.nextLine());
                                System.out.println(" Ingresar el peso en kilos");
                                mamiferoU.setPeso(leer.nextDouble());
                                
                                //llama al metodo update de la clase ControladorAuto.
                                mamiferoC.update(mamiferoU);
                                System.out.println("Se han actualizado los datos del mamifero de codigo "
                                        + mamiferoU.getCodigo());

                                break;

                            //Elimina un objeto y lo buscamos mediante el codigo;
                            case 4:
                                //delete mamifero
                                //Mamifero mamiferoD = new Mamifero();
                                System.out.println(" DELETE ");
                                System.out.println(" Ingrese el nombre del mamifero a eliminar ");                                
                                int cod = leer.nextInt();
                                //lllama al metodo elimnar de la clase ControladorAuto
                                mamiferoC.delete(cod);
                                System.out.println("Se a eliminado el mamifero " + " del codigo " + cod);

                                break;
                            
                            //Lista todos los objetos en el mismo orden que fueron creados anteriormente. 
                            case 5:
                                //listar mamiferos creados
                                System.out.println(" LISTAR ");
                                System.out.println(" Desea listar 1.Si  2.No");
                                int lis = leer.nextInt();
                                //mamifero.listar(leer.nextInt());
                                mamiferoC.listar(lis);
                                
                                break;

                        }
                        System.out.println(" ");
                        System.out.println("Regresar al Menu = 1.SI / 2.NO");
                        opM = leer.nextInt();

                    } while (opM != 1);
                    break;

                case 2:
                    /* do {
                        System.out.println(" ►► Pez ◄◄");
                        System.out.println("1. CREATE ");
                        System.out.println("2. READ ");
                        System.out.println("3. UPDATE ");
                        System.out.println("4. DELETE ");
                        System.out.println("5. LIST ");
                        System.out.println("6. REGRESAR ");

                        // opP = leer.nextInt();
                    }*/
                    break;

            }

        } while (op != 2);

    }
}
