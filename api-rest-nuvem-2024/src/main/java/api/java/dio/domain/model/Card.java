package api.java.dio.domain.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
@Table(name = "tb_card", uniqueConstraints = @UniqueConstraint(columnNames = "number", name = "UK_tb_card_number"))

public record Card(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
                   @Column(unique = true)
                   String number,
                   @Column(name = "available_limit", scale = 13, precision = 2)
                   BigDecimal limit) {
}
