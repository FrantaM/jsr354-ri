import org.javamoney.moneta.spi.*;
import org.javamoney.moneta.spi.format.DefaultAmountFormatProviderSpi;
import org.javamoney.moneta.spi.loader.DefaultLoaderService;
import org.javamoney.moneta.spi.loader.LoaderService;

/*
Copyright (c) 2012, 2020, Werner Keil, Otavio Santana and others by the @author tag.

Licensed under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
*/
module org.javamoney.moneta {
    exports org.javamoney.moneta;
    exports org.javamoney.moneta.format;
    exports org.javamoney.moneta.function;
    exports org.javamoney.moneta.spi;
    exports org.javamoney.moneta.spi.format;
    exports org.javamoney.moneta.spi.loader;
    requires transitive java.money;
    requires transitive java.logging;
    requires java.annotation;
    requires static org.osgi.core;
    requires static org.osgi.compendium;
    requires static org.osgi.annotation;
    provides javax.money.spi.CurrencyProviderSpi with JDKCurrencyProvider, ConfigurableCurrencyUnitProvider;
    provides javax.money.spi.MonetaryAmountFactoryProviderSpi with MoneyAmountFactoryProvider, FastMoneyAmountFactoryProvider, RoundedMoneyAmountFactoryProvider;
    provides javax.money.spi.MonetaryAmountFormatProviderSpi with DefaultAmountFormatProviderSpi;
    provides javax.money.spi.MonetaryAmountsSingletonQuerySpi with DefaultMonetaryAmountsSingletonQuerySpi;
    provides javax.money.spi.MonetaryAmountsSingletonSpi with DefaultMonetaryAmountsSingletonSpi;
    provides javax.money.spi.MonetaryCurrenciesSingletonSpi with DefaultMonetaryCurrenciesSingletonSpi;
    provides javax.money.spi.RoundingProviderSpi with DefaultRoundingProvider;
    provides javax.money.spi.ServiceProvider with PriorityAwareServiceProvider;
    provides LoaderService with DefaultLoaderService;
    provides org.javamoney.moneta.spi.MonetaryConfigProvider with DefaultConfigProvider;
           
    uses LoaderService;
    uses org.javamoney.moneta.spi.MonetaryAmountProducer;
    uses org.javamoney.moneta.spi.MonetaryConfigProvider;
    
    uses javax.money.spi.CurrencyProviderSpi;
    uses javax.money.spi.MonetaryCurrenciesSingletonSpi;
    uses javax.money.spi.MonetaryAmountFactoryProviderSpi;
    uses javax.money.spi.MonetaryAmountFormatProviderSpi;
    uses javax.money.spi.MonetaryAmountsSingletonQuerySpi;
    uses javax.money.spi.MonetaryAmountsSingletonSpi;
    uses javax.money.spi.MonetaryConversionsSingletonSpi;
    uses javax.money.spi.MonetaryFormatsSingletonSpi;
    uses javax.money.spi.MonetaryRoundingsSingletonSpi;
    uses javax.money.spi.RoundingProviderSpi;
    uses javax.money.spi.ServiceProvider;
    uses javax.money.convert.ExchangeRateProvider;
    uses javax.money.convert.ExchangeRateProviderSupplier;
    uses javax.money.format.MonetaryAmountFormat;
}