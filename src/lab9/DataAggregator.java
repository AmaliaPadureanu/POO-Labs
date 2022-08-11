package lab9;

public class DataAggregator implements Observer {
    private String strategy;
    public DataAggregator(String strategy) {
        this.strategy = strategy;
    }

@Override
    public void update() {
    StepCountStrategy stepCountStrategy;
        switch (strategy) {
            case Utils.BASIC_STRATEGY -> {
                stepCountStrategy =  new BasicStepCountStrategy();
                System.out.println(stepCountStrategy.getTotalSteps());
            }
            case Utils.FILTERED_STRATEGY -> {
                stepCountStrategy = new FilteredStepCountStrategy();
                System.out.println(stepCountStrategy.getTotalSteps());
            }
        }
    }
}
