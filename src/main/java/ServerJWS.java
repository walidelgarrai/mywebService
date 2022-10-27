import jakarta.xml.ws.Endpoint;
import ws.BanqueService;
//wsdl c'est un fichier xml qui permet de faire la description de l'interface Web Service
public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web Service déployé sur http://0.0.0.0:9191/");
    }
}
