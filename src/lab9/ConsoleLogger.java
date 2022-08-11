package lab9;

public class ConsoleLogger implements Observer {

    @Override
    public void update() {
        System.out.println(DataRepository.getStoredData().get(DataRepository.getStoredData().size() - 1)
                + " was added");
    }
}
