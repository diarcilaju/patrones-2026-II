public class DocumentClient {
    static void main() {
        //Crear el prototipo
        Document template=new Document("Template","content");
        template.addSection(new Section("Header","..."));
        template.addSection(new Section("Body","..."));

        //Clonar el prototipo
        Document clon1=(Document) template.clone();
        clon1.addSection(new Section("Footer","..."));

    }
}
