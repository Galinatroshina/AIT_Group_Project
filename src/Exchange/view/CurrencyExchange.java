package Exchange.view;

//количество валют - не более 10
//основная валюта - EUR
//маржинальность при обмене - 5% от биржевого курса
//добавление/удаление/редактирование и поиск транзакций по обмену валюты по датам в интервале ОТ и ДО
//сохранение и считывание списка транзакций по обмену валюты из файла
//виды транзакций:
//продажа
//покупка
//просмотр отчета по объему транзакций по обмену валюты по виду транзакций:
//продажа
//покупка


public enum CurrencyExchange {

        USD("USD", 0.9178),
        AUD("AUD", 0.6080),
        EGP("EGP", 0.0187),
        KZT("KZT", 0.0019),
        GBP("GBP", 1.19),
        FJD("FJD", 0.4091);
        //EGPP("EGP", 0.0187);


        private String currency_codes;
        private double current_exchange;

        CurrencyExchange(String currency_codes,
                         double current_exchange)
        {
            this.currency_codes = currency_codes;
            this.current_exchange = current_exchange;
        }

        public String getCurrency_codes()
        {
            return currency_codes;
        }

        public double getCurrent_exchange()
        {
            return current_exchange;
        }

        @Override
        public String toString()
        {
            return currency_codes + " - курс: " + current_exchange + " EUR";
        }

    }

