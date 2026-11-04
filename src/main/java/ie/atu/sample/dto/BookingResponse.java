package ie.atu.sample.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookingResponse {
    private Long id;
    private Long roomId;
    private String RoomName;
    private String organiserName;
    private Long attendeeCount;
    private boolean status;

}