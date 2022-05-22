package codes;

import java.util.Comparator;

public class CompLingIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita ide1, LinguagemFavorita ide2) {
        Integer ide = ide1.getIde().compareTo(ide2.getIde());
        if(ide != 0) return ide;
        return ide;
    }
}
