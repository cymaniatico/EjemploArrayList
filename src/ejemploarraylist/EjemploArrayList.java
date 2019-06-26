package ejemploarraylist;

/**
 *
 * @author Luis Carlos Garcia
 */
import java.util.*;

public class EjemploArrayList {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<String> nombreProducto = new ArrayList();
        ArrayList<Integer> valorProducto = new ArrayList();
        boolean continuar= true;
        int decision=1, total = 0, control=0;
        String productoMasAlto="";
        while(continuar){
            System.out.println("Ingrese el nombre del producto");
            nombreProducto.add(leer.next());
            System.out.println("Ingrese el valor del producto");
            valorProducto.add(leer.nextInt());
            System.out.println("Desea ingresar mas productos? (0 para salir)");
            decision = leer.nextInt();
            if(decision==0){
                continuar = false;
            }
        }
        for(int i = 0; i<valorProducto.size(); i++){
            System.out.println(nombreProducto.get(i)+"\t"+valorProducto.get(i));
            total+=valorProducto.get(i);
            if(valorProducto.get(i)>control){
                productoMasAlto = nombreProducto.get(i);
                control = valorProducto.get(i);
            }
        }
        System.out.println("Total: "+total);
        System.out.println("Producto mas alto: "+productoMasAlto+" con "+control);
        
            
    }
    
}
