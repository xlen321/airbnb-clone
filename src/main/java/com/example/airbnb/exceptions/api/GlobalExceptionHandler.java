package com.example.airbnb.exceptions.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.airbnb.exceptions.domain.BookingNotAllowedException;
import com.example.airbnb.exceptions.domain.BookingNotFoundException;
import com.example.airbnb.exceptions.domain.GuestModificationException;
import com.example.airbnb.exceptions.domain.GuestNotFoundException;
import com.example.airbnb.exceptions.domain.RoomNotAvailableException;
import com.example.airbnb.exceptions.domain.RoomNotFoundException;
import com.example.airbnb.exceptions.domain.UnauthorizedActionException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BookingNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleBookingNotFound(
            BookingNotFoundException ex) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiErrorResponse(
                        "BOOKING_NOT_FOUND",
                        ex.getMessage()
                ));
    }

    @ExceptionHandler(BookingNotAllowedException.class)
    public ResponseEntity<ApiErrorResponse> handleBookingNotAllowed(
            BookingNotAllowedException ex) {

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ApiErrorResponse(
                        "BOOKING_NOT_ALLOWED",
                        ex.getMessage()
                ));
    }


    @ExceptionHandler(GuestNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleGuestNotFound(
            GuestNotFoundException ex) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiErrorResponse(
                        "GUEST_NOT_FOUND",
                        ex.getMessage()
                ));
    }

    @ExceptionHandler(GuestModificationException.class)
    public ResponseEntity<ApiErrorResponse> handleGuestModification(
            GuestModificationException ex) {

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ApiErrorResponse(
                        "GUEST_MODIFICATION_NOT_ALLOWED",
                        ex.getMessage()
                ));
    }

    @ExceptionHandler(RoomNotAvailableException.class)
    public ResponseEntity<ApiErrorResponse> handleRoomUnavailable(
            RoomNotAvailableException ex) {

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(new ApiErrorResponse(
                        "ROOM_NOT_AVAILABLE",
                        ex.getMessage()
                ));
    }

    @ExceptionHandler(RoomNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleRoomNotFound(
            RoomNotFoundException ex) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiErrorResponse(
                        "ROOM_NOT_FOUND",
                        ex.getMessage()
                ));
    }


    @ExceptionHandler(UnauthorizedActionException.class)
    public ResponseEntity<ApiErrorResponse> handleUnauthorized(
            UnauthorizedActionException ex) {

        return ResponseEntity
                .status(HttpStatus.FORBIDDEN)
                .body(new ApiErrorResponse(
                        "UNAUTHORIZED_ACTION",
                        ex.getMessage()
                ));
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponse> handleGenericException(
            Exception ex) {

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ApiErrorResponse(
                        "INTERNAL_SERVER_ERROR",
                        "Something went wrong"
                ));
    }
}
