package lab10;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();

         //Execute various tests

        testDraw(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testTextAndColor(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testResize(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testConnect(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testAllCommands(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testSimpleUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testComplexUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));
    }

    private static void testDraw(Client client) {
        client.newDiagram();
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.showDiagram();
    }

    private static void testTextAndColor(Client client) {
        testDraw(client);
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("draw rectangle");
        client.executeAction("change text", "0", "MyClass1");
        client.executeAction("change text", "5", "MyClass2");
        client.showDiagram();
    }

    private static void testConnect(Client client) {
        client.executeAction("connect", "3", "5");
        client.showDiagram();
    }

    private static void testResize(Client client) {
        client.executeAction("resize", "2", "20", "20");
        client.showDiagram();
    }

    private static void testAllCommands(Client client) {
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("change color", "2", "PURPLE");
        client.executeAction("change text", "0", "test");
        client.executeAction("change text", "1", "secondTest");
        client.executeAction("resize", "3", "20", "20");
        client.executeAction("resize", "4", "50", "50");
        client.executeAction("resize", "5", "100", "100");
        client.executeAction("connect", "3", "5");
        client.executeAction("connect", "2", "1");
        client.showDiagram();
    }

    private static void testSimpleUndoRedo(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("change color", "0", "ORANGE");
        client.showDiagram();

        client.executeAction("draw rectangle");
        client.showDiagram();

        client.undo();
        client.showDiagram();

        client.redo();
        client.showDiagram();
    }

    private static void testComplexUndoRedo(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.showDiagram();

        client.executeAction("resize","0", "50", "50");
        client.executeAction("resize", "1", "20", "30");
        client.showDiagram();

        client.undo();
        client.showDiagram();
        client.undo();
        client.showDiagram();

        client.redo();
        client.showDiagram();
        client.redo();
        client.showDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.showDiagram();

        client.undo();
        client.showDiagram();

        client.undo();
        client.showDiagram();

        client.redo();
        client.showDiagram();

        client.redo();
        client.showDiagram();

        client.executeAction("change text", "0", "first");
        client.executeAction("change text", "1", "second");
        client.executeAction("change text", "2", "third");
        client.showDiagram();

        client.undo();
        client.showDiagram();

        client.redo();
        client.showDiagram();

        client.executeAction("change color", "0", "red");
        client.showDiagram();

        client.executeAction("resize", "0", "50", "50");
        client.executeAction("connect", "2", "1");
        client.showDiagram();

        client.undo();
        client.showDiagram();

        client.redo();
        client.showDiagram();
    }
}
