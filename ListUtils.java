import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ListUtils {
//    a. Método que retorna quantas ocorrências de um elemento estão na lista
    public int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (Integer i: l) {
            if (i == el) {
                count++;
            }
        }
        return count;
    }

//    b. Método que retorna true se l tem elementos repetidos
//    boolean hasRepeat(ArrayList< Integer > l)
//
//    c. Método que retorna o número de elementos repetidos em l
//    int nroRepeat(ArrayList< Integer > l)
//
//    d. Método que retorna uma lista de elementos repetidos de l
    public ArrayList<Integer> listRepeat(ArrayList< Integer > l) {
        Collections.sort(l);
        ArrayList<Integer> retorno = new ArrayList<>();
        for (int i = 0; i < l.size()-1; i++) {
            if (Objects.equals(l.get(i), l.get(i + 1)) && !retorno.contains(l.get(i))) {
                retorno.add(l.get(i));
                i++;
            }
        }
        return retorno;
    }
//
//    e. Método que retorna a união de l1 e l2
//    ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2)
//
//    f. Método que retorna a intersecção de l1 e l2
//    ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2)
}
