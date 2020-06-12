package lk.ac.ucsc.currencyconversion;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "forex-service")
/**
 *a declarative HTTP client
 *  simplifying HTTP API clients
 *  while the actual implementation will be provisioned at runtime.
 *  */

@RibbonClient(name = "forex-service")
/**
 *Inter Process Communication (IPC) cloud library.
 * provides client-side load balancing algorithms
 * */

public interface ForexServiceProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue
            (@PathVariable String from, @PathVariable String to);
}