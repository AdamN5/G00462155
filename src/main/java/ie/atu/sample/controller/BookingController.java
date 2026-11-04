package ie.atu.sample.controller;

import ie.atu.sample.model.Booking;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
    private final BookingService bookingService;
    private final BookingRepository bookingRepository;

    Booking booking = new Booking();

    public BookingController(BookingService bookingService, BookingRepository bookingRepository) {
        this.bookingService = bookingService;
        this.bookingRepository = bookingRepository;
    }

    @PostMapping
    public Booking create(Booking booking) {
        return bookingService.create(booking);
    }


    @GetMapping
    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }

    @PostMapping("/create")
    public Booking createBooking(Booking booking) {
        return bookingService.create(booking);
    }



}