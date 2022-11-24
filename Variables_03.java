// Las variables van a ir cambiando con el paso del tiempo
// Son contenedores de informacion

// primitivos: enteros y flotantes, strings
// referenciados: clases, interfaces, arrays


// Importante las variables que estan dentro del metodo solo viviran para ese metodo
// que es su alcance.
public class Variables_03{
    public static void main(String args[]){
        int variable = 15;
        // tipo + nombre + asignacion + valor
        System.out.println("El numero entero es: " + variable); 

        // Reasignando valor 
        variable = 10;
        System.out.println("El nuevo valor del numero entero es: " + variable);

        String nombre = "Gerardo";
        System.out.println("Imprimiendo a mi variable tipo texto: " + nombre);

        nombre = "Pedro";
        System.out.println("Imprimiendo el nuevo valor de la variable texto: " + nombre);
    }
}