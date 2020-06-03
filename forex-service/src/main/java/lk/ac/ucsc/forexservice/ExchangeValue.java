package lk.ac.ucsc.forexservice;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Exchange_Value")
public class ExchangeValue {

    @Id
    private Long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    private double conversionRate;
    private int port;

    public ExchangeValue() {
    }

    public ExchangeValue(Long id, String from, String to, double conversionRate) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionRate = conversionRate;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getFrom() {
        return from;
    }

//    public void setFrom(String from) {
//        this.from = from;
//    }

    public String getTo() {
        return to;
    }

//    public void setTo(String to) {
//        this.to = to;
//    }

    public double getConversionRate() {
        return conversionRate;
    }

//    public void setConversionRate(double conversionRate) {
//        this.conversionRate = conversionRate;
//    }


    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


}
