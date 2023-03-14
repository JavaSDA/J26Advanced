package com.company.ball;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Water {
    private boolean isColourless;
    private boolean isOdourless;
    private boolean isTasteless;

    public Water(boolean isColourless, boolean isOdourless, boolean isTasteless) {
        this.isColourless = isColourless;
        this.isOdourless = isOdourless;
        this.isTasteless = isTasteless;
    }
}
