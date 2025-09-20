package dev.naysha.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
    @Id
    private ObjectId id;
    private String body;

    public ObjectId getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Review() {
    }

    public Review(ObjectId id, String body) {
        this.id = id;
        this.body = body;
    }

    public Review(String body) {
        this.body = body;
    }
}
