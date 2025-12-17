
import java.time.Localdate;

public class StudentEntity{
    public StudentEntity(){
    }
    public StudentEntity(int id,String name,Localdate date,float cgpa){
        this.id=id;
        this.name=name;
        this.date=date;
    }
}