package teste;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Teste {
    
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        
        var buscaDoLivro = leitura.nextLine();
        
        String localPesquisa = "https://www.google.com/search?tbm=bks" + buscaDoLivro + "&apikey=c2fcf44f";
        
         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(localPesquisa))
            .build();
        
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        
        System.out.println(response.body());
        
    }
    
}
