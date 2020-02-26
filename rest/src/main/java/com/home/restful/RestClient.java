package com.home.restful;

import org.apache.http.HttpConnection;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;

public class RestClient {

    public void get ( String url) throws IOException {

        CloseableHttpClient     httpClient = HttpClients.createDefault();
        HttpGet httpGet =  new HttpGet(url);

        CloseableHttpResponse closebaleHttpResponse =  httpClient.execute(httpGet);
        int statusCode =  closebaleHttpResponse.getStatusLine().getStatusCode();
        System.out.println("Status Code --->" + statusCode);

        String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF -8");

        JSONObject responseJSON =  new JSONObject(responseString);

                InputStream  in  = new URL(url).openStream();
        try {
            System.out.println( IOUtils.toString( in ) );
        } finally {
            IOUtils.closeQuietly(in);
        }

//        Buffer reader;
//
//
//        BufferedReader br = new BufferedReader(new InputStreamReader( url));

    }

    public static void main(String[] args) {

        BufferedReader reader;
        StringBuffer responseContent = new StringBuffer();
        String line;

        try {
            URL url = new URL("");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            int status = connection.getResponseCode();

            if (status > 299){
                InputStream in;
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

                while ((line = reader.readLine() ) != null {
                    responseContent.append(line);
                }
                reader.close();
            }else {

                InputStream in;
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
