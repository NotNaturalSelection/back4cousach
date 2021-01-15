package code.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agents", schema = "s265482")
public class Agent {

    public Agent() {
    }

    public Agent(int id, String md5) {
        this.id = id;
        this.md5 = md5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "md5")
    private String md5;
}
