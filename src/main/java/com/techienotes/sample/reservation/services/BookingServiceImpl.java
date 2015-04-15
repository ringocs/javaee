package com.techienotes.sample.reservation.services;

import com.techienotes.sample.interceptor.Loggable;

import javax.ejb.Stateless;

/**
 * Created by khanhpham on 4/16/15.
 */
@Stateless
@Loggable
public class BookingServiceImpl implements BookingService {
    @Override
    public boolean book() {
        return false;
    }
}
