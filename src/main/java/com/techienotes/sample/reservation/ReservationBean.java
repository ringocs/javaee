package com.techienotes.sample.reservation;

import com.techienotes.sample.reservation.services.BookingService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by khanhpham on 4/14/15.
 */
@ManagedBean
@SessionScoped
public class ReservationBean implements Serializable {
    @EJB
    private BookingService bookingService;

    private String fullname = "abc";
    private String email;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String doSomething() {
        System.out.println("I'm doing....");
        bookingService.book();
        return "confirmation.jsf";
    }
}
