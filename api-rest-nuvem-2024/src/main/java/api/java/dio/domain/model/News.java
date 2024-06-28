package api.java.dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_news")
public class News extends BaseItem {

    public News(String icon, String description) {
    }

    public News() {

    }
}
