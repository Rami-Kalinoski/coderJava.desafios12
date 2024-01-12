import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static <List> void main(String[] args) {
        Persona pers1 = new Persona ("Ramón", "Dominguez");
        Persona pers2 = new Persona ("Carlos", "Villalba");
        Persona pers3 = new Persona ("Ignacio", "Gimenez");
        Persona pers4 = new Persona ("Pedro", "Pérez");
        Persona pers5 = new Persona ("Joaquín", "Zárate");

        ArrayList <Persona> listPersonas = new ArrayList<>();
        listPersonas.add(pers1);
        listPersonas.add(pers2);
        listPersonas.add(pers3);
        listPersonas.add(pers4);
        listPersonas.add(pers5);

        // Lista original
        System.out.println("Lista de Personas original:");
        for (Persona pers : listPersonas) {
            System.out.println("-" + pers.getNombre() + " " + pers.getApellido());
        }

        // Ordenar por nombre
        Collections.sort(listPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        System.out.println("\nLista de Personas ordenada por nombre:");
        for (Persona pers : listPersonas) {
            System.out.println("-" + pers.getNombre() + " " + pers.getApellido());
        }

        // Ordenar por apellido
        Collections.sort(listPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getApellido().compareTo(p2.getApellido());
            }
        });
        System.out.println("\nLista de Personas ordenada por apellido:");
        for (Persona pers : listPersonas) {
            System.out.println("-" + pers.getNombre() + " " + pers.getApellido());
        }

        // Ordenar por apellido a la inversa
        Collections.sort(listPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p2.getApellido().compareTo(p1.getApellido());
            }
        });        System.out.println("\nLista de Personas ordenada por apellido:");
        for (Persona pers : listPersonas) {
            System.out.println("-" + pers.getNombre() + " " + pers.getApellido());
        }
    }
}