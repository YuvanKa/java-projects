import java.util.*;

class Car {
    String chassis;
    String body;
    String paint;
    String engine;
    String interior;
    String status;

    Car() {
        this.chassis = "";
        this.body = "";
        this.paint = "";
        this.engine = "";
        this.interior = "";
        this.status = "Incomplete";
    }
}

class AssemblyLine {
    void chassisAssembly(Car car) {
        car.chassis = "Assembled";
    }

    void bodyAssembly(Car car) {
        car.body = "Attached";
    }

    void painting(Car car) {
        car.paint = "Painted";
    }

    void engineInstallation(Car car) {
        car.engine = "Installed";
    }

    void interiorInstallation(Car car) {
        car.interior = "Installed";
    }

    void finalAssembly(Car car) {
        car.status = "Complete";
    }
}

class QualityControl {
    boolean visualInspection(Car car) {
        return true; // Placeholder for actual inspection logic
    }

    boolean mechanicalInspection(Car car) {
        return true; // Placeholder for actual inspection logic
    }

    boolean electricalInspection(Car car) {
        return true; // Placeholder for actual inspection logic
    }

    boolean safetyInspection(Car car) {
        return true; // Placeholder for actual inspection logic
    }

    boolean performanceTesting(Car car) {
        return true; // Placeholder for actual inspection logic
    }
}

class ClassificationSystem {
    void classify(Car car, List<Boolean> qcResults) {
        if (qcResults.stream().allMatch(result -> result)) {
            car.status = "Good";
        } else {
            car.status = "Defective";
        }
    }
}

public class CarManufacturingSystem {
    public static void main(String[] args) {
        AssemblyLine assemblyLine = new AssemblyLine();
        QualityControl qualityControl = new QualityControl();
        ClassificationSystem classificationSystem = new ClassificationSystem();

        Car car = new Car();

        assemblyLine.chassisAssembly(car);
        assemblyLine.bodyAssembly(car);
        assemblyLine.painting(car);
        assemblyLine.engineInstallation(car);
        assemblyLine.interiorInstallation(car);
        assemblyLine.finalAssembly(car);

        List<Boolean> qcResults = Arrays.asList(
            qualityControl.visualInspection(car),
            qualityControl.mechanicalInspection(car),
            qualityControl.electricalInspection(car),
            qualityControl.safetyInspection(car),
            qualityControl.performanceTesting(car)
        );

        classificationSystem.classify(car, qcResults);

        System.out.println("Car status: " + car.status);
    }
}
