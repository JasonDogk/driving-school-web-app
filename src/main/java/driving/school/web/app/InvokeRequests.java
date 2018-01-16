package driving.school.web.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import driving.school.web.app.entity.AdministrationTable;

public class InvokeRequests {

	public static void main(String[] args) {
		List<Object> response = getRequests("administrationTable/username/aa/password/aa");

	}

	public static List<Object> getRequests(String appendURL) {

		String staticUrl = new String("http://localhost:8080/driving-school-web-app-0.0.1-SNAPSHOT/");
		List<Object> listToReturn = new ArrayList<Object>();

		staticUrl += appendURL;
		try {
			URL url = new URL(staticUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				ObjectMapper mapper = new ObjectMapper();
				AdministrationTable obj = mapper.readValue(output, AdministrationTable.class);
				System.err.println(obj.toString());
				listToReturn.add(obj);
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} // TODO: handle exception

		return listToReturn;
	}

}
