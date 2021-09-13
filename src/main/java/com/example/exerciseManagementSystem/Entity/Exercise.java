package com.example.exerciseManagementSystem.Entity;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "exercisemanager")
public class Exercise implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "area")
    private String area;
    @Column(name = "instructions")
    private String instructions;
    @Column(name = "imageUrl")
    private String imageUrl;

    public Exercise() {
    }

    public Exercise(final String name, final String area, final String instructions, final String imageUrl) {
        this.name = name;
        this.area = area;
        this.instructions = instructions;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(final String area) {
        this.area = area;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public void setInstructions(final String instructions) {
        this.instructions = instructions;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Exercise)) {
            return false;
        }
        final Exercise exercise = (Exercise)object;
        return Objects.equals(this.id, exercise.id) && Objects.equals(this.name, exercise.name) && Objects.equals(this.area, exercise.area) && Objects.equals(this.instructions, exercise.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.area, this.instructions);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                ", id=" +this.id + '\'' +
                ", name="+this.name + '\'' +
                ", area=" +this.area + '\'' +
                ", instructions=" + this.instructions + '\'' +
                ", imageUrl=" +this.imageUrl + '\'' +
                "}";
    }
}