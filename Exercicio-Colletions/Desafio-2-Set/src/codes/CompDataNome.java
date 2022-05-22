package codes;

import java.util.Comparator;

public class CompDataNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        Integer data = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(data != 0) return data;
        Integer nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return data;
        return data;
    }
}
