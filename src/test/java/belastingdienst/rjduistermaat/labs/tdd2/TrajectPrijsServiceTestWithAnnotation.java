package belastingdienst.rjduistermaat.labs.tdd2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TrajectPrijsServiceTestWithAnnotation {
    @InjectMocks
    private TrajectPrijsService target;
    @Mock
    private TrajectNaarTrajectEenhedenServiceInterface trajectNaarTrajectEenhedenService;
    @Mock
    private TrajectEenhedenNaarPrijsServiceInterface trajectEenhedenNaarPrijsService;

    @BeforeEach
    void setUp() {
//        this.trajectNaarTrajectEenhedenService = mock(TrajectNaarTrajectEenhedenService.class);
//        this.trajectEenhedenNaarPrijsService = mock(TrajectEenhedenNaarPrijsService.class);
//
//        this.target = new TrajectPrijsService(
//                this.trajectNaarTrajectEenhedenService,
//                this.trajectEenhedenNaarPrijsService
//        );


    }

    @Test
    void getTrajectPrijs() {

        when(this.trajectNaarTrajectEenhedenService.getTrajectEenheden("Amsterdam", "Apeldoorn")).thenReturn(6);
        when(this.trajectEenhedenNaarPrijsService.getPriceTrajectEenheden(6)).thenReturn(17);
        int actual = this.target.getTrajectPrijs("Amsterdam", "Apeldoorn");

        Assertions.assertEquals(17, actual);
    }

    @Test
    void getTrajectPrijsInvalidLocation() {
        when(this.trajectNaarTrajectEenhedenService.getTrajectEenheden("Amsterdam", "Bestaatteeeniet"))
                .thenThrow(InvalidLocationException.class);

        Assertions.assertThrows(InvalidLocationException.class, () -> {
            int actual = this.target.getTrajectPrijs("Amsterdam", "Bestaatteeeniet");
        });

        var thrown = org.assertj.core.api.Assertions.catchThrowable(() -> {
            int actual = this.target.getTrajectPrijs("Amsterdam", "Bestaatteeeniet");
        });
        org.assertj.core.api.Assertions.assertThat(thrown).isExactlyInstanceOf(InvalidLocationException.class);
    }
}