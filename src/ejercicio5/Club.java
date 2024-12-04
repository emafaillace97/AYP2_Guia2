package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Club {

    private List<Deportista> deportistas;

    public Club(){
        this.deportistas = new ArrayList<>();
    }

    public void agregarDeportista(Deportista... deportistas){
        for(Deportista deportista : deportistas){
            this.deportistas.add(deportista);
        }
    }

    public void hacerEntrenarDeportistas(int cantDias){
        for(Deportista dep : this.deportistas) {
            for (int i = 0; i <= cantDias; i++) {
                dep.competir();
            }
        }
    }

    public void listarDeportistas(){
        for(Deportista dep : this.deportistas){
            System.out.println(dep);
        }
    }

    public static void main(String[] args){
        Club c1 = new Club();
        Futbolista f1 = new Futbolista("Ema", "02/07/97", 1.83, 90, Posicion.DELANTERO);
        Futbolista f2 = new Futbolista("Gaby", "02/07/97", 1.83, 90, Posicion.DEFENSOR);
        Futbolista f3 = new Futbolista("Edu", "02/07/97", 1.83, 90, Posicion.DELANTERO);
        Deportista v1 = new Velocista("Ana", "23/11/76", 1.68, 60, Carrera.CON_POSTA);
        Deportista v2 = new Velocista("Yoli", "23/11/76", 1.68, 60, Carrera.CON_POSTA);
        Deportista v3 = new Velocista("Lili", "23/11/76", 1.68, 60, Carrera.CON_POSTA);
        c1.agregarDeportista(f1, f2, f3, v1, v2, v3);
        c1.hacerEntrenarDeportistas(8);
        c1.listarDeportistas();
    }
}
