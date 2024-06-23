package com.example.demo.model;




import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "promos")
public class Promo {
    @Id
    private String id; // Use String para id no MongoDB
    private String site;
    private String title;
    private String link;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double price;
}
