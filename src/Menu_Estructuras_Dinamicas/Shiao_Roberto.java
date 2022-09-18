/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Estructuras_Dinamicas;

import java.util.Scanner;
/**
 *
 * @author SHIAO_LITECH
 */
public class Shiao_Roberto {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String op;
        int casos;
        try {
            do {
                casos = mostrarMenu();
                switch (casos) {
                    case 1:
                        String op1;
                        int casos1, num1;
                        Colas cola1 = new Colas();
                        
                        do {
                            casos1 = mostrarMenuColas();
                            switch (casos1) {
                                case 1:
                                    System.out.println("\t\t\t 1 - Insertar ");
                                    System.out.println("Para dejar de añadir numeros digite -1");
                                    System.out.print("numero: ");
                                    num1 = sc.nextInt();

                                    while (num1 != -1) {
                                        System.out.print("numero: ");
                                        cola1.insertar(num1);
                                        num1 = sc.nextInt();
                                    }
                                    cola1.imprimir();
                                    break;
                                case 2:
                                    System.out.println("\t\t\t 2 - Extraer  ");
                                    cola1.imprimir();
                                    System.out.println("\nExtracción del elemento de la cola: " + cola1.extraer());
                                    break;
                                case 3:
                                    System.out.println("\t\t\t 3 - Imprimir  ");
                                    cola1.imprimir();
                                    break;
                                default:
                                    System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                            }
                            System.out.print("\nDeseas continuar con el programa de colas?? (s/n):");
                            op1 = sc.next().toLowerCase();
                        } while (op1.equals("s"));
                        break;
                    case 2:
                        System.out.println("\t\t 2 - LISTAS  ");
                        String op2;
                        int casos2,
                         num2,
                         eliminarNum;
                        Listas n1 = new Listas();

                        do {
                            casos2 = mostrarMenuListas();
                            switch (casos2) {
                                case 1:
                                    System.out.println("\t\t\t 1 - Insertar ");
                                    System.out.println("Para dejar de añadir numeros digite -1");
                                    System.out.print("numero: ");
                                    num2 = sc.nextInt();
                                    while (num2 != -1) {
                                        System.out.print("numero: ");
                                        n1.insertarPrimero(num2);
                                        n1.insertarFinal(num2);
                                        num2 = sc.nextInt();
                                    }

                                    System.out.println("Listamos elementos");
                                    n1.listar();
                                    break;
                                case 2:
                                    System.out.println("\t\t\t 2 - Eliminar  ");
                                    n1.listar();
                                    System.out.print("Ingrese el numero a eliminar: ");
                                    eliminarNum = sc.nextInt();
                                    n1.borrar(eliminarNum);
                                    break;
                                case 3:
                                    System.out.println("\t\t\t 3 - Imprimir  ");
                                    System.out.println("Listamos elementos");
                                    n1.listar();
                                    break;
                                default:
                                    System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                            }
                            System.out.print("\nDeseas continuar con el programa de listas?? (s/n):");
                            op2 = sc.next().toLowerCase();
                        } while (op2.equals("s"));
                        break;
                    case 3:
                        System.out.println("\t\t 3 - PILAS   ");
                        String op3;
                        int casos3,
                         num3;
                        Pila pila = new Pila();

                        do {
                            casos3 = mostrarMenuPilas();
                            switch (casos3) {
                                case 1:
                                    System.out.println("\t\t\t 1 - Mostrar elementos ");

                                    System.out.println("Para dejar de añadir numeros digite -1");
                                    System.out.print("numero: ");
                                    num3 = sc.nextInt();

                                    while (num3 != -1) {
                                        System.out.print("numero: ");
                                        pila.apilar(num3);
                                        num3 = sc.nextInt();
                                    }

                                    System.out.println("<<-- Pila -->>");
                                    pila.listar();
                                    break;
                                case 2:
                                    System.out.println("\t\t\t 2 - Mostrar tamaño");
                                    System.out.println("\n<<-- Tamaño -->");
                                    System.out.println(pila.getTamanio());
                                    break;
                                case 3:
                                    System.out.println("\t\t\t 3 - Eliminar el tope");
                                    System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
                                    pila.retirar();
                                    pila.listar();
                                    System.out.println("Tamaño: " + pila.getTamanio());
                                    break;
                                case 4:
                                    System.out.println("\t 4 - Actualizar elementos específicos");
                                    System.out.println("\n<<-- Actualizar el valor del nodo con el valor 12 por 24 -->>");
                                    pila.editar(12, 44);
                                    pila.listar();
                                    System.out.println("Tamaño: " + pila.getTamanio());
                                    break;
                                case 5:
                                    System.out.println("\t 5 - Eliminar elementos específicos");
                                    System.out.println("\n<<-- Eliminar el nodo con el valor 16 -->>");
                                    pila.remover(16);
                                    pila.listar();
                                    System.out.println("Tamaño: " + pila.getTamanio());
                                    break;
                                case 6:
                                    System.out.println("\t 6 - Consultar valores especifico existente ");
                                    System.out.println("\n<<-- Consulta si existe el valor 65 -->>");
                                    System.out.println(pila.buscar(65));

                                    System.out.println("\n<<-- Elimina la pila -->>");
                                    pila.eliminar();

                                    System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
                                    System.out.println(pila.esVacia());
                                    break;
                                default:
                                    System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                            }
                            System.out.print("\nDeseas continuar con el programa de pilas?? (s/n):");
                            op3 = sc.next().toLowerCase();
                        } while (op3.equals("s"));
                        break;
                    
                    default:
                        System.out.println("°° EL NUMERO INGRESADO NO ESTA EN EL RANGO DE OPCIONES °°");

                }
                System.out.print("\nDeseas continuar con el programa?? (s/n):");
                op = sc.next().toLowerCase();
            } while (op.equals("s"));

        } catch (Exception ex) {
            System.out.println("\n\t\t\tADVERTENCIA");
            System.out.println("\n\t\t¡¡¡¡ Datos incorrectos !!!!");
        }//Fin control de error
    }

    //inicio de funciones 
    //funcion de menu
    static int mostrarMenu() {
        int opcion;
        System.out.println("======== MENU - ESTRUCTURAS - DINAMICAS =========");
        System.out.println("\t\t|¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("\t\t| 1 - COLAS   |");
        System.out.println("\t\t| 2 - LISTAS  |");
        System.out.println("\t\t| 3 - PILAS   |");
        System.out.println("\t\t|¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una opcion (1-3): ");
        opcion = sc.nextInt();
        return opcion;
    }
    //FUNCIONES DE COLAS
    static int mostrarMenuColas() {
        int opcion;
        System.out.println("|= MENU COLAS =|");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - Insertar |");
        System.out.println("| 2 - Extraer  |");
        System.out.println("| 3 - Imprimir |");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una opcion (1-3): ");
        opcion = sc.nextInt();
        return opcion;
    }
    class Nodo {

        int info;
        Nodo sig;
    }

    private Nodo raiz, fondo;

    Shiao_Roberto() {
        raiz = null;
        fondo = null;
        primero = null;
        numElem = 0;
    }

    boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    void insertar(int info) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.sig = null;

        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    int extraer(int a) {
        if (!vacia()) {
            int informacion = raiz.info;
            if (raiz == fondo) {
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("\nListado de los elementos de la cola : ");

        while (reco != null) {
            System.out.print(reco.info + ";");
            reco = reco.sig;
        }
        System.out.println();
    }
    //FUNCIONES LISTAS
   static int mostrarMenuListas() {
        int opcion;
        System.out.println("[ MENU LISTAS ]");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - Insertar |");
        System.out.println("| 2 - Eliminar |");
        System.out.println("| 3 - Imprimir |");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una opcion (1-3): ");
        opcion = sc.nextInt();
        return opcion;
    }
     class Nodo1 {

        private int elemento;
        private Nodo1 siguiente;

        public Nodo1(int elem, Nodo1 sig) {
            elemento = elem;
            siguiente = sig;
        }

        public int getElemento() {
            return elemento;
        }

        public Nodo1 getSig() {
            return siguiente;
        }

        public void setElemento(int elem) {
            elemento = elem;
        }

        public void setSig(Nodo1 sig) {
            siguiente = sig;
        }
    }

    private Nodo1 primero;
    private int numElem;

    public void insertarPrimero(int elemento) {
        Nodo1 nuevo = new Nodo1(elemento, primero);
        primero = nuevo;
        numElem++;
    }

    public void insertarFinal(int elemento) {
        Nodo1 nuevo = new Nodo1(elemento, null);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo1 actual = primero;
            while (actual.getSig() != null) {
                actual = actual.getSig();

            }
            actual.setSig(nuevo);
            numElem++;
        }
    }

    public void borrar(int elem) {
        if (primero == null) {
            System.out.println("lista vacía");
        } else if (primero.getElemento() == elem) {
            primero = primero.getSig();
            numElem--;
        } else {
            Nodo1 actual = primero;
            while (actual.getSig() != null && actual.getSig().getElemento() != elem) {
                actual = actual.getSig();
            }
            if (actual.getSig() == null) {
                System.out.println("elemento " + elem + " no esta en la lista");
            } else {
                actual.setSig(actual.getSig().getSig());
                numElem--;
            }
        }
    }

    public void listar() {
        Nodo1 actual = primero;
        while (actual.getSig() != null) {
            System.out.println(actual.getElemento());
            actual = actual.getSig();
        }
        System.out.println(actual.getElemento());
    }
    //FUNCIONES DE PILAS
    static int mostrarMenuPilas() {
        int opcion;
        System.out.println("                  [ MENU PILAS ]              ");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - Mostrar elementos                      |");
        System.out.println("| 2 - Mostrar tamaño                         |");
        System.out.println("| 3 - Eliminar el tope                       |");
        System.out.println("| 4 - Actualizar elementos específicos       |");
        System.out.println("| 5 - Eliminar elementos específicos         |");
        System.out.println("| 6 - Consultar valores especifico existente |");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Selecciona una opcion (1-6): ");
        opcion = sc.nextInt();
        return opcion;
    }
    private static class Pila {

        private Nodo2 inicio;// tope de la pila.    
        private int tamanio;// tamaño de la pila.

        public void Pila() {
            inicio = null;
            tamanio = 0;
        }

        public boolean esVacia() {
            return inicio == null;
        }

        public int getTamanio() {
            return tamanio;
        }

        public void apilar(int valor) {

            Nodo2 nuevo = new Nodo2(); // Define un nuevo nodo.        
            nuevo.setValor(valor);// Agrega al valor al nodo.

            if (esVacia()) {
                inicio = nuevo;// Inicializa la pila con el nuevo valor.
            } // Caso contrario agrega el nuevo nodo al inicio de la pila.
            else {
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            tamanio++;
        }

        /**
         * Elimina el elemento que se encuentra en el tope de la piala.
         */
        public void retirar() {
            if (!esVacia()) {
                // Asigna como primer nodo al siguiente de la pila.
                inicio = inicio.getSiguiente();
                // Decrementa el contador del tamaño de la pila
                tamanio--;
            }
        }

        /**
         * Consulta el valor del nodo que se encuentra en la cima de la pila
         *
         * @return valor del nodo.
         * @throws Exception
         */
        public int cima() throws Exception {
            if (!esVacia()) {
                return inicio.getValor();
            } else {
                throw new Exception("La pila se encuentra vacia.");
            }
        }

        public boolean buscar(int referencia) {
            Nodo2 aux = inicio; // Crea una copia de la pila.
            // Bandera para verificar si existe el elemento a buscar.
            boolean existe = false;
            while (existe != true && aux != null) {
                // Compara si el valor del nodo es igual que al de referencia.
                if (referencia == aux.getValor()) {
                    existe = true;// Cambia el valor de la bandera.
                } else {
                    aux = aux.getSiguiente();// Avanza al siguiente nodo.
                }
            }
            return existe;
        }

        public void remover(int referencia) {
            if (buscar(referencia)) {      // Consulta si el valor existe en la pila.
                // Crea una pila auxiliar para guardar los valores que se 
                // vayan desapilando de la pila original.
                Nodo2 pilaAux = null;
                // Recoore la pila hasta llegar al nodo que tenga el valor
                // igual que el de referencia.
                while (referencia != inicio.getValor()) {
                    // Crea un nodo temporal para agregarlos a la pila auxiliar.
                    Nodo2 temp = new Nodo2();
                    // Ingresa el valor al nodo temporal.
                    temp.setValor(inicio.getValor());
                    // Consulta si la pila auxiliar no a sido inicializada.
                    if (pilaAux == null) {
                        // Inicializa la pila auxiliar.
                        pilaAux = temp;
                    } // Caso contrario si la pila auxiliar ya contiene elementos
                    // los agrega al inicio.
                    else {
                        temp.setSiguiente(pilaAux);
                        pilaAux = temp;
                    }
                    // Elimina el nodo del tope de la pila hasta llegar al nodo
                    // que se desea eliminar.
                    retirar();
                }
                // Elimina el nodo que coincide con el de referencia.
                retirar();
                // Regresa los valores de la pila auxiliar a la pila original
                // mientras la pila auxiliar tenga elementos.
                while (pilaAux != null) {
                    // Utiliza el metodo apilar para regresar los elementos a 
                    // la pila original.
                    apilar(pilaAux.getValor());
                    // Avansa al siguiente nodo de la pila auxiliar.
                    pilaAux = pilaAux.getSiguiente();
                }
                // Libera la memoria utilizada por la pila auxiliar.
                pilaAux = null;
            }
        }

        /**
         * Actualiza el valor de un nodo en la pila.
         *
         * @param referencia valor del nodo para ubicar el que se desea
         * actualizar.
         * @param valor por el cual se desea remplazar el valor del nodo.
         */
        public void editar(int referencia, int valor) {
            // Consulta si el nodo existe en la pila
            if (buscar(referencia)) {
                // Crea una pila auxiliar.
                Nodo2 pilaAux = null;
                // Recoore la pila hasta llegar al nodo que tenga el valor
                // igual que el de referencia.
                while (referencia != inicio.getValor()) {
                    // Crea un nodo temporal para agregarlos a la pila auxiliar.
                    Nodo2 temp = new Nodo2();
                    // Ingresa el valor al nodo temporal.
                    temp.setValor(inicio.getValor());
                    // Consulta si la pila auxiliar no a sido inicializada.
                    if (pilaAux == null) {
                        // Inicializa la pila auxiliar.
                        pilaAux = temp;
                    } // Caso contrario si la pila auxiliar ya contiene elementos
                    // los agrega al inicio.
                    else {
                        temp.setSiguiente(pilaAux);
                        pilaAux = temp;
                    }
                    // Elimina el nodo del tope de la pila hasta llegar al nodo
                    // que se desea eliminar.
                    retirar();
                }
                // Actualiza el valor del nodo.
                inicio.setValor(valor);
                // Regresa los valores de la pila auxiliar a la pila original
                // mientras la pila auxiliar tenga elementos.
                while (pilaAux != null) {
                    // Utiliza el metodo apilar para regresar los elementos a 
                    // la pila original.
                    apilar(pilaAux.getValor());
                    // Avansa al siguiente nodo de la pila auxiliar.
                    pilaAux = pilaAux.getSiguiente();
                }
                // Libera la memoria utilizada por la pila auxiliar.
                pilaAux = null;
            }
        }

        /**
         * Elimina la pila
         */
        public void eliminar() {
            // Elimina el valor y la referencia a los demas nodos.
            inicio = null;
            // Reinicia el contador a 0.
            tamanio = 0;
        }

        /**
         * Despliega en pantalla los elementos de la pìla.
         */
        public void listar() {
            // Crea una copia de la pila.
            Nodo2 aux = inicio;
            // Recorre la pila hasta el ultimo nodo.
            while (aux != null) {
                System.out.println("|\t" + aux.getValor() + "\t|");
                System.out.println("-----------------");
                aux = aux.getSiguiente();
            }
        }
    }

    private static class Nodo2 {
        // Variable en la cual se va a guardar el valor.

        private int valor;
        // Variable para enlazar los nodos.
        private Nodo2 siguiente;

        /**
         * Constructor que inicializamos el valor de las variables.
         */
        public void Nodo() {
            this.valor = 0;
            this.siguiente = null;
        }

        // Métodos get y set para los atributos.    
        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public Nodo2 getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo2 siguiente) {
            this.siguiente = siguiente;
        }
    }
}