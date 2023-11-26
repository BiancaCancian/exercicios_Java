package aplication;

import services.TaxService;
import services.DeliveryService;
import services.PayService;

public class program {

    public static void main(String[] args) {
        

        TaxService taxService = new TaxService();
        DeliveryService deliveryService = new DeliveryService();

        PayService payService = new PayService(taxService, deliveryService);
        
        System.out.println("RESULTADO = " + payService.finalPrice(300.0, "SP"));

    }

}

