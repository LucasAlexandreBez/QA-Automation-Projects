package pages;

import java.nio.file.Paths;

import com.microsoft.playwright.Locator;

/**
 * Generic DSL (Domain Specific Language) helper for common
 * Playwright {@link Locator} interactions.
 *
 * <p>Page Objects can extend this class to reuse high-level
 * UI interaction methods instead of calling the raw Playwright
 * API everywhere.</p>
 * 
 * @author Lucas Alexandre Bez Piancoski
 * @since 1.0.0
 */
public class DSL {

    /** Fills an input element with the given value. */
    protected void writeOnInput(Locator locator, String value) {
        locator.fill(value);
    }

    /** Clicks on the given element. */
    protected void clickOnElement(Locator locator) {
        locator.click();
    }

    /** Returns the text content of an element. */
    protected String getText(Locator locator) {
        return locator.textContent();
    }

    /** Returns the current value of an input element. */
    protected String getValue(Locator locator) {
        return locator.inputValue();
    }

    /** Returns whether the element is currently visible. */
    protected boolean isVisible(Locator locator) {
        return locator.isVisible();
    }

    /** Hovers the mouse over the given element. */
    protected void hover(Locator locator) {
        locator.hover();
    }

    /** Checks a checkbox if it is not already checked. */
    protected void check(Locator locator) {
        locator.check();
    }

    /** Unchecks a checkbox if it is checked. */
    protected void uncheck(Locator locator) {
        locator.uncheck();
    }

    /** Sets a checkbox state explicitly. */
    protected void setCheckboxState(Locator locator, boolean checked) {
        if (checked) locator.check();
        else locator.uncheck();
    }

    /** Uploads a file to an input type element. */
    protected void uploadFile(Locator locator, String filePath) {
        locator.setInputFiles(Paths.get(filePath));
    }

    /** Scrolls the element into view if needed. */
    protected void scrollIntoView(Locator locator) {
        locator.scrollIntoViewIfNeeded();
    }
}
