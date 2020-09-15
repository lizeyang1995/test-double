package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;
import java.util.Collections;

import static org.mockito.Mockito.*;

public class MockitoGradeServiceTest {

    GradeService gradeService;

    @Test
    public void shouldUseMockito() {
        GradeSystem stubGradeSystem = Mockito.mock(GradeSystem.class);
        gradeService = new GradeService(stubGradeSystem);
        when(stubGradeSystem.gradesFor(123L)).thenReturn(Collections.singletonList(90.0));
        Assertions.assertEquals(90, gradeService.calculateAverageGrades(123L));
    }
}
