package _800_API;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MeAPI {

	public static void main(String[] args) throws IOException {

		OkHttpClient client = new OkHttpClient().newBuilder().build();
		Request request = new Request.Builder().url("https://gorest.co.in/public-api/users?first_name=Yvonne")
				.method("GET", null).addHeader("Authorization", "Bearer AQtHSl6AMFDe7ON9WZvC5xHeBA9UOlwytLG0").build();
		
		Response response = client.newCall(request).execute();
		
		System.out.println(response);
		System.out.println(response.toString());
		

	}

}
