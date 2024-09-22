public class PersonalContact extends InputContact{
    String relation;

    public PersonalContact(String name, String phonenum, String relation) {
        super(name, phonenum);
        this.relation = relation;
    }

    @Override
    public String toString(){
        return "\n" + "이름 : " + name + "\n" + "연락처 : " + phonenum + "\n" + "관걔 : " + relation;
    }
}
