package lab9.task1;

import static lab9.task1.Utils.BASIC_STRATEGY;
import static lab9.task1.Utils.FILTERED_STRATEGY;

public class StepCountStrategyFactory {

    public static StepCountStrategy createStrategy(String strategyType) {
        switch (strategyType) {
            case BASIC_STRATEGY: return new BasicStepCountStrategy();
            case FILTERED_STRATEGY: return new FilteredStepCountStrategy();
        }
        throw new IllegalArgumentException("The strategy type " + strategyType + " is not recognized.");
    }
}
