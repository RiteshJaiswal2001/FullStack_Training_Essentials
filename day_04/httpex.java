package day_04;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.io.IOException;
import java.io.InputStream;


public class httpex {

    // class todo {
        //     int userID;
        //     int id;
        //     String title;
        //     boolean completed;

        // }

        // public static <T> HttpResponse.BodyHandler<T> asJson(Class<T> targetType){
        //     return responseInfo -> HttpResponse.BodySubscribers
        //                                             .mapping(
        //                                                 HttpResponse
        //                                                     .BodySubscribers
        //                                                     .ofInputStream(),
        //                                                     ofInputStream ->
        //                                             )
        // }

        private static final String URL = "https://jsonplaceholder.typicode.com/todos/1";
        public static void main(String[] args) {

            //1. create client inst
            HttpClient client = HttpClient.newBuilder()
                                        .connectTimeout(Duration.
                                            ofSeconds(10))
                                        .build();

            
            //2. build the http req.
            HttpRequest req = HttpRequest
                                    .newBuilder()
                                    .uri(URI.create(URL))
                                    .GET() //optional by default.
                                    .build()  ; 
                                    
            try {
                HttpResponse<String> res = client.
                                        send(req, 
                                            HttpResponse
                                            .BodyHandlers
                                            .ofString()) ;  
                
                System.out.println("status code: " + res.statusCode());
                System.out.println("Response Body: " + res.body());;                            
                                                        
            } catch (IOException e) {
                e.printStackTrace();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
}
