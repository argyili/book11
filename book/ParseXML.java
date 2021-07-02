import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParseXML {
  public static void main(String[] args) throws Exception {
    DocumentBuilder documentBuilder = DocumentBuilderFactory
        .newInstance().newDocumentBuilder();
    Document document = documentBuilder.parse("states.xml");

    System.out.println("Root element :"
        + document.getDocumentElement().getNodeName());

    if (document.hasChildNodes()) {
      printNote(document.getChildNodes());
    }
  }

  private static void printNote(NodeList nodeList) {
    for (int count = 0; count < nodeList.getLength(); count++) {

      Node tempNode = nodeList.item(count);

      // make sure it's element node.
      if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

        // get node name and value
//        System.out.println("\nNode Name =" + tempNode.getNodeName()
//            + " [OPEN]");
//        System.out.println("Node Value ="
//            + tempNode.getTextContent());

        if (tempNode.hasAttributes()) {

          // get attributes names and values
          NamedNodeMap nodeMap = tempNode.getAttributes();

          for (int i = 0; i < nodeMap.getLength(); i++) {
            Node node = nodeMap.item(i);
           // System.out.println("attr name : " + node.getNodeName());
            if (node.getNodeName().equals("name"))
               // System.out.println("attr value : " + node.getNodeValue());
              System.out.println(node.getNodeValue());
            else if (node.getNodeName().equals("lat"))
              System.out.print("  " + node.getNodeValue());
            else if (node.getNodeName().equals("lng"))
              System.out.println(" " + node.getNodeValue());
          }
        }

        if (tempNode.hasChildNodes()) {

          // loop again if has child nodes
          printNote(tempNode.getChildNodes());

        }

//        System.out.println("Node Name =" + tempNode.getNodeName()
//            + " [CLOSE]");

      }

    }

  }

}