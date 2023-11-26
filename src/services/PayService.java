package services;

public class PayService {
	
	   private TaxService taxService;
	   
	   private DeliveryService deliveryService;
	   
	   public PayService(TaxService taxService, DeliveryService deliveryService ) {
		   this.taxService = taxService;
		   this.deliveryService = deliveryService;
	   }
	   
       public double finalPrice(double cost, String state) {
    	   return cost + deliveryService.fee(state)+ taxService.tax(cost);
       }
}
