package lab9.task1;

import static lab9.task1.Utils.BASIC_STRATEGY;
import static lab9.task1.Utils.FILTERED_STRATEGY;

public class DataAggregator implements Observer {
    private String strategy;
    public DataAggregator(String strategy) {
        this.strategy = strategy;
    }

@Override
    public void update() {
    StepCountStrategy stepCountStrategy;
        switch (strategy) {
            case BASIC_STRATEGY -> {
                stepCountStrategy =  new BasicStepCountStrategy();
                System.out.println(stepCountStrategy.getTotalSteps());
            }
            case FILTERED_STRATEGY -> {
                stepCountStrategy = new FilteredStepCountStrategy();
                System.out.println(stepCountStrategy.getTotalSteps());
            }
        }
    }
}
