package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Invoice.Builder.class)
public final class Invoice {
    private final Optional<String> id;

    private final Optional<InvoiceType> type;

    private final Optional<String> contact;

    private final Optional<String> number;

    private final Optional<OffsetDateTime> issueDate;

    private final Optional<OffsetDateTime> dueDate;

    private final Optional<OffsetDateTime> paidOnDate;

    private final Optional<String> memo;

    private final Optional<String> company;

    private final Optional<InvoiceCurrency> currency;

    private final Optional<String> exchangeRate;

    private final Optional<Double> totalDiscount;

    private final Optional<Double> subTotal;

    private final Optional<Double> totalTaxAmount;

    private final Optional<Double> totalAmount;

    private final Optional<Double> balance;

    private final Optional<OffsetDateTime> remoteUpdatedAt;

    private final Optional<List<Optional<String>>> trackingCategories;

    private final Optional<List<Optional<String>>> payments;

    private final Optional<List<InvoiceLineItem>> lineItems;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<String> remoteId;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private Invoice(
            Optional<String> id,
            Optional<InvoiceType> type,
            Optional<String> contact,
            Optional<String> number,
            Optional<OffsetDateTime> issueDate,
            Optional<OffsetDateTime> dueDate,
            Optional<OffsetDateTime> paidOnDate,
            Optional<String> memo,
            Optional<String> company,
            Optional<InvoiceCurrency> currency,
            Optional<String> exchangeRate,
            Optional<Double> totalDiscount,
            Optional<Double> subTotal,
            Optional<Double> totalTaxAmount,
            Optional<Double> totalAmount,
            Optional<Double> balance,
            Optional<OffsetDateTime> remoteUpdatedAt,
            Optional<List<Optional<String>>> trackingCategories,
            Optional<List<Optional<String>>> payments,
            Optional<List<InvoiceLineItem>> lineItems,
            Optional<Boolean> remoteWasDeleted,
            Optional<String> remoteId,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData) {
        this.id = id;
        this.type = type;
        this.contact = contact;
        this.number = number;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paidOnDate = paidOnDate;
        this.memo = memo;
        this.company = company;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.totalDiscount = totalDiscount;
        this.subTotal = subTotal;
        this.totalTaxAmount = totalTaxAmount;
        this.totalAmount = totalAmount;
        this.balance = balance;
        this.remoteUpdatedAt = remoteUpdatedAt;
        this.trackingCategories = trackingCategories;
        this.payments = payments;
        this.lineItems = lineItems;
        this.remoteWasDeleted = remoteWasDeleted;
        this.remoteId = remoteId;
        this.modifiedAt = modifiedAt;
        this.fieldMappings = fieldMappings;
        this.remoteData = remoteData;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return Whether the invoice is an accounts receivable or accounts payable. If <code>type</code> is <code>accounts_payable</code>, the invoice is a bill. If <code>type</code> is <code>accounts_receivable</code>, it is an invoice.
     * <ul>
     * <li><code>ACCOUNTS_RECEIVABLE</code> - ACCOUNTS_RECEIVABLE</li>
     * <li><code>ACCOUNTS_PAYABLE</code> - ACCOUNTS_PAYABLE</li>
     * </ul>
     */
    @JsonProperty("type")
    public Optional<InvoiceType> getType() {
        return type;
    }

    /**
     * @return The invoice's contact.
     */
    @JsonProperty("contact")
    public Optional<String> getContact() {
        return contact;
    }

    /**
     * @return The invoice's number.
     */
    @JsonProperty("number")
    public Optional<String> getNumber() {
        return number;
    }

    /**
     * @return The invoice's issue date.
     */
    @JsonProperty("issue_date")
    public Optional<OffsetDateTime> getIssueDate() {
        return issueDate;
    }

    /**
     * @return The invoice's due date.
     */
    @JsonProperty("due_date")
    public Optional<OffsetDateTime> getDueDate() {
        return dueDate;
    }

    /**
     * @return The invoice's paid date.
     */
    @JsonProperty("paid_on_date")
    public Optional<OffsetDateTime> getPaidOnDate() {
        return paidOnDate;
    }

    /**
     * @return The invoice's private note.
     */
    @JsonProperty("memo")
    public Optional<String> getMemo() {
        return memo;
    }

    /**
     * @return The company the invoice belongs to.
     */
    @JsonProperty("company")
    public Optional<String> getCompany() {
        return company;
    }

    /**
     * @return The invoice's currency.
     * <ul>
     * <li><code>XUA</code> - ADB Unit of Account</li>
     * <li><code>AFN</code> - Afghan Afghani</li>
     * <li><code>AFA</code> - Afghan Afghani (1927–2002)</li>
     * <li><code>ALL</code> - Albanian Lek</li>
     * <li><code>ALK</code> - Albanian Lek (1946–1965)</li>
     * <li><code>DZD</code> - Algerian Dinar</li>
     * <li><code>ADP</code> - Andorran Peseta</li>
     * <li><code>AOA</code> - Angolan Kwanza</li>
     * <li><code>AOK</code> - Angolan Kwanza (1977–1991)</li>
     * <li><code>AON</code> - Angolan New Kwanza (1990–2000)</li>
     * <li><code>AOR</code> - Angolan Readjusted Kwanza (1995–1999)</li>
     * <li><code>ARA</code> - Argentine Austral</li>
     * <li><code>ARS</code> - Argentine Peso</li>
     * <li><code>ARM</code> - Argentine Peso (1881–1970)</li>
     * <li><code>ARP</code> - Argentine Peso (1983–1985)</li>
     * <li><code>ARL</code> - Argentine Peso Ley (1970–1983)</li>
     * <li><code>AMD</code> - Armenian Dram</li>
     * <li><code>AWG</code> - Aruban Florin</li>
     * <li><code>AUD</code> - Australian Dollar</li>
     * <li><code>ATS</code> - Austrian Schilling</li>
     * <li><code>AZN</code> - Azerbaijani Manat</li>
     * <li><code>AZM</code> - Azerbaijani Manat (1993–2006)</li>
     * <li><code>BSD</code> - Bahamian Dollar</li>
     * <li><code>BHD</code> - Bahraini Dinar</li>
     * <li><code>BDT</code> - Bangladeshi Taka</li>
     * <li><code>BBD</code> - Barbadian Dollar</li>
     * <li><code>BYN</code> - Belarusian Ruble</li>
     * <li><code>BYB</code> - Belarusian Ruble (1994–1999)</li>
     * <li><code>BYR</code> - Belarusian Ruble (2000–2016)</li>
     * <li><code>BEF</code> - Belgian Franc</li>
     * <li><code>BEC</code> - Belgian Franc (convertible)</li>
     * <li><code>BEL</code> - Belgian Franc (financial)</li>
     * <li><code>BZD</code> - Belize Dollar</li>
     * <li><code>BMD</code> - Bermudan Dollar</li>
     * <li><code>BTN</code> - Bhutanese Ngultrum</li>
     * <li><code>BOB</code> - Bolivian Boliviano</li>
     * <li><code>BOL</code> - Bolivian Boliviano (1863–1963)</li>
     * <li><code>BOV</code> - Bolivian Mvdol</li>
     * <li><code>BOP</code> - Bolivian Peso</li>
     * <li><code>BAM</code> - Bosnia-Herzegovina Convertible Mark</li>
     * <li><code>BAD</code> - Bosnia-Herzegovina Dinar (1992–1994)</li>
     * <li><code>BAN</code> - Bosnia-Herzegovina New Dinar (1994–1997)</li>
     * <li><code>BWP</code> - Botswanan Pula</li>
     * <li><code>BRC</code> - Brazilian Cruzado (1986–1989)</li>
     * <li><code>BRZ</code> - Brazilian Cruzeiro (1942–1967)</li>
     * <li><code>BRE</code> - Brazilian Cruzeiro (1990–1993)</li>
     * <li><code>BRR</code> - Brazilian Cruzeiro (1993–1994)</li>
     * <li><code>BRN</code> - Brazilian New Cruzado (1989–1990)</li>
     * <li><code>BRB</code> - Brazilian New Cruzeiro (1967–1986)</li>
     * <li><code>BRL</code> - Brazilian Real</li>
     * <li><code>GBP</code> - British Pound</li>
     * <li><code>BND</code> - Brunei Dollar</li>
     * <li><code>BGL</code> - Bulgarian Hard Lev</li>
     * <li><code>BGN</code> - Bulgarian Lev</li>
     * <li><code>BGO</code> - Bulgarian Lev (1879–1952)</li>
     * <li><code>BGM</code> - Bulgarian Socialist Lev</li>
     * <li><code>BUK</code> - Burmese Kyat</li>
     * <li><code>BIF</code> - Burundian Franc</li>
     * <li><code>XPF</code> - CFP Franc</li>
     * <li><code>KHR</code> - Cambodian Riel</li>
     * <li><code>CAD</code> - Canadian Dollar</li>
     * <li><code>CVE</code> - Cape Verdean Escudo</li>
     * <li><code>KYD</code> - Cayman Islands Dollar</li>
     * <li><code>XAF</code> - Central African CFA Franc</li>
     * <li><code>CLE</code> - Chilean Escudo</li>
     * <li><code>CLP</code> - Chilean Peso</li>
     * <li><code>CLF</code> - Chilean Unit of Account (UF)</li>
     * <li><code>CNX</code> - Chinese People’s Bank Dollar</li>
     * <li><code>CNY</code> - Chinese Yuan</li>
     * <li><code>CNH</code> - Chinese Yuan (offshore)</li>
     * <li><code>COP</code> - Colombian Peso</li>
     * <li><code>COU</code> - Colombian Real Value Unit</li>
     * <li><code>KMF</code> - Comorian Franc</li>
     * <li><code>CDF</code> - Congolese Franc</li>
     * <li><code>CRC</code> - Costa Rican Colón</li>
     * <li><code>HRD</code> - Croatian Dinar</li>
     * <li><code>HRK</code> - Croatian Kuna</li>
     * <li><code>CUC</code> - Cuban Convertible Peso</li>
     * <li><code>CUP</code> - Cuban Peso</li>
     * <li><code>CYP</code> - Cypriot Pound</li>
     * <li><code>CZK</code> - Czech Koruna</li>
     * <li><code>CSK</code> - Czechoslovak Hard Koruna</li>
     * <li><code>DKK</code> - Danish Krone</li>
     * <li><code>DJF</code> - Djiboutian Franc</li>
     * <li><code>DOP</code> - Dominican Peso</li>
     * <li><code>NLG</code> - Dutch Guilder</li>
     * <li><code>XCD</code> - East Caribbean Dollar</li>
     * <li><code>DDM</code> - East German Mark</li>
     * <li><code>ECS</code> - Ecuadorian Sucre</li>
     * <li><code>ECV</code> - Ecuadorian Unit of Constant Value</li>
     * <li><code>EGP</code> - Egyptian Pound</li>
     * <li><code>GQE</code> - Equatorial Guinean Ekwele</li>
     * <li><code>ERN</code> - Eritrean Nakfa</li>
     * <li><code>EEK</code> - Estonian Kroon</li>
     * <li><code>ETB</code> - Ethiopian Birr</li>
     * <li><code>EUR</code> - Euro</li>
     * <li><code>XBA</code> - European Composite Unit</li>
     * <li><code>XEU</code> - European Currency Unit</li>
     * <li><code>XBB</code> - European Monetary Unit</li>
     * <li><code>XBC</code> - European Unit of Account (XBC)</li>
     * <li><code>XBD</code> - European Unit of Account (XBD)</li>
     * <li><code>FKP</code> - Falkland Islands Pound</li>
     * <li><code>FJD</code> - Fijian Dollar</li>
     * <li><code>FIM</code> - Finnish Markka</li>
     * <li><code>FRF</code> - French Franc</li>
     * <li><code>XFO</code> - French Gold Franc</li>
     * <li><code>XFU</code> - French UIC-Franc</li>
     * <li><code>GMD</code> - Gambian Dalasi</li>
     * <li><code>GEK</code> - Georgian Kupon Larit</li>
     * <li><code>GEL</code> - Georgian Lari</li>
     * <li><code>DEM</code> - German Mark</li>
     * <li><code>GHS</code> - Ghanaian Cedi</li>
     * <li><code>GHC</code> - Ghanaian Cedi (1979–2007)</li>
     * <li><code>GIP</code> - Gibraltar Pound</li>
     * <li><code>XAU</code> - Gold</li>
     * <li><code>GRD</code> - Greek Drachma</li>
     * <li><code>GTQ</code> - Guatemalan Quetzal</li>
     * <li><code>GWP</code> - Guinea-Bissau Peso</li>
     * <li><code>GNF</code> - Guinean Franc</li>
     * <li><code>GNS</code> - Guinean Syli</li>
     * <li><code>GYD</code> - Guyanaese Dollar</li>
     * <li><code>HTG</code> - Haitian Gourde</li>
     * <li><code>HNL</code> - Honduran Lempira</li>
     * <li><code>HKD</code> - Hong Kong Dollar</li>
     * <li><code>HUF</code> - Hungarian Forint</li>
     * <li><code>IMP</code> - IMP</li>
     * <li><code>ISK</code> - Icelandic Króna</li>
     * <li><code>ISJ</code> - Icelandic Króna (1918–1981)</li>
     * <li><code>INR</code> - Indian Rupee</li>
     * <li><code>IDR</code> - Indonesian Rupiah</li>
     * <li><code>IRR</code> - Iranian Rial</li>
     * <li><code>IQD</code> - Iraqi Dinar</li>
     * <li><code>IEP</code> - Irish Pound</li>
     * <li><code>ILS</code> - Israeli New Shekel</li>
     * <li><code>ILP</code> - Israeli Pound</li>
     * <li><code>ILR</code> - Israeli Shekel (1980–1985)</li>
     * <li><code>ITL</code> - Italian Lira</li>
     * <li><code>JMD</code> - Jamaican Dollar</li>
     * <li><code>JPY</code> - Japanese Yen</li>
     * <li><code>JOD</code> - Jordanian Dinar</li>
     * <li><code>KZT</code> - Kazakhstani Tenge</li>
     * <li><code>KES</code> - Kenyan Shilling</li>
     * <li><code>KWD</code> - Kuwaiti Dinar</li>
     * <li><code>KGS</code> - Kyrgystani Som</li>
     * <li><code>LAK</code> - Laotian Kip</li>
     * <li><code>LVL</code> - Latvian Lats</li>
     * <li><code>LVR</code> - Latvian Ruble</li>
     * <li><code>LBP</code> - Lebanese Pound</li>
     * <li><code>LSL</code> - Lesotho Loti</li>
     * <li><code>LRD</code> - Liberian Dollar</li>
     * <li><code>LYD</code> - Libyan Dinar</li>
     * <li><code>LTL</code> - Lithuanian Litas</li>
     * <li><code>LTT</code> - Lithuanian Talonas</li>
     * <li><code>LUL</code> - Luxembourg Financial Franc</li>
     * <li><code>LUC</code> - Luxembourgian Convertible Franc</li>
     * <li><code>LUF</code> - Luxembourgian Franc</li>
     * <li><code>MOP</code> - Macanese Pataca</li>
     * <li><code>MKD</code> - Macedonian Denar</li>
     * <li><code>MKN</code> - Macedonian Denar (1992–1993)</li>
     * <li><code>MGA</code> - Malagasy Ariary</li>
     * <li><code>MGF</code> - Malagasy Franc</li>
     * <li><code>MWK</code> - Malawian Kwacha</li>
     * <li><code>MYR</code> - Malaysian Ringgit</li>
     * <li><code>MVR</code> - Maldivian Rufiyaa</li>
     * <li><code>MVP</code> - Maldivian Rupee (1947–1981)</li>
     * <li><code>MLF</code> - Malian Franc</li>
     * <li><code>MTL</code> - Maltese Lira</li>
     * <li><code>MTP</code> - Maltese Pound</li>
     * <li><code>MRU</code> - Mauritanian Ouguiya</li>
     * <li><code>MRO</code> - Mauritanian Ouguiya (1973–2017)</li>
     * <li><code>MUR</code> - Mauritian Rupee</li>
     * <li><code>MXV</code> - Mexican Investment Unit</li>
     * <li><code>MXN</code> - Mexican Peso</li>
     * <li><code>MXP</code> - Mexican Silver Peso (1861–1992)</li>
     * <li><code>MDC</code> - Moldovan Cupon</li>
     * <li><code>MDL</code> - Moldovan Leu</li>
     * <li><code>MCF</code> - Monegasque Franc</li>
     * <li><code>MNT</code> - Mongolian Tugrik</li>
     * <li><code>MAD</code> - Moroccan Dirham</li>
     * <li><code>MAF</code> - Moroccan Franc</li>
     * <li><code>MZE</code> - Mozambican Escudo</li>
     * <li><code>MZN</code> - Mozambican Metical</li>
     * <li><code>MZM</code> - Mozambican Metical (1980–2006)</li>
     * <li><code>MMK</code> - Myanmar Kyat</li>
     * <li><code>NAD</code> - Namibian Dollar</li>
     * <li><code>NPR</code> - Nepalese Rupee</li>
     * <li><code>ANG</code> - Netherlands Antillean Guilder</li>
     * <li><code>TWD</code> - New Taiwan Dollar</li>
     * <li><code>NZD</code> - New Zealand Dollar</li>
     * <li><code>NIO</code> - Nicaraguan Córdoba</li>
     * <li><code>NIC</code> - Nicaraguan Córdoba (1988–1991)</li>
     * <li><code>NGN</code> - Nigerian Naira</li>
     * <li><code>KPW</code> - North Korean Won</li>
     * <li><code>NOK</code> - Norwegian Krone</li>
     * <li><code>OMR</code> - Omani Rial</li>
     * <li><code>PKR</code> - Pakistani Rupee</li>
     * <li><code>XPD</code> - Palladium</li>
     * <li><code>PAB</code> - Panamanian Balboa</li>
     * <li><code>PGK</code> - Papua New Guinean Kina</li>
     * <li><code>PYG</code> - Paraguayan Guarani</li>
     * <li><code>PEI</code> - Peruvian Inti</li>
     * <li><code>PEN</code> - Peruvian Sol</li>
     * <li><code>PES</code> - Peruvian Sol (1863–1965)</li>
     * <li><code>PHP</code> - Philippine Peso</li>
     * <li><code>XPT</code> - Platinum</li>
     * <li><code>PLN</code> - Polish Zloty</li>
     * <li><code>PLZ</code> - Polish Zloty (1950–1995)</li>
     * <li><code>PTE</code> - Portuguese Escudo</li>
     * <li><code>GWE</code> - Portuguese Guinea Escudo</li>
     * <li><code>QAR</code> - Qatari Rial</li>
     * <li><code>XRE</code> - RINET Funds</li>
     * <li><code>RHD</code> - Rhodesian Dollar</li>
     * <li><code>RON</code> - Romanian Leu</li>
     * <li><code>ROL</code> - Romanian Leu (1952–2006)</li>
     * <li><code>RUB</code> - Russian Ruble</li>
     * <li><code>RUR</code> - Russian Ruble (1991–1998)</li>
     * <li><code>RWF</code> - Rwandan Franc</li>
     * <li><code>SVC</code> - Salvadoran Colón</li>
     * <li><code>WST</code> - Samoan Tala</li>
     * <li><code>SAR</code> - Saudi Riyal</li>
     * <li><code>RSD</code> - Serbian Dinar</li>
     * <li><code>CSD</code> - Serbian Dinar (2002–2006)</li>
     * <li><code>SCR</code> - Seychellois Rupee</li>
     * <li><code>SLL</code> - Sierra Leonean Leone</li>
     * <li><code>XAG</code> - Silver</li>
     * <li><code>SGD</code> - Singapore Dollar</li>
     * <li><code>SKK</code> - Slovak Koruna</li>
     * <li><code>SIT</code> - Slovenian Tolar</li>
     * <li><code>SBD</code> - Solomon Islands Dollar</li>
     * <li><code>SOS</code> - Somali Shilling</li>
     * <li><code>ZAR</code> - South African Rand</li>
     * <li><code>ZAL</code> - South African Rand (financial)</li>
     * <li><code>KRH</code> - South Korean Hwan (1953–1962)</li>
     * <li><code>KRW</code> - South Korean Won</li>
     * <li><code>KRO</code> - South Korean Won (1945–1953)</li>
     * <li><code>SSP</code> - South Sudanese Pound</li>
     * <li><code>SUR</code> - Soviet Rouble</li>
     * <li><code>ESP</code> - Spanish Peseta</li>
     * <li><code>ESA</code> - Spanish Peseta (A account)</li>
     * <li><code>ESB</code> - Spanish Peseta (convertible account)</li>
     * <li><code>XDR</code> - Special Drawing Rights</li>
     * <li><code>LKR</code> - Sri Lankan Rupee</li>
     * <li><code>SHP</code> - St. Helena Pound</li>
     * <li><code>XSU</code> - Sucre</li>
     * <li><code>SDD</code> - Sudanese Dinar (1992–2007)</li>
     * <li><code>SDG</code> - Sudanese Pound</li>
     * <li><code>SDP</code> - Sudanese Pound (1957–1998)</li>
     * <li><code>SRD</code> - Surinamese Dollar</li>
     * <li><code>SRG</code> - Surinamese Guilder</li>
     * <li><code>SZL</code> - Swazi Lilangeni</li>
     * <li><code>SEK</code> - Swedish Krona</li>
     * <li><code>CHF</code> - Swiss Franc</li>
     * <li><code>SYP</code> - Syrian Pound</li>
     * <li><code>STN</code> - São Tomé &amp; Príncipe Dobra</li>
     * <li><code>STD</code> - São Tomé &amp; Príncipe Dobra (1977–2017)</li>
     * <li><code>TVD</code> - TVD</li>
     * <li><code>TJR</code> - Tajikistani Ruble</li>
     * <li><code>TJS</code> - Tajikistani Somoni</li>
     * <li><code>TZS</code> - Tanzanian Shilling</li>
     * <li><code>XTS</code> - Testing Currency Code</li>
     * <li><code>THB</code> - Thai Baht</li>
     * <li><code>XXX</code> - The codes assigned for transactions where no currency is involved</li>
     * <li><code>TPE</code> - Timorese Escudo</li>
     * <li><code>TOP</code> - Tongan Paʻanga</li>
     * <li><code>TTD</code> - Trinidad &amp; Tobago Dollar</li>
     * <li><code>TND</code> - Tunisian Dinar</li>
     * <li><code>TRY</code> - Turkish Lira</li>
     * <li><code>TRL</code> - Turkish Lira (1922–2005)</li>
     * <li><code>TMT</code> - Turkmenistani Manat</li>
     * <li><code>TMM</code> - Turkmenistani Manat (1993–2009)</li>
     * <li><code>USD</code> - US Dollar</li>
     * <li><code>USN</code> - US Dollar (Next day)</li>
     * <li><code>USS</code> - US Dollar (Same day)</li>
     * <li><code>UGX</code> - Ugandan Shilling</li>
     * <li><code>UGS</code> - Ugandan Shilling (1966–1987)</li>
     * <li><code>UAH</code> - Ukrainian Hryvnia</li>
     * <li><code>UAK</code> - Ukrainian Karbovanets</li>
     * <li><code>AED</code> - United Arab Emirates Dirham</li>
     * <li><code>UYW</code> - Uruguayan Nominal Wage Index Unit</li>
     * <li><code>UYU</code> - Uruguayan Peso</li>
     * <li><code>UYP</code> - Uruguayan Peso (1975–1993)</li>
     * <li><code>UYI</code> - Uruguayan Peso (Indexed Units)</li>
     * <li><code>UZS</code> - Uzbekistani Som</li>
     * <li><code>VUV</code> - Vanuatu Vatu</li>
     * <li><code>VES</code> - Venezuelan Bolívar</li>
     * <li><code>VEB</code> - Venezuelan Bolívar (1871–2008)</li>
     * <li><code>VEF</code> - Venezuelan Bolívar (2008–2018)</li>
     * <li><code>VND</code> - Vietnamese Dong</li>
     * <li><code>VNN</code> - Vietnamese Dong (1978–1985)</li>
     * <li><code>CHE</code> - WIR Euro</li>
     * <li><code>CHW</code> - WIR Franc</li>
     * <li><code>XOF</code> - West African CFA Franc</li>
     * <li><code>YDD</code> - Yemeni Dinar</li>
     * <li><code>YER</code> - Yemeni Rial</li>
     * <li><code>YUN</code> - Yugoslavian Convertible Dinar (1990–1992)</li>
     * <li><code>YUD</code> - Yugoslavian Hard Dinar (1966–1990)</li>
     * <li><code>YUM</code> - Yugoslavian New Dinar (1994–2002)</li>
     * <li><code>YUR</code> - Yugoslavian Reformed Dinar (1992–1993)</li>
     * <li><code>ZWN</code> - ZWN</li>
     * <li><code>ZRN</code> - Zairean New Zaire (1993–1998)</li>
     * <li><code>ZRZ</code> - Zairean Zaire (1971–1993)</li>
     * <li><code>ZMW</code> - Zambian Kwacha</li>
     * <li><code>ZMK</code> - Zambian Kwacha (1968–2012)</li>
     * <li><code>ZWD</code> - Zimbabwean Dollar (1980–2008)</li>
     * <li><code>ZWR</code> - Zimbabwean Dollar (2008)</li>
     * <li><code>ZWL</code> - Zimbabwean Dollar (2009)</li>
     * </ul>
     */
    @JsonProperty("currency")
    public Optional<InvoiceCurrency> getCurrency() {
        return currency;
    }

    /**
     * @return The invoice's exchange rate.
     */
    @JsonProperty("exchange_rate")
    public Optional<String> getExchangeRate() {
        return exchangeRate;
    }

    /**
     * @return The total discounts applied to the total cost.
     */
    @JsonProperty("total_discount")
    public Optional<Double> getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * @return The total amount being paid before taxes.
     */
    @JsonProperty("sub_total")
    public Optional<Double> getSubTotal() {
        return subTotal;
    }

    /**
     * @return The total amount being paid in taxes.
     */
    @JsonProperty("total_tax_amount")
    public Optional<Double> getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * @return The invoice's total amount.
     */
    @JsonProperty("total_amount")
    public Optional<Double> getTotalAmount() {
        return totalAmount;
    }

    /**
     * @return The invoice's remaining balance.
     */
    @JsonProperty("balance")
    public Optional<Double> getBalance() {
        return balance;
    }

    /**
     * @return When the third party's invoice entry was updated.
     */
    @JsonProperty("remote_updated_at")
    public Optional<OffsetDateTime> getRemoteUpdatedAt() {
        return remoteUpdatedAt;
    }

    @JsonProperty("tracking_categories")
    public Optional<List<Optional<String>>> getTrackingCategories() {
        return trackingCategories;
    }

    /**
     * @return Array of <code>Payment</code> object IDs.
     */
    @JsonProperty("payments")
    public Optional<List<Optional<String>>> getPayments() {
        return payments;
    }

    @JsonProperty("line_items")
    public Optional<List<InvoiceLineItem>> getLineItems() {
        return lineItems;
    }

    @JsonProperty("remote_was_deleted")
    public Optional<Boolean> getRemoteWasDeleted() {
        return remoteWasDeleted;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("field_mappings")
    public Optional<Map<String, JsonNode>> getFieldMappings() {
        return fieldMappings;
    }

    @JsonProperty("remote_data")
    public Optional<List<RemoteData>> getRemoteData() {
        return remoteData;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Invoice && equalTo((Invoice) other);
    }

    private boolean equalTo(Invoice other) {
        return id.equals(other.id)
                && type.equals(other.type)
                && contact.equals(other.contact)
                && number.equals(other.number)
                && issueDate.equals(other.issueDate)
                && dueDate.equals(other.dueDate)
                && paidOnDate.equals(other.paidOnDate)
                && memo.equals(other.memo)
                && company.equals(other.company)
                && currency.equals(other.currency)
                && exchangeRate.equals(other.exchangeRate)
                && totalDiscount.equals(other.totalDiscount)
                && subTotal.equals(other.subTotal)
                && totalTaxAmount.equals(other.totalTaxAmount)
                && totalAmount.equals(other.totalAmount)
                && balance.equals(other.balance)
                && remoteUpdatedAt.equals(other.remoteUpdatedAt)
                && trackingCategories.equals(other.trackingCategories)
                && payments.equals(other.payments)
                && lineItems.equals(other.lineItems)
                && remoteWasDeleted.equals(other.remoteWasDeleted)
                && remoteId.equals(other.remoteId)
                && modifiedAt.equals(other.modifiedAt)
                && fieldMappings.equals(other.fieldMappings)
                && remoteData.equals(other.remoteData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.type,
                this.contact,
                this.number,
                this.issueDate,
                this.dueDate,
                this.paidOnDate,
                this.memo,
                this.company,
                this.currency,
                this.exchangeRate,
                this.totalDiscount,
                this.subTotal,
                this.totalTaxAmount,
                this.totalAmount,
                this.balance,
                this.remoteUpdatedAt,
                this.trackingCategories,
                this.payments,
                this.lineItems,
                this.remoteWasDeleted,
                this.remoteId,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData);
    }

    @Override
    public String toString() {
        return "Invoice{" + "id: " + id + ", type: " + type + ", contact: " + contact + ", number: " + number
                + ", issueDate: " + issueDate + ", dueDate: " + dueDate + ", paidOnDate: " + paidOnDate + ", memo: "
                + memo + ", company: " + company + ", currency: " + currency + ", exchangeRate: " + exchangeRate
                + ", totalDiscount: " + totalDiscount + ", subTotal: " + subTotal + ", totalTaxAmount: "
                + totalTaxAmount + ", totalAmount: " + totalAmount + ", balance: " + balance + ", remoteUpdatedAt: "
                + remoteUpdatedAt + ", trackingCategories: " + trackingCategories + ", payments: " + payments
                + ", lineItems: " + lineItems + ", remoteWasDeleted: " + remoteWasDeleted + ", remoteId: " + remoteId
                + ", modifiedAt: " + modifiedAt + ", fieldMappings: " + fieldMappings + ", remoteData: " + remoteData
                + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> id = Optional.empty();

        private Optional<InvoiceType> type = Optional.empty();

        private Optional<String> contact = Optional.empty();

        private Optional<String> number = Optional.empty();

        private Optional<OffsetDateTime> issueDate = Optional.empty();

        private Optional<OffsetDateTime> dueDate = Optional.empty();

        private Optional<OffsetDateTime> paidOnDate = Optional.empty();

        private Optional<String> memo = Optional.empty();

        private Optional<String> company = Optional.empty();

        private Optional<InvoiceCurrency> currency = Optional.empty();

        private Optional<String> exchangeRate = Optional.empty();

        private Optional<Double> totalDiscount = Optional.empty();

        private Optional<Double> subTotal = Optional.empty();

        private Optional<Double> totalTaxAmount = Optional.empty();

        private Optional<Double> totalAmount = Optional.empty();

        private Optional<Double> balance = Optional.empty();

        private Optional<OffsetDateTime> remoteUpdatedAt = Optional.empty();

        private Optional<List<Optional<String>>> trackingCategories = Optional.empty();

        private Optional<List<Optional<String>>> payments = Optional.empty();

        private Optional<List<InvoiceLineItem>> lineItems = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Builder() {}

        public Builder from(Invoice other) {
            id(other.getId());
            type(other.getType());
            contact(other.getContact());
            number(other.getNumber());
            issueDate(other.getIssueDate());
            dueDate(other.getDueDate());
            paidOnDate(other.getPaidOnDate());
            memo(other.getMemo());
            company(other.getCompany());
            currency(other.getCurrency());
            exchangeRate(other.getExchangeRate());
            totalDiscount(other.getTotalDiscount());
            subTotal(other.getSubTotal());
            totalTaxAmount(other.getTotalTaxAmount());
            totalAmount(other.getTotalAmount());
            balance(other.getBalance());
            remoteUpdatedAt(other.getRemoteUpdatedAt());
            trackingCategories(other.getTrackingCategories());
            payments(other.getPayments());
            lineItems(other.getLineItems());
            remoteWasDeleted(other.getRemoteWasDeleted());
            remoteId(other.getRemoteId());
            modifiedAt(other.getModifiedAt());
            fieldMappings(other.getFieldMappings());
            remoteData(other.getRemoteData());
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<InvoiceType> type) {
            this.type = type;
            return this;
        }

        public Builder type(InvoiceType type) {
            this.type = Optional.of(type);
            return this;
        }

        @JsonSetter(value = "contact", nulls = Nulls.SKIP)
        public Builder contact(Optional<String> contact) {
            this.contact = contact;
            return this;
        }

        public Builder contact(String contact) {
            this.contact = Optional.of(contact);
            return this;
        }

        @JsonSetter(value = "number", nulls = Nulls.SKIP)
        public Builder number(Optional<String> number) {
            this.number = number;
            return this;
        }

        public Builder number(String number) {
            this.number = Optional.of(number);
            return this;
        }

        @JsonSetter(value = "issue_date", nulls = Nulls.SKIP)
        public Builder issueDate(Optional<OffsetDateTime> issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public Builder issueDate(OffsetDateTime issueDate) {
            this.issueDate = Optional.of(issueDate);
            return this;
        }

        @JsonSetter(value = "due_date", nulls = Nulls.SKIP)
        public Builder dueDate(Optional<OffsetDateTime> dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder dueDate(OffsetDateTime dueDate) {
            this.dueDate = Optional.of(dueDate);
            return this;
        }

        @JsonSetter(value = "paid_on_date", nulls = Nulls.SKIP)
        public Builder paidOnDate(Optional<OffsetDateTime> paidOnDate) {
            this.paidOnDate = paidOnDate;
            return this;
        }

        public Builder paidOnDate(OffsetDateTime paidOnDate) {
            this.paidOnDate = Optional.of(paidOnDate);
            return this;
        }

        @JsonSetter(value = "memo", nulls = Nulls.SKIP)
        public Builder memo(Optional<String> memo) {
            this.memo = memo;
            return this;
        }

        public Builder memo(String memo) {
            this.memo = Optional.of(memo);
            return this;
        }

        @JsonSetter(value = "company", nulls = Nulls.SKIP)
        public Builder company(Optional<String> company) {
            this.company = company;
            return this;
        }

        public Builder company(String company) {
            this.company = Optional.of(company);
            return this;
        }

        @JsonSetter(value = "currency", nulls = Nulls.SKIP)
        public Builder currency(Optional<InvoiceCurrency> currency) {
            this.currency = currency;
            return this;
        }

        public Builder currency(InvoiceCurrency currency) {
            this.currency = Optional.of(currency);
            return this;
        }

        @JsonSetter(value = "exchange_rate", nulls = Nulls.SKIP)
        public Builder exchangeRate(Optional<String> exchangeRate) {
            this.exchangeRate = exchangeRate;
            return this;
        }

        public Builder exchangeRate(String exchangeRate) {
            this.exchangeRate = Optional.of(exchangeRate);
            return this;
        }

        @JsonSetter(value = "total_discount", nulls = Nulls.SKIP)
        public Builder totalDiscount(Optional<Double> totalDiscount) {
            this.totalDiscount = totalDiscount;
            return this;
        }

        public Builder totalDiscount(Double totalDiscount) {
            this.totalDiscount = Optional.of(totalDiscount);
            return this;
        }

        @JsonSetter(value = "sub_total", nulls = Nulls.SKIP)
        public Builder subTotal(Optional<Double> subTotal) {
            this.subTotal = subTotal;
            return this;
        }

        public Builder subTotal(Double subTotal) {
            this.subTotal = Optional.of(subTotal);
            return this;
        }

        @JsonSetter(value = "total_tax_amount", nulls = Nulls.SKIP)
        public Builder totalTaxAmount(Optional<Double> totalTaxAmount) {
            this.totalTaxAmount = totalTaxAmount;
            return this;
        }

        public Builder totalTaxAmount(Double totalTaxAmount) {
            this.totalTaxAmount = Optional.of(totalTaxAmount);
            return this;
        }

        @JsonSetter(value = "total_amount", nulls = Nulls.SKIP)
        public Builder totalAmount(Optional<Double> totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder totalAmount(Double totalAmount) {
            this.totalAmount = Optional.of(totalAmount);
            return this;
        }

        @JsonSetter(value = "balance", nulls = Nulls.SKIP)
        public Builder balance(Optional<Double> balance) {
            this.balance = balance;
            return this;
        }

        public Builder balance(Double balance) {
            this.balance = Optional.of(balance);
            return this;
        }

        @JsonSetter(value = "remote_updated_at", nulls = Nulls.SKIP)
        public Builder remoteUpdatedAt(Optional<OffsetDateTime> remoteUpdatedAt) {
            this.remoteUpdatedAt = remoteUpdatedAt;
            return this;
        }

        public Builder remoteUpdatedAt(OffsetDateTime remoteUpdatedAt) {
            this.remoteUpdatedAt = Optional.of(remoteUpdatedAt);
            return this;
        }

        @JsonSetter(value = "tracking_categories", nulls = Nulls.SKIP)
        public Builder trackingCategories(Optional<List<Optional<String>>> trackingCategories) {
            this.trackingCategories = trackingCategories;
            return this;
        }

        public Builder trackingCategories(List<Optional<String>> trackingCategories) {
            this.trackingCategories = Optional.of(trackingCategories);
            return this;
        }

        @JsonSetter(value = "payments", nulls = Nulls.SKIP)
        public Builder payments(Optional<List<Optional<String>>> payments) {
            this.payments = payments;
            return this;
        }

        public Builder payments(List<Optional<String>> payments) {
            this.payments = Optional.of(payments);
            return this;
        }

        @JsonSetter(value = "line_items", nulls = Nulls.SKIP)
        public Builder lineItems(Optional<List<InvoiceLineItem>> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        public Builder lineItems(List<InvoiceLineItem> lineItems) {
            this.lineItems = Optional.of(lineItems);
            return this;
        }

        @JsonSetter(value = "remote_was_deleted", nulls = Nulls.SKIP)
        public Builder remoteWasDeleted(Optional<Boolean> remoteWasDeleted) {
            this.remoteWasDeleted = remoteWasDeleted;
            return this;
        }

        public Builder remoteWasDeleted(Boolean remoteWasDeleted) {
            this.remoteWasDeleted = Optional.of(remoteWasDeleted);
            return this;
        }

        @JsonSetter(value = "remote_id", nulls = Nulls.SKIP)
        public Builder remoteId(Optional<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(String remoteId) {
            this.remoteId = Optional.of(remoteId);
            return this;
        }

        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public Builder modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.of(modifiedAt);
            return this;
        }

        @JsonSetter(value = "field_mappings", nulls = Nulls.SKIP)
        public Builder fieldMappings(Optional<Map<String, JsonNode>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(Map<String, JsonNode> fieldMappings) {
            this.fieldMappings = Optional.of(fieldMappings);
            return this;
        }

        @JsonSetter(value = "remote_data", nulls = Nulls.SKIP)
        public Builder remoteData(Optional<List<RemoteData>> remoteData) {
            this.remoteData = remoteData;
            return this;
        }

        public Builder remoteData(List<RemoteData> remoteData) {
            this.remoteData = Optional.of(remoteData);
            return this;
        }

        public Invoice build() {
            return new Invoice(
                    id,
                    type,
                    contact,
                    number,
                    issueDate,
                    dueDate,
                    paidOnDate,
                    memo,
                    company,
                    currency,
                    exchangeRate,
                    totalDiscount,
                    subTotal,
                    totalTaxAmount,
                    totalAmount,
                    balance,
                    remoteUpdatedAt,
                    trackingCategories,
                    payments,
                    lineItems,
                    remoteWasDeleted,
                    remoteId,
                    modifiedAt,
                    fieldMappings,
                    remoteData);
        }
    }
}