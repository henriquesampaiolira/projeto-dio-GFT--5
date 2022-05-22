package codes;

import java.util.Comparator;

public class CompLingNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        Integer nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;
        return nome;
    }
}