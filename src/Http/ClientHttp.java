package Http;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientHttp {
    public void getProduto() throws  URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://treino-aee6b-default-rtdb.firebaseio.com/produto.json"))
                .GET()
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
    }
    public void PostProduto(String nome, float preco, float peso, float volume) throws  URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://treino-aee6b-default-rtdb.firebaseio.com/produto.json"))
                .POST(HttpRequest.BodyPublishers.ofString("{\"nome\": \""+nome+"\",\"peso\": \""+peso+"\",\"preco\": \""+preco+"\",\"volume\": \""+volume+"\"}"))
                .build();
         HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Produto Adicionado com Sucesso e seu Id  é "+httpResponse.body());

    }
    public void PutProduto(String key,String nome, float preco, float peso, float volume) throws  URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://treino-aee6b-default-rtdb.firebaseio.com/produto/"+key+".json"))
                .PUT(HttpRequest.BodyPublishers.ofString("{\"nome\": \""+nome+"\",\"peso\": \""+peso+"\",\"preco\": \""+preco+"\",\"volume\": \""+volume+"\"}"))
                .build();
         HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Poduto Modificado com Sucesso "+httpResponse.body());

    }
    public void deleteProduto(String key) throws  URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://treino-aee6b-default-rtdb.firebaseio.com/produto/"+key+".json"))
                .DELETE()
                .build();
         HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("O Produto foi Deletado com Sucesso "+httpResponse.body());

    }
}
