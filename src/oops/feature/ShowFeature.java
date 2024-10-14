package oops.feature;

import java.util.List;

public class ShowFeature extends Features{

  public void doFeature(){
    System.out.println("i lounch new feature");
  }

  @Override
  public void saveFeature() {

  }

  @Override
  public void getFeature() {

  }

  public static void main(String[] args) {
     ShowFeature showFeature = new ShowFeature();
     showFeature.doFeature();
    Listing listing = new SoldProduct();
    listing.products(12);
  }
}
