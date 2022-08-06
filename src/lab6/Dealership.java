package lab6;

import java.util.Calendar;
import java.util.Random;

public class Dealership {
    int discount;
    int finalPrice;

    class BrandOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
             discount = switch (car.getType()) {
                case BMW -> {
                    yield discount = 5 * car.getPrice() / 100;
                }
                case AUDI -> {
                   yield  discount = 10 * car.getPrice() / 100;
                }
                case FORD -> {
                    yield discount = 15 * car.getPrice() / 100;
                }
            };
             System.out.println("Brand discount is " + discount);
            return discount;
        }
    }

     class DealerOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int howOld = currentYear - car.getFabricationYear();
            discount = howOld * 100;
            System.out.println("Dealer discount is " + discount);
            return discount;
        }
    }

    class SpecialOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            Random r = new Random();
            discount = r.nextInt(300);
            System.out.println("Special offer is " + discount);
            return discount;
        }
    }

    public int getFinalPrice(Car car) {
        BrandOffer brandDiscount = new BrandOffer();
        DealerOffer dealerOffer = new DealerOffer();
        SpecialOffer specialOffer = new SpecialOffer();

        finalPrice = car.getPrice() - (brandDiscount.getDiscount(car) + dealerOffer.getDiscount(car) + specialOffer.getDiscount(car));
        System.out.println("Final price is " + finalPrice);
        return finalPrice;
    }

    public void negotiate(Car car, Offer offer) {
        Random r = new Random();
        int acceptance = r.nextInt(2);
        if (acceptance == 0) {
            finalPrice = finalPrice - offer.getDiscount(car);
            System.out.println("Client's offer is applied" + "\n" + "Final price after negotiation " + finalPrice);
        } else {
            System.out.println("Client's offer is not applied" + "\n" + "Final price after negotiation " + finalPrice);
        }
    }
}
