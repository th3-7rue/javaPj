package verificamaggio;

import java.util.Comparator;
import java.util.Date;

public class CartellaClinica implements Comparator<CartellaClinica>, Comparable<CartellaClinica>{
    private String nomePaziente, cognomePaziente, codiceFiscale, diagnosi, numeroTelefono;
    private Date dataNascita, dataVisita;
    @Override
    public int compare(CartellaClinica o, CartellaClinica o1) {
        return o.cognomePaziente.compareTo(o1.cognomePaziente);
    }
    @Override
    public int compareTo(CartellaClinica o) {
        return this.cognomePaziente.compareTo(o.cognomePaziente);
    }
    public CartellaClinica(String nomePaziente, String cognomePaziente, String codiceFiscale, String diagnosi,
            String numeroTelefono, Date dataNascita, Date dataVisita) {
        this.nomePaziente = nomePaziente;
        this.cognomePaziente = cognomePaziente;
        this.codiceFiscale = codiceFiscale;
        this.diagnosi = diagnosi;
        this.numeroTelefono = numeroTelefono;
        this.dataNascita = dataNascita;
        this.dataVisita = dataVisita;
    }
    
    @Override
    public String toString() {
        return "CartellaClinica [nomePaziente=" + nomePaziente + ", cognomePaziente=" + cognomePaziente
                + ", codiceFiscale=" + codiceFiscale + ", diagnosi=" + diagnosi + ", numeroTelefono=" + numeroTelefono
                + ", dataNascita=" + dataNascita + ", dataVisita=" + dataVisita + "]";
    }

    public String getNomePaziente() {
        return nomePaziente;
    }
    public String getCognomePaziente() {
        return cognomePaziente;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public String getDiagnosi() {
        return diagnosi;
    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public Date getDataNascita() {
        return dataNascita;
    }
    public Date getDataVisita() {
        return dataVisita;
    }
    
}
