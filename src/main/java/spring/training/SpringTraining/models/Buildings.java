package spring.training.SpringTraining.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Buildings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String location;
    private String hostelName;
    @ManyToOne()
    private Owners owner;
}
