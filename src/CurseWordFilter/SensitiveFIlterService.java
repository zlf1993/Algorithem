package CurseWordFilter;

import java.util.Set;

public class SensitiveFIlterService {

    private Set sensitiveWordSet = null;

    private static SensitiveFIlterService instance = null;

    private SensitiveFIlterService(){
        sensitiveWordSet = new SensitiveWordInit().initKeyWord();
    }

    public static SensitiveFIlterService getInstance(){
        if (instance == null){
            instance = new SensitiveFIlterService();
        }
        return instance;
    }

}
