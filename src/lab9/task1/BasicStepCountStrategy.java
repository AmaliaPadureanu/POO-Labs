package lab9.task1;

import java.util.List;

import static lab9.task1.Utils.BASIC_STRATEGY;

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
        return BASIC_STRATEGY;
    }
}
