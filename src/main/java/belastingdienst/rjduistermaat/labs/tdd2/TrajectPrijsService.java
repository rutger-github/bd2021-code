package belastingdienst.rjduistermaat.labs.tdd2;

public class TrajectPrijsService {
    private TrajectNaarTrajectEenhedenServiceInterface trajectNaarTrajectEenhedenService;
    private TrajectEenhedenNaarPrijsServiceInterface trajectEenhedenNaarPrijsService;

    public TrajectPrijsService(
            TrajectNaarTrajectEenhedenServiceInterface trajectNaarTrajectEenhedenService,
            TrajectEenhedenNaarPrijsServiceInterface trajectEenhedenNaarPrijsService
    ) {
        this.trajectNaarTrajectEenhedenService = trajectNaarTrajectEenhedenService;
        this.trajectEenhedenNaarPrijsService = trajectEenhedenNaarPrijsService;
    }

    public int getTrajectPrijs(String from, String to) {
        var eenheden = this.trajectNaarTrajectEenhedenService.getTrajectEenheden(from, to);
        return this.trajectEenhedenNaarPrijsService.getPriceTrajectEenheden(eenheden);
    }

}
