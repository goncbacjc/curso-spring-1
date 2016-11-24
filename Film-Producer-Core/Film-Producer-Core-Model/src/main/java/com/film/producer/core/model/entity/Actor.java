package com.film.producer.core.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.Timestamp;

/**
 * Created by Silvina on 15/11/2016.
 */
@Entity
@Table (name="Actor")
public class Actor {
    @Id
    @Column (name ="actor_id", nullable= false)
    private long id;

    @Column(name = "firt_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name= "last_update")
    private Timestamp lastUpdate;

    public Actor() {  }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
}
