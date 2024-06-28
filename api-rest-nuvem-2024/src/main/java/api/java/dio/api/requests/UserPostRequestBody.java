package api.java.dio.api.requests;
import api.java.dio.domain.model.Feature;
import api.java.dio.domain.model.News;

import java.util.List;

public record UserPostRequestBody(
        String name,
        String accountNumber,
        String accountAgency,
        String cardNumber,
        List<Feature> features,
        List<News> news) {

}


