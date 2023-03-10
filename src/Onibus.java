import java.util.HashSet;
import java.util.Set;

public class Onibus {
    private  static final Onibus INSTANCE = new Onibus();
    private Set<String> assentosDisponiveis;

    public static Onibus getInstance(){
        return INSTANCE;
    }

    private Onibus(){
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1A");
    }
    public boolean bookAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }
}
