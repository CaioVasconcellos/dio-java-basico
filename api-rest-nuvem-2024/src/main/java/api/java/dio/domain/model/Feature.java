package api.java.dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_feature")
public class Feature extends BaseItem {
    public Feature() {
    }

    public Feature(String icon, String description) {

    }
}
