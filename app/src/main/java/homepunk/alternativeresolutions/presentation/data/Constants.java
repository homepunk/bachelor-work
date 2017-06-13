package homepunk.alternativeresolutions.presentation.data;

import homepunk.alternativeresolutions.presentation.utils.interfaces.ValuationRatings;

import static homepunk.alternativeresolutions.presentation.utils.interfaces.ValuationRatings.VALUATION_BAD;
import static homepunk.alternativeresolutions.presentation.utils.interfaces.ValuationRatings.VALUATION_BETTER;
import static homepunk.alternativeresolutions.presentation.utils.interfaces.ValuationRatings.VALUATION_GOOD;
import static homepunk.alternativeresolutions.presentation.utils.interfaces.ValuationRatings.VALUATION_NORMAL;
import static homepunk.alternativeresolutions.presentation.utils.interfaces.ValuationRatings.VALUATION_THE_BEST;
import static homepunk.alternativeresolutions.presentation.utils.interfaces.ValuationRatings.VALUATION_THE_WORST;
import static homepunk.alternativeresolutions.presentation.utils.interfaces.ValuationRatings.VALUATION_WORSE;

/**
 * Created by homepunk on 6/12/17.
 */

public interface Constants {
    @ValuationRatings
    int[] DEFAULT_VALUATIONS = new int[]{
            VALUATION_THE_WORST,
            VALUATION_BAD,
            VALUATION_GOOD,
            VALUATION_THE_BEST
    };

    @ValuationRatings
    int [] VALUATIONS_RATINGS = new int[] {
            VALUATION_THE_WORST,
            VALUATION_WORSE,
            VALUATION_BAD,
            VALUATION_NORMAL,
            VALUATION_GOOD,
            VALUATION_BETTER,
            VALUATION_THE_BEST
    };

    int MIN_VALUATIONS_SIZE = 1;
    int MAX_VALUATIONS_SIZE = 7;
}
