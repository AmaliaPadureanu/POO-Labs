package lab9;

import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy {

    DataRepository dataRepository;
    List<SensorData> list = dataRepository.getStoredData();

    @Override
    public int getTotalSteps() {
        int totalSteps = 0;
        for(SensorData s : list)
            totalSteps += s.getStepsCount();
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.BASIC_STRATEGY;
    }
}
