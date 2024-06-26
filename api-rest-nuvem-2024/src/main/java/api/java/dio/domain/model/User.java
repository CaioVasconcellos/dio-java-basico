package api.java.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public record User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id,
                   String name,
                   @OneToOne(cascade = CascadeType.ALL)
                   @JoinColumn(foreignKey = @ForeignKey(name = "FK_User_Account"))
                   Account account,
                   @OneToOne(cascade = CascadeType.ALL)
                   @JoinColumn(foreignKey = @ForeignKey(name = "FK_Card_Account"))
                   Card card,
                   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
                   @JoinColumn(foreignKey = @ForeignKey(name = "FK_Features_Account"))
                   List<Feature> features,
                   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
                   @JoinColumn(foreignKey = @ForeignKey(name = "FK_News_Account"))
                   List<News> news) {
}
