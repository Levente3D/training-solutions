package classstructuremethods;


public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Kis Béla");
        client.setYear(1978);
        client.setAddress("1172. VI. utca 7.");

        System.out.println("Az Ön neve: " + client.getName());
        System.out.println("Az Ön születési ideje: " + client.getYear());
        System.out.println("Az ön címe: " + client.getAddress());
        client.migrate("1172 X. utca 4.");
        System.out.println("Címét sikeresen megváltoztatta, új címe: " + client.getAddress());

    }
}
