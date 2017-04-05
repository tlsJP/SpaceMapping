package com.jp.core.stereotypes;

import java.util.Set;

/**
 * Interface for space discovery and mapping
 *
 * Created by JP on 4/4/2017.
 */
public interface Mapper {

    /**
     * Executes space mapping
     */
    void map();

    /**
     * Get the current map
     * @return a @Set of tiles within the space
     */
    Set getMap();
}
