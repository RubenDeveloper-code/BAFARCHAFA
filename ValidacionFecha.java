import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Locale;

class ValidacionFecha {
    final static int THREEMOUNTHSDAYS = 90;
    ValidacionFecha() {}
    public String getFechaDeCaducidad() {
        int currentDayJulianCalendar = LocalDate.now().getDayOfYear();
        int daysRecommendedUse = (int)Math.random()*THREEMOUNTHSDAYS;
        int fechaCaducidad = currentDayJulianCalendar + daysRecommendedUse;
        Year y = Year.of(LocalDate.now().getYear());
        String fechaCaducidadCasiFormateada = y.atDay(fechaCaducidad).toString();
        SimpleDateFormat sdfin = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfout = new SimpleDateFormat("dd/MM/yyyy");
        String finalformatFechaCaducidad;
        try {
            Date dat = sdfin.parse(fechaCaducidadCasiFormateada);
            finalformatFechaCaducidad = sdfout.format(dat);
        } catch(Exception e) {
            return "A ocurrido un error al intentar procesar la fecha";
        }
        return finalformatFechaCaducidad;
    }
}
