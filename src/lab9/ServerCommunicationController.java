package lab9;

public class ServerCommunicationController implements Observer {

    @Override
    public void update() {
        ServerMessage serverMessage = new ServerMessage(DataRepository.stepsChange, Utils.getClientId(), DataRepository.timeChange);
        System.out.println(serverMessage);
    }
}
