package api.java.dio.domain.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name = "tb_card")
@Table(name = "tb_card", uniqueConstraints = @UniqueConstraint(columnNames = "number", name = "UK_tb_card_number"))
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;
}
