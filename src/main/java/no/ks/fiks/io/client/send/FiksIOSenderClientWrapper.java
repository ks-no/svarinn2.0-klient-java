package no.ks.fiks.io.client.send;

import io.vavr.control.Option;
import lombok.NonNull;
import no.ks.fiks.svarinn2.klient.MeldingSpesifikasjonApiModel;
import no.ks.fiks.svarinn2.klient.SendtMeldingApiModel;
import no.ks.fiks.svarinn2.klient.SvarInnUtsendingKlient;

import java.io.InputStream;

public class FiksIOSenderClientWrapper implements FiksIOSender {

    private final SvarInnUtsendingKlient utsendingKlient;

    public FiksIOSenderClientWrapper(@NonNull final SvarInnUtsendingKlient utsendingKlient) {
        this.utsendingKlient = utsendingKlient;
    }

    @Override
    public SendtMeldingApiModel send(final MeldingSpesifikasjonApiModel metadata, final Option<InputStream> data) {
        return utsendingKlient.send(metadata, data);
    }
}