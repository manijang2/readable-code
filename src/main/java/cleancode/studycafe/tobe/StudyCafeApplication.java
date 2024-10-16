package cleancode.studycafe.tobe;

import cleancode.studycafe.tobe.io.provider.SeatLockerFileReader;
import cleancode.studycafe.tobe.io.provider.SeatPassFileReader;
import cleancode.studycafe.tobe.provider.SeatLockerProvider;
import cleancode.studycafe.tobe.provider.SeatPassProvider;

public class StudyCafeApplication {

    public static void main(String[] args) {
        SeatPassProvider seatPassProvider = new SeatPassFileReader();
        SeatLockerProvider seatLockerProvider = new SeatLockerFileReader();
        StudyCafePassMachine studyCafePassMachine = new StudyCafePassMachine(seatPassProvider, seatLockerProvider);
        studyCafePassMachine.run();
    }

}
