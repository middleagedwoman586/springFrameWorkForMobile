package config;

import java.util.concurrent.TimeUnit;

public class WaitConfig {
    private int defaultImplicitTimeout;
    private TimeUnit defaultImplicitTimeUnit;
    private int defaultExplicitTimeout;



    public WaitConfig(Builder builder) {
        this.defaultImplicitTimeout=builder.defaultImplicitTimeout;
        this.defaultImplicitTimeUnit=builder.defaultImplicitTimeUnit;
        this.defaultExplicitTimeout=builder.defaultExplicitTimeout;
    }

    public static class Builder {
        private int defaultImplicitTimeout = 3;
        private TimeUnit defaultImplicitTimeUnit = TimeUnit.SECONDS;
        private int defaultExplicitTimeout = 5;

        public Builder setDefaultImplicitTimeout(int defaultImplicitTimeout) {
            this.defaultImplicitTimeout = defaultImplicitTimeout;
            return this;
        }

        public Builder setDefaultImplicitTimeUnit(TimeUnit defaultImplicitTimeUnit) {
            this.defaultImplicitTimeUnit = defaultImplicitTimeUnit;
            return this;
        }

        public Builder setDefaultExplicitTimeout(int defaultExplicitTimeout) {
            this.defaultExplicitTimeout = defaultExplicitTimeout;
            return this;
        }
        public WaitConfig build(){
            return new WaitConfig(this);
        }
    }
    public int getDefaultImplicitTimeout() {
        return defaultImplicitTimeout;
    }

    public TimeUnit getDefaultImplicitTimeUnit() {
        return defaultImplicitTimeUnit;
    }

    public int getDefaultExplicitTimeout() {
        return defaultExplicitTimeout;
    }
}