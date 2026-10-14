public class Section implements Prototype{
    private String title;
    private String body;

    public Section(String title, String body){
        this.title=title;
        this.body=body;
    }

    private Section(Section other){
        this.title=other.title;
        this.body=other.body;
    }

    @Override
    public Section clone() {
        return new Section(this);
    }
}
