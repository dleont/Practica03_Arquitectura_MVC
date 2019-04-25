/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorMamifero;
import ec.edu.ups.controlador.ControladorPez;
import ec.edu.ups.modelo.Mamifero;
import ec.edu.ups.modelo.Pez;
import java.util.Scanner;

/**
 * Clase Principal donde inicia la ejecucion del programa.
 *
 * @author Darwin Leon, Est.
 */
public class Principal {

    public static void main(String[] args) {

        //Variables que sirven para los subMenus de las clases.
        int op;
        int opM;
        int opP;
        int opA;
        int opR;
        
        //Instanciando clases controladores para acceder a sus constrcutores (CRUD)
        ControladorMamifero mamiferoCon = new ControladorMamifero();
        ControladorPez pezCon = new ControladorPez();
       
        do {

            System.out.println(" ►► Menu ◄◄");
            System.out.println("1. CRUD> Mamifero");
            System.out.println("2. CRUD> Pez");
            System.out.println("3. CRUD> Ave");
            System.out.println("4. CRUD> Reptil");
            System.out.println("5. SALIR ");

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
                                mamiferoCon.create(mamifero);
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
                                System.out.println(mamiferoCon.read(cod2));

                                break;
                                
                            //Actualizamos el objeto pidiendo el nombre; el codigo se mantiene.                                
                            case 3:
                                //update mamifero
                                System.out.println(" UPDATE ");
                                Mamifero mamiferoU = new Mamifero();
                                System.out.println("Ingresar codigo del mamifero a modificar ");
                                mamiferoU.setCodigo(leer.nextInt()); 
                                mamiferoCon.update(mamiferoU);

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
                                mamiferoCon.update(mamiferoU);
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
                                mamiferoCon.delete(cod);
                                System.out.println("Se a eliminado el mamifero " + " del codigo " + cod);

                                break;
                            
                            //Lista todos los objetos en el mismo orden que fueron creados anteriormente. 
                            case 5:
                                //listar mamiferos creados
                                System.out.println(" LISTAR ");
                                System.out.println(" Desea listar 1.Si  2.No");
                                int lis = leer.nextInt();
                                //mamifero.listar(leer.nextInt());
                                mamiferoCon.listar(lis);
                                
                                break;

                        }
                        System.out.println(" ");
                        System.out.println("Continuar en la clase Mamifero = 1.SI / 2.NO");
                        opM = leer.nextInt();

                    } while (opM != 2);
                    break;

                 //Clase HIJA 2 interface HASHSET y CRUD.
                case 2:
                     do {
                        System.out.println(" ►► Pez ◄◄");
                        System.out.println("1. CREATE ");
                        System.out.println("2. READ ");
                        System.out.println("3. UPDATE ");
                        System.out.println("4. DELETE ");
                        System.out.println("5. LIST ");
                        System.out.println("6. REGRESAR ");
                        
                        opP = leer.nextInt();
                        switch(opP){
                            case 1: //create pez
                                Pez pez = new Pez();
                                System.out.println(" CREANDO...");
                                System.out.println(" Ingrese nombre");
                                pez.setNombre(leer.nextLine());
                                pez.setNombre(leer.nextLine());
                                System.out.println("Ingrese tipo de animal");
                                pez.setTipoAnimal(leer.nextLine());
                                System.out.println(" Ingrese el sexo");
                                pez.setSexo(leer.nextLine());
                                
                                System.out.println("Ingrese el tipo de pez");
                                pez.setTipoPez(leer.nextLine());
                                System.out.println("Ingrese el tipo de esqueleto ");
                                pez.setTipoEsqueleto(leer.nextLine());
                                System.out.println("Ingrese el tamaño");
                                pez.setTamaño(leer.nextDouble());
                                System.out.println("Ingrese el peso");
                                pez.setPeso(leer.nextDouble());
                                
                                pezCon.create(pez);
                                System.out.println(" Se ha creado el pez "+pez.getNombre()
                                +" con codigo "+pez.getCodigo());
                                
                                break;
                            case 2: //read pez
                                System.out.println(" ");
                                System.out.println(" LEYENDO... ");
                                System.out.println("Ingrese el codigo del pez");
                                int cod = leer.nextInt();
                                
                                System.out.println(" ");
                                //Imprimiendo el objeto 
                                System.out.println(pezCon.read(cod));
                                
                                break;
                            case 3://update pez
                                Pez pezU = new Pez();
                                System.out.println(" ");
                                System.out.println(" Ingrese el codigo del pez a modificar");
                                pezU.setCodigo(leer.nextInt());
                                
                                pezCon.update(pezU);
                                
                                System.out.println(" ACTUALIZANDO...");
                                System.out.println(" Ingrese nombre");
                                pezU.setNombre(leer.nextLine());
                                pezU.setNombre(leer.nextLine());
                                System.out.println("Ingrese tipo de animal");
                                pezU.setTipoAnimal(leer.nextLine());
                                System.out.println(" Ingrese el sexo");
                                pezU.setSexo(leer.nextLine());
                                
                                System.out.println("Ingrese el tipo de pez");
                                pezU.setTipoPez(leer.nextLine());
                                System.out.println("Ingrese el tipo de esqueleto ");
                                pezU.setTipoEsqueleto(leer.nextLine());
                                System.out.println("Ingrese el tamaño");
                                pezU.setTamaño(leer.nextDouble());
                                System.out.println("Ingrese el peso");
                                pezU.setPeso(leer.nextDouble());
                                
                                System.out.println(" Los datos se han actualizado correctamente");

                                break;
                            case 4://delete pez
                                
                                Pez pezD = new Pez();
                                System.out.println(" ELIMINANDO...");
                                System.out.println(" Ingrese el codigo");
                                pezD.setCodigo(leer.nextInt());
                                
                                pezCon.delete(pezD);
                                System.out.println(" Se ha eliminado el pez de codigo "+pezD.getCodigo());
                                
                                break;
                            case 5://list pez
                                System.out.println(" LISTANDO...");
                                pezCon.imprimir();
                                
                                break;
   
                        }
                         System.out.println(" ");
                         System.out.println(" Continuar en la clase PEZ=  1.Si  2.No");
                        opP = leer.nextInt();
                    }while(opP!=2);
                    break;
               
            }

        } while (op != 5);

    }
}
