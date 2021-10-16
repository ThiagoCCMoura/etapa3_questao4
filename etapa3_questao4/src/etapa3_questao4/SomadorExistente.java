package etapa3_questao4;

import java.util.List;

public class SomadorExistente {
    //lista soma
    public int somaLista(List<Integer> lista) {

        int resultado = 0;

        for (int i : lista) resultado += i;

        return resultado;
    }
}
