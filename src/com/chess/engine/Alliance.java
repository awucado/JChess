package com.chess.engine;

public enum Alliance {
    WHITE {
        @Override
        public boolean isWhite() {
            return true;
        }

        @Override
        public int getDirection() {
            return 0;
        }

        @Override
        public boolean isBlack() {
            return false;
        }
    },
    BLACK {
        @Override
        public boolean isWhite() {
            return false;
        }

        @Override
        public int getDirection() {
            return 1;
        }

        @Override
        public boolean isBlack() {
            return true;
        }
    };

    public abstract boolean isWhite();

    public abstract int getDirection();

    public abstract boolean isBlack();
}
