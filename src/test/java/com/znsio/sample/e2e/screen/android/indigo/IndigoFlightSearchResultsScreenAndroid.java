package com.znsio.sample.e2e.screen.android.indigo;

import com.znsio.teswiz.runner.Driver;
import com.znsio.teswiz.runner.Visual;
import com.znsio.sample.e2e.screen.indigo.IndigoFlightSearchResultsScreen;
import org.apache.log4j.Logger;

public class IndigoFlightSearchResultsScreenAndroid
        extends IndigoFlightSearchResultsScreen {
    private static final String SCREEN_NAME =
            IndigoFlightSearchResultsScreenAndroid.class.getSimpleName();
    private static final String NOT_YET_IMPLEMENTED = " not yet implemented";
    private static final Logger LOGGER = Logger.getLogger(SCREEN_NAME);
    private final Driver driver;
    private final Visual visually;

    public IndigoFlightSearchResultsScreenAndroid(Driver driver, Visual visually) {
        this.driver = driver;
        this.visually = visually;
    }
}
