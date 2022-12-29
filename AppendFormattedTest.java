import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendFormattedTest {
    private StringBuilder sb;

    @BeforeEach
    void setUp() {
        sb = new StringBuilder();
    }

    @Test
    void appendFormatted() {
        ShoppingCart.appendFormatted(sb, "string", 1, 5);
        assertEquals("strin ", sb.toString());
    }

    @Test
    void appendFormattedAlignZero() {
        ShoppingCart.appendFormatted(sb, "string", 0, 5);
        assertEquals("strin ", sb.toString());
    }
    @Test
    void appendFormattedBefore() {
        ShoppingCart.appendFormatted(sb, "string", 1, 9);
        assertEquals("   string ", sb.toString());
    }
    @Test
    void appendFormattedAfter() {
        ShoppingCart.appendFormatted(sb, "string", 0, 9);
        assertEquals(" string   ", sb.toString());
    }
}