package com.merge.api;

import com.merge.api.core.ClientOptions;
import com.merge.api.core.Suppliers;
import com.merge.api.resources.accounting.AccountingClient;
import com.merge.api.resources.ats.AtsClient;
import com.merge.api.resources.crm.CrmClient;
import com.merge.api.resources.filestorage.FilestorageClient;
import com.merge.api.resources.hris.HrisClient;
import com.merge.api.resources.ticketing.TicketingClient;
import java.util.function.Supplier;

public class MergeApiClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<AtsClient> atsClient;

    protected final Supplier<CrmClient> crmClient;

    protected final Supplier<FilestorageClient> filestorageClient;

    protected final Supplier<HrisClient> hrisClient;

    protected final Supplier<TicketingClient> ticketingClient;

    protected final Supplier<AccountingClient> accountingClient;

    public MergeApiClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.atsClient = Suppliers.memoize(() -> new AtsClient(clientOptions));
        this.crmClient = Suppliers.memoize(() -> new CrmClient(clientOptions));
        this.filestorageClient = Suppliers.memoize(() -> new FilestorageClient(clientOptions));
        this.hrisClient = Suppliers.memoize(() -> new HrisClient(clientOptions));
        this.ticketingClient = Suppliers.memoize(() -> new TicketingClient(clientOptions));
        this.accountingClient = Suppliers.memoize(() -> new AccountingClient(clientOptions));
    }

    public AtsClient ats() {
        return this.atsClient.get();
    }

    public CrmClient crm() {
        return this.crmClient.get();
    }

    public FilestorageClient filestorage() {
        return this.filestorageClient.get();
    }

    public HrisClient hris() {
        return this.hrisClient.get();
    }

    public TicketingClient ticketing() {
        return this.ticketingClient.get();
    }

    public AccountingClient accounting() {
        return this.accountingClient.get();
    }

    public static MergeApiClientBuilder builder() {
        return new MergeApiClientBuilder();
    }
}
