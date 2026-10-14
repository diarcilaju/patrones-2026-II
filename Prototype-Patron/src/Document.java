import java.util.ArrayList;
import java.util.List;

public class Document implements Prototype{
    private String title;
    private String content;
    private List<Section> sections;

    public Document(String title, String content){
        this.title=title;
        this.content=content;
    }


    public Document(Document other){
        this.title=other.title;
        this.content=other.content;
        this.sections=new ArrayList<>();
        for (Section s:other.sections){
            this.sections.add(s.clone());
        }
    }

    @Override
    public Prototype clone() {
        return new Document(this);
    }

    public void addSection(Section section){
        sections.add(section);
    }
}
