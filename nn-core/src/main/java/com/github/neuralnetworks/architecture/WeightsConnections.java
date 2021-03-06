package com.github.neuralnetworks.architecture;

import com.github.neuralnetworks.util.Tensor;

/**
 * Weight connections
 */
public interface WeightsConnections extends Connections {

    /**
     * @return ConnectionGraph with weights
     */
    public Tensor getWeights();
}
