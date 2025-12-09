import java.util.ArrayList;
import java.util.Iterator;

public class pruebas2 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Luna");
        nombres.add("Luis");
        nombres.add("Ana");
        nombres.add("Pedro");

        for (String nombre : edades.keySet()) {
            System.out.println(nombre + " " + edades.get(nombre));
        }

        Iterator<String> it = edades.iterator();
        while (it.hasNext()) {
            String e = it.next();
        }
    }
}
