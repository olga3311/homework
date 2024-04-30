package lesson20.hometask;

public enum ExchangeRate {
    EURO2USD( Currency.EURO, Currency.USD, 1.09),
    EURO2TL( Currency.EURO, Currency.TL, 34.80),
    USD2EURO(Currency.USD, Currency.EURO, 0.92),
    USD2TL( Currency.USD, Currency.TL, 32.08),
    TL2EURO( Currency.TL, Currency.EURO,0.029),
    TL2USD( Currency.TL, Currency.USD, 0.031);



    private final double exchangeRate;
    private final Currency initialCurrency;
    private final Currency targetCurrency;

    ExchangeRate( Currency initialCurrency, Currency targetCurrency, double exchangeRate) {
        this.exchangeRate = exchangeRate;
        this.initialCurrency = initialCurrency;
        this.targetCurrency = targetCurrency;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public Currency getInitialCurrency() {
        return initialCurrency;
    }

    public Currency getTargetCurrency() {
        return targetCurrency;
    }


}
