package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        Client.setName("Kis Béla");
        Client.setYear(1978);
        Client.setAddress("1172. VI. utca 7.");

        System.out.println("Az Ön neve: " + Client.getName());
        System.out.println("Az Ön születési ideje: " + Client.getYear());
        System.out.println("Az ön címe: " + Client.getAddress());
        client.migrate("1172 X. utca 4.");
        System.out.println("Címét sikeresen megváltoztatta, új címe: " + Client.getAddress());

    }
}