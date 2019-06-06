package suport;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator2 {

    public static String dataHoraParaArquivo(){

        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyMMddhhmmss").format(ts);

    }
}
