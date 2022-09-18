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
public class Ejecucion_Pila {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();

        System.out.println("<<-- Ejemplo de Pila -->>\n\n");
        int num1;
        
        System.out.println("Para dejar de añadir numeros digite -1");
        System.out.print("numero: ");
        num1 = sc.nextInt();
        
        while (num1 != -1) {     
            System.out.print("numero: ");
            pila.apilar(num1);
            num1 = sc.nextInt();
        }
        
        System.out.println("<<-- Pila -->>");
        pila.listar();
        System.out.println("\n<<-- Tamaño -->");
        System.out.println(pila.getTamanio());

        System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
        pila.retirar();
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Actualizar el valor del nodo con el valor 12 por 24 -->>");
        pila.editar(12, 44);
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Eliminar el nodo con el valor 16 -->>");
        pila.remover(16);
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Consulta si existe el valor 65 -->>");
        System.out.println(pila.buscar(65));

        System.out.println("\n<<-- Elimina la pila -->>");
        pila.eliminar();

        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
        System.out.println(pila.esVacia());

        System.out.println("\n\n<<-- Fin de ejemplo pila -->>");
    }

    private static class Pila {

        private Nodo inicio;// tope de la pila.    
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

            Nodo nuevo = new Nodo(); // Define un nuevo nodo.        
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
            Nodo aux = inicio; // Crea una copia de la pila.
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
                Nodo pilaAux = null;
                // Recoore la pila hasta llegar al nodo que tenga el valor
                // igual que el de referencia.
                while (referencia != inicio.getValor()) {
                    // Crea un nodo temporal para agregarlos a la pila auxiliar.
                    Nodo temp = new Nodo();
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
                Nodo pilaAux = null;
                // Recoore la pila hasta llegar al nodo que tenga el valor
                // igual que el de referencia.
                while (referencia != inicio.getValor()) {
                    // Crea un nodo temporal para agregarlos a la pila auxiliar.
                    Nodo temp = new Nodo();
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
            Nodo aux = inicio;
            // Recorre la pila hasta el ultimo nodo.
            while (aux != null) {
                System.out.println("|\t" + aux.getValor() + "\t|");
                System.out.println("-----------------");
                aux = aux.getSiguiente();
            }
        }
    }

    private static class Nodo {
        // Variable en la cual se va a guardar el valor.

        private int valor;
        // Variable para enlazar los nodos.
        private Nodo siguiente;

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

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
}
