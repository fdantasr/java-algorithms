package ExemploAula;
public class Account {
 
    private String name;

    //Contrutores
    public Account(){}
    public Account (String _name){
        
        this.name = _name;
    }
    //

    public void SetName(String _name) {
        this.name = _name;        
    }

    public String getName(){
        return name;
    }
}
