// aprendiendo a concatenar en las variables

public class ConcatenacionEnVariables_04{
    
    public static void main(String args[]){

        var usuario = "Juan";
        var titulo = "Administrador";
        var union = usuario +" es "+ titulo;
        System.out.println(union);

        // Caso especial 
        var numero = 10;
        var numerodos = 4;
        System.out.println(numero + numerodos + "Suma los valores");
        System.out.println(numero + numerodos + usuario + " se realiza una suma y luego concatena el valor: ");
        System.out.println("concatena todos los valores: " + usuario +  numero + numerodos);
        
        // con parentisis se modifica la prioridad para evitar estos casos especiales
    }
}