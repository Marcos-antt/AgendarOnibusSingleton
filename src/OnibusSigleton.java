import java.util.HashSet;
import java.util.Set;

public class OnibusSigleton {
    private  static final OnibusSigleton INSTANCE = new OnibusSigleton();
    private Set<String> assentosDisponiveis;

    public static OnibusSigleton getInstance(){
        return INSTANCE;
    }

    private OnibusSigleton(){
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1A");
    }
    public boolean bookAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }
}
