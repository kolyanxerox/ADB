package com.iab.omid.library.applovin.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.iab.omid.library.applovin.utils.C2511g;

/* loaded from: classes2.dex */
public final class AdEvents {
    private final C2480a adSession;

    private AdEvents(C2480a c2480a) {
        this.adSession = c2480a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C2480a c2480a = (C2480a) adSession;
        C2511g.m4162a(adSession, "AdSession is null");
        C2511g.m4170g(c2480a);
        C2511g.m4165b(c2480a);
        AdEvents adEvents = new AdEvents(c2480a);
        c2480a.m3987d().m4099a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C2511g.m4165b(this.adSession);
        C2511g.m4168e(this.adSession);
        if (!this.adSession.m3991h()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m3991h()) {
            this.adSession.m3996m();
        }
    }

    public void loaded() {
        C2511g.m4161a(this.adSession);
        C2511g.m4168e(this.adSession);
        this.adSession.m3997n();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C2511g.m4162a(vastProperties, "VastProperties is null");
        C2511g.m4161a(this.adSession);
        C2511g.m4168e(this.adSession);
        this.adSession.m3985a(vastProperties.m3998a());
    }
}
