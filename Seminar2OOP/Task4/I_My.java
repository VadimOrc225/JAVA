package Seminar2OOP.Task4;

public interface I_My {
    int getUserID();
    default int getAdminID(){
        return 1;
    }
}
