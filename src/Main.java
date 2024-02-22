import java.util.*;

public class Main extends Chat {
    public Main(String name, int id, boolean status) {
        super(name, id, status);
    }
    @Override
    void sendingSms(String message) {
        System.out.println("Отправленное SMS от " + getName().toLowerCase() + " " + getStatus() + " " + getId()+ "\n" + message);

    }
    public static void main(String[] args) {
        Random random = new Random();
         boolean offLine = false;
        boolean online = true;
        boolean status;
        String[] strings = new String[]{"Привет", "Как дела?", "Что делаешь?"};

        for (status = online || offLine; random.nextBoolean() == status; status = online ) ;

        String[] userName = new String[]{"Антон", "Влада", "Алексей"};

        List<Main> mainList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            mainList.add(new Main(userName[new Random().nextInt(userName.length)], i, true));
            mainList.get(i).sendingSms(strings[new Random().nextInt(strings.length)]);
        }
    }
}









