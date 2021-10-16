package etapa3_questao4;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;


public class SomadorAdapter implements SomadorEsperado {

    SomadorExistente se = new SomadorExistente();

    @Override

    public int somaVetor(int[] vetor) {

        List<Integer> lista = Arrays.stream(vetor).boxed().collect(Collectors.toList());
        
        return se.somaLista(lista);
    }
    
}
