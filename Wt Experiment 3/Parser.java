package sha;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
public class Parser {
	public static void main(String[] args)throws Exception {
		//Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		//Build Document
		Document document = builder.parse(new File("C:\\Users\\sharon\\Desktop\\wt\\Three\\src\\sha\\users.xml"));
		//Normalize the XML Structure; It's just too important !!
		//document.getDocumentElement().normalize();
		// TODO Auto-generated method stub
		//Here comes the root node
		Element root = document.getDocumentElement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User Id");
		String id=br.readLine();
		//Get all employees
		NodeList nList = document.getElementsByTagName("user");
		System.out.println(root.getNodeName());
		System.out.println("============================");
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
			Node node = nList.item(temp);
			System.out.println(""); //Just a separator
			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				//Print employee's details of given id
				Element eElement = (Element) node;
				if(eElement.getAttribute("id").equals(id))
				{
					System.out.println("Employee id : " + eElement.getAttribute("id"));
					System.out.println("First Name : " +
							eElement.getElementsByTagName("firstName").item(0).getTextContent());
					System.out.println("Last Name : " +
							eElement.getElementsByTagName("lastName").item(0).getTextContent());
					System.out.println("Location : " +
							eElement.getElementsByTagName("location").item(0).getTextContent());
				}
			}
		}
	}
}


