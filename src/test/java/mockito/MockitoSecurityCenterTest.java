package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockitoSecurityCenterTest {

    SecurityCenter securityCenter;

    @Test
    public void shouldUseMockito() {
        DoorPanel mockDoorPanel = Mockito.mock(DoorPanel.class);
        securityCenter = new SecurityCenter(mockDoorPanel);
        securityCenter.switchOn();
        Mockito.verify(mockDoorPanel).close();
    }
}
