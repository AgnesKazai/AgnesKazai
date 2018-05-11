package main.java.reservation;

import java.util.Random;

public class Reservation implements Reservationy {

    protected String dowBooking;
    protected String codeBookig;
    public String reservation;

    Random rnd = new Random();


    public Reservation() {
        getCodeBooking();
        getDowBooking();
        stringFormat();
    }

    public void stringFormat(){
        reservation = String.format("Booking# %1$s for %2$s", codeBookig, dowBooking);
    }


    @Override
    public String getDowBooking() {
        String[] dowChar = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int index = (int) (rnd.nextInt(7));
        dowBooking = dowChar[index];

        return dowBooking;
    }

    @Override
    public String getCodeBooking() {
        String codechar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder code = new StringBuilder();
        while (code.length() < 8) {
            int index = (int) (rnd.nextFloat() * codechar.length()-1);
            code.append(codechar.charAt(index));
        }
        codeBookig = code.toString();
        return codeBookig;
    }
}
