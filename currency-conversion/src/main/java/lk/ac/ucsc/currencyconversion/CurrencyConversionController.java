package lk.ac.ucsc.currencyconversion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

    private static final Logger logger = LoggerFactory.getLogger(CurrencyConversionController.class);

    @Autowired
    private ForexServiceProxy forexService;
    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from,
                                                  @PathVariable String to,
                                                  @PathVariable double quantity) {
        CurrencyConversionBean response = forexService.retrieveExchangeValue(from, to);
        return new CurrencyConversionBean(response.getId(), from, to, response.getConversionRate(), quantity,
                quantity * (response.getConversionRate()), response.getPort());
    }
}
