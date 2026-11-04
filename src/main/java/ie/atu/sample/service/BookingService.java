package ie.atu.sample.service;

import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    public Booking create(Booking booking){
        BookingRepository repository = bookingRepository;
        return repository.save(booking);
    }
}

