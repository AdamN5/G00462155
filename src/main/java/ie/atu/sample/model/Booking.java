package ie.atu.sample.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
public class Booking {
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    private boolean status;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String organiserName;
    private Long attendeeCount;
}

