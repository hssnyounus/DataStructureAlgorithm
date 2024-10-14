package oops.feature;

public class FeatureWorking implements FeatureImplementation{
  public void workingOnFeatures() {
    System.out.println(" working on new features");
  }

  public static void main(String[] args) {
    FeatureWorking featureWorking = new FeatureWorking();
    featureWorking.workingOnFeatures();
  }
}
