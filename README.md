# Practica03_Arquitectura_MVC
Permite persistir información en la memoria RAM usando colecciones y diccionarios con base a la arquitectura Modelo-Vista-Controlador (MVC).

1.	Crear un repositorio en GitHub con el nombre “Práctica 03 – Arquitectura MVC” 
 
    *Practica03_Arquitectura_MVC
     Permite persistir información en la memoria RAM usando colecciones y
     diccionarios con base a la arquitectura Modelo-Vista-Controlador (MVC).


2.	Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar varios commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub). 

  *Inicializacion del proyecto con dos paquetes 
  *Creacion de clase HIJA 1 : hereda de atributos de la clase padre.
  *Creacion de clase Controlador para la clase HIJA 1 .
  *Creacion del MENU y sobretodo el SubMenu para la clase HIJA 1.
  *Creacion de la clase HIJA 2 y clase Controlador de la misma.
  *Creacion del SubMenu para la clase HIJA 2 en la cual fue implementada el CRUD.
  *Creacion de clase hija 3 con atributos, constructores y metodos.
  *Creacion del SubMenu para la clase HIJA 3 en la cual fue implementada el CRUD.


3.	Crear un paquete para los controladores y un paquete para la vista. 

src/ec/edu/ups
                 /ups/modelo
                /ups/vista

4.	Crear un controlador por cada clase hija. En total, cuatro controladores. 

src/ec/edu/ups/controlador
                        ControladorAve.java	
                        ControladorMamifero.java	
                        ControladorPez.java	
                        ControladorReptil.java

5.	Al menos una clase Controlador debe ser implementada usando la interface List y la clase ArrayList. 

/**
 * Clase ControladorMamifero implementada usando la interface List y la clase
 * ArrayList.
 *
 * @author Darwin Leon, Est.
 */
public class ControladorMamifero {

    private List<Mamifero> lista;
    private int cod;

    public ControladorMamifero() {
        lista = new ArrayList<>();
        cod = 1;
    }


6.	Al menos una clase Controlador debe ser implementada usando la interface Set y la clase HashSet. 

/**
 * Clase  ControladorPez implementada usando la interface Set y la clase HashSet.
 * @author Darwin Leon, Est.
 */
public class ControladorPez {
    
     //Interfaz Set guarda lista de objetos en un HashSet el cual permite el ingreso
    //de un objeto con un unico codigo. Aqui agregamos el codigo automaticamente.
    private Set<Pez> listaP;
    private int cod;

    public ControladorPez() {
        listaP = new HashSet<>();
        cod = 1;
    }

    public void create(Pez pez) {
        pez.setCodigo(cod);
        listaP.add(pez);
        cod++;
    }

7.	Al menos una clase Controlador debe ser implementada usando la interface SortedSet y la clase TreeSet. 

/**
 * Clase  ControladorAve debe ser implementada usando la interface SortedSet y la clase TreeSet.
 * @author Darwin Leon, Est.
 */
public class ControladorAve {
    
     //Interfaz SortedSet guarda lista de objetos en un TreeSet el cual permite el ingreso
    //de un objeto con un unico codigo. Aqui se genera el codigo automaticamente.
    private SortedSet<Ave> listaAve;
    private int cod;
    
   
    public ControladorAve(){
        listaAve = new TreeSet<>();
        cod = 0; 
}

8.	Al menos una clase Controlador debe ser implementada usando la interface Map y la clase HashMap o la interface Map y la clase TreeMap. 

/**
 * Clase ControladorReptil implementada usando la interface Map y la clase TreeMap.
 * 
 * @author Darwin Leon, Est.
 */
public class ControladorReptil {
    
    private Map<Integer, Reptil> listaR;
    private int cod;
    
    public ControladorReptil(){
        listaR = new TreeMap<>();
        cod =0;   
    }
    
9.	Crear una clase “Principal”, en donde se demostrará el funcionamiento del sistema completo a través de la consola de java, usando menús y submenús para acceder a las opciones. 

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
        ControladorAve aveCon = new ControladorAve();

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
                                System.out.println(" Se ha creado un mamifero "
                                        + mamifero.getNombre() + " con el codigo: " + mamifero.getCodigo());
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


10.	Generar informe de los resultados en el formato de prácticas. Debe incluir: 
a. El desarrollo de cada uno de los puntos antes.
b. La evidencia del correcto funcionamiento de cada punto. Para lo cuál, se puede generar fotografías
instantáneas (pantallazos).
c. El informe debe incluir conclusiones apropiadas.
. En el informe se debe incluir la información de GitHub (usuario y URL del repositorio de la práctica)

Usuario: dleont
ur l:   https://github.com/dleont/Practica03_Arquitectura_MVC
