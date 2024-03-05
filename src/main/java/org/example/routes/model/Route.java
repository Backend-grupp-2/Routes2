package org.example.routes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String start;
    String end;
    String transportType;
    int commuteTime;

    //String weather;

    public Route(String start, String end, String transportType, int commuteTime){
        this.start = start;
        this.end = end;
        this.transportType = transportType;
        this.commuteTime = commuteTime;
    }

}
