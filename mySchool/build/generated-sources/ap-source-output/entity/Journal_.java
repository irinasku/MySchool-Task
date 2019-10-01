package entity;

import entity.Person;
import entity.Subject;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-01T12:15:00")
@StaticMetamodel(Journal.class)
public class Journal_ { 

    public static volatile SingularAttribute<Journal, Person> student;
    public static volatile SingularAttribute<Journal, Subject> subject;
    public static volatile SingularAttribute<Journal, Integer> grade;
    public static volatile SingularAttribute<Journal, Long> id;
    public static volatile SingularAttribute<Journal, Date> Date;

}