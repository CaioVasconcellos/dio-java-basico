package api.java.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
@Table(name = "tb_account", uniqueConstraints = @UniqueConstraint(columnNames = "number", name = "UK_tb_account_number"))
public record Account(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
                      @Column(unique = true)
                      String number,
                      String agency,
                      @Column(scale = 13, precision = 2)
                      BigDecimal balance,
                      @Column(name = "additional_limit",scale = 13, precision = 2)
                      BigDecimal limit
) {
}
