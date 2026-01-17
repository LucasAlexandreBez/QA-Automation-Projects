package config;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

public class ClickUpReporterExtension implements TestWatcher{
	
    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        // chamar API do qTest/ClickUp aqui
        // exemplo: qtestClient.updateStatus(testName, "PASS");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        // exemplo: qtestClient.updateStatus(testName, "FAIL", cause.getMessage());
    }
	
}
