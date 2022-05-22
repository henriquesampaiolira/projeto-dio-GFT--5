package codes;

import java.util.Comparator;

public class CompTotal implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        Integer nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;
        Integer data = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(data != 0) return data;
        Integer ide = l1.getIde().compareTo(l2.getIde());
        if(ide != 0) return ide;
        return ide;
    }
}
