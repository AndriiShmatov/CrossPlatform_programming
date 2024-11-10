package lab5;

import java.util.ArrayList;
import java.util.List;

public class ReviewManager {
    private List<Review> reviews = new ArrayList<>();

    public void manageReviews() {
        System.out.println("=== Управління відгуками ===");
        // Додайте код для роботи з відгуками (CRUD)
    }
}

class Review {
    private int id;
    private int clientId;
    private int appointmentId;
    private String reviewText;

    public Review(int id, int clientId, int appointmentId, String reviewText) {
        this.id = id;
        this.clientId = clientId;
        this.appointmentId = appointmentId;
        this.reviewText = reviewText;
    }

    @Override
    public String toString() {
        return "Review{" + "ID=" + id + ", ClientID=" + clientId +
                ", AppointmentID=" + appointmentId + ", Review='" + reviewText + "'}";
    }
}

