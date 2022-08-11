package lab9.task1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static lab9.task1.Utils.FILTERED_STRATEGY;

public class FilteredStepCountStrategy implements StepCountStrategy {

    private static final int MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(60);

    DataRepository dataRepository;
    List<SensorData> list = dataRepository.getStoredData();

    @Override
    public int getTotalSteps() {
        int totalSteps = 0;
        for(SensorData s : list)
            if (s.getStepsCount() < 0) {
                totalSteps += 0;
            } else if (s.getStepsCount() > MAX_DIFF_STEPS_CONSECUTIVE_RECORDS && s.getTimestamp() < TIME_FOR_MAX_DIFF) {
                totalSteps += 0;
            } else {
                totalSteps += s.getStepsCount();
            }
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return FILTERED_STRATEGY;
    }
}
