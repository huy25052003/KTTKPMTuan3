package AdapterChuyenDoiDuLieu;

public class Client {
    public static void main(String[] args) {
        String xmlData = "<person><name>Gia Huy</name><age>22</age></person>";
        String jsonData = "{\"person\":{\"name\":\"Gia Huy\",\"age\":22}}";

        // Tạo đối tượng XML
        XmlData xml = new XmlDataImpl(xmlData);

        // Chuyển đổi XML -> JSON
        JsonData jsonAdapter = new XmlToJsonAdapter(xml);
        System.out.println("Converted JSON:");
        System.out.println(jsonAdapter.getJson());

        // Chuyển đổi JSON -> XML
        String json = "{ \"name\": \"Gia Huy\", \"age\": 22, \"city\": \"HoChiMinh\" }";
        String xmlOutput = JsonToXmlAdapter.convertJsonToXml(json);
        System.out.println("\nConverted XML:");
        System.out.println(xmlOutput);
    }
}
