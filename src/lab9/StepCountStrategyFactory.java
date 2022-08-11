package lab9;

public class StepCountStrategyFactory {

    public static StepCountStrategy createStrategy(String strategyType) {
        switch (strategyType) {
            case Utils.BASIC_STRATEGY: return new BasicStepCountStrategy();
            case Utils.FILTERED_STRATEGY: return new FilteredStepCountStrategy();
        }
        throw new IllegalArgumentException("The strategy type " + strategyType + " is not recognized.");
    }
}
