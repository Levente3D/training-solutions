package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Kis Géza");
        client.setYear(1978);
        client.setAddress("1172 Budapest, VI.u. 7.");

        System.out.println("Az Ön neve: " + client.getName());
        System.out.println("Az Ön születési ideje: " + client.getYear());
        System.out.println("Az Ön lakcíme: " + client.getAddress());

        client.migrate("1148 Budapest, Angol u. 22.");

        System.out.println("Lakcímét módosítottuk a következőre: " + client.getAddress());
    }
}
