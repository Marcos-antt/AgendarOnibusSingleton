
public class OnibusTesteSigleton {
    public static void main(String[] args){
        agendarAssento("1A");
        agendarAssento("1A");



    }
    private static void agendarAssento(String assento){
        OnibusSigleton a = OnibusSigleton.getInstance();
        System.out.println(a.bookAssento(assento));
    }
}

