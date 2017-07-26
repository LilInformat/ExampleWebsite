package com.blackiron.research;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.StringEscapeUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Path("")
public class Research {
	
	private String url = StringEscapeUtils.escapeJava("https://www.alphavantage.co/query?function=SECTOR&apikey=HIWSYFQGZKSJBXPC");
	private String charset = "UTF-8";
	@GET
	@Path("Sector")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSectorInfo() {
		URLConnection connection;
		try {
			connection = new URL(url).openConnection();
			connection.setRequestProperty("Accept-Charset", charset);
			InputStream response = connection.getInputStream();
			Scanner scanner = new Scanner(response);
		    String responseBody = scanner.useDelimiter("\\A").next();
		    Gson gson = new GsonBuilder().create();
		    SectorData data=gson.fromJson(responseBody, SectorData.class);
		    System.out.println(responseBody);
		    scanner.close();
		    return Response.ok().entity(data).build();
		} 
		catch (Exception ex)
		{
			return Response.status(500).build();
		}
	}
	
	@GET
	@Path("Test")
	public String Test()
	{
		return "Hello World";
	}
}
